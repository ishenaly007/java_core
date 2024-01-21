package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        User user = new User("Ishen", 17);
        Class<User> userClass = User.class;
        System.out.println(userClass.getSuperclass());

        Class<? extends User> userClassObject = user.getClass();
        System.out.println(userClassObject.equals(userClass));

        Field field = userClass.getDeclaredField("password");
        field.setAccessible(true);//hacking private fields ♥
        System.out.println(field.get(user));

        field.set(user, "not_secret_password");//изменяем пароль...
        System.out.println(user.getPassword());

        Method method = userClass.getDeclaredMethod("purchase");

        System.out.println(method.getName());//узнаем про метод
        System.out.println(Arrays.toString(method.getDeclaredAnnotations()));
        System.out.println(method.getReturnType());

        int modifier = method.getModifiers();//проверяем доступность
        System.out.println(Modifier.isPublic(modifier));
        System.out.println(Modifier.isVolatile(modifier));

        method.invoke(user);//запускаем метод через рефлексию
    }
}
