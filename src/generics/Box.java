package generics;

public class Box<T> { //may extends Number (if you want only nums)
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void getDouble(Box<?> asasa) {
        //you may do this when it wants exactly this one type
        System.out.println(asasa);
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("asas");
        System.out.println(stringBox.getItem());
        //stringBox.setItem(12); error

        Box<Integer> integerBox = new Box<>();
        integerBox.getDouble(stringBox);
        integerBox.setItem(12);
        System.out.println(integerBox.getItem());
        //integerBox.setItem("asas"); error
    }
}
