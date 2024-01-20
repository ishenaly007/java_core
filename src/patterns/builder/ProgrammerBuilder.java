package patterns.builder;

import java.util.List;

public class ProgrammerBuilder implements Builder {
    private String name;
    private String lastName;
    private int age;
    private List<SoftSkills> softSkills;
    private List<HardSkills> hardSkills;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setSoftSkills(List<SoftSkills> softSkills) {
        this.softSkills = softSkills;
    }

    @Override
    public void setHardSkills(List<HardSkills> hardSkills) {
        this.hardSkills = hardSkills;
    }

    @Override
    public Programmer createProgrammer() {
        return new Programmer(name, lastName, age, softSkills, hardSkills);
    }
}
