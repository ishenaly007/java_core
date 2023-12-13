package abstracsia;

public class Dog extends Animal {

    public void voice(String angryVoice) {
        System.out.println();
    }

    public void voice(int numberOfVoice) {
        System.out.println();
    }

    @Override
    public void voice() {
        System.out.println("Gav gav");
    }
}
