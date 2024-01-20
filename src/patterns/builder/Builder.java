package patterns.builder;

import java.util.List;

public interface Builder {
    void setName(String name);

    void setLastName(String lastName);

    void setAge(int age);

    void setSoftSkills(List<SoftSkills> softSkills);

    void setHardSkills(List<HardSkills> hardSkills);

    Programmer createProgrammer();
}
