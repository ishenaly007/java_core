package abstracsia;

public class AnimalWorld {
    public void getAnimalVoice(Animal animal){animal.voice();}

    public static void main(String[] args) {
        AnimalWorld animalWorld = new AnimalWorld();
        Dog dog = new Dog();
        Cat cat = new Cat();
        animalWorld.getAnimalVoice(dog);
        animalWorld.getAnimalVoice(cat);

    }
}
