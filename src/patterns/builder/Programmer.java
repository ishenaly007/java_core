package patterns.builder;

import java.util.List;


public class Programmer {
    private String name;
    private String lastName;
    private int age;
    private List<SoftSkills> softSkills;
    private List<HardSkills> hardSkills;

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", softSkills=" + softSkills +
                ", hardSkills=" + hardSkills +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<SoftSkills> getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(List<SoftSkills> softSkills) {
        this.softSkills = softSkills;
    }

    public List<HardSkills> getHardSkills() {
        return hardSkills;
    }

    public void setHardSkills(List<HardSkills> hardSkills) {
        this.hardSkills = hardSkills;
    }

    public Programmer(String name, String lastName, int age, List<SoftSkills> softSkills, List<HardSkills> hardSkills) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.softSkills = softSkills;
        this.hardSkills = hardSkills;
    }

    public static void main(String[] args) {
        Builder builder = new ProgrammerBuilder();
        Director director = new Director();
        builder = director.createJunior(builder);
        builder.setName("Ishenaly");
        System.out.println(builder.createProgrammer());
    }
}