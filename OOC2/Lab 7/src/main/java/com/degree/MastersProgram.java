package com.degree;
import static com.degree.DegreeType.RegularThesis;

public class MastersProgram {
    private IMastersProgram type;

    public MastersProgram(DegreeType type, String major) {
        MastersFactory ms = new MastersFactory();
        this.type = ms.chooseMasterprogram (type,major);
    }

    public boolean isEligible(float cgpa, String major) {
        return type.isEligible(cgpa,major) ;
    }

    public int getMarks(int theoryMarks, int thesisMarks, int projectMarks) {
        return type.getMarks(theoryMarks, thesisMarks, projectMarks);
    }


}
