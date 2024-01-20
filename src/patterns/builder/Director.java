package patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Director {
    public Builder createJunior(Builder builder) {
        List<SoftSkills> softSkills = new ArrayList<>();
        softSkills.add(SoftSkills.TELLING);
        softSkills.add(SoftSkills.FAST_LEARNING);
        builder.setSoftSkills(softSkills);
        List<HardSkills> hardSkills = new ArrayList<>();
        hardSkills.add(HardSkills.JAVA);
        builder.setHardSkills(hardSkills);
        return builder;
    }
}
