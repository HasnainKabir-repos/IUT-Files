package com.degree;

import static com.degree.DegreeType.RegularThesis;

public class MastersFactory {
    public IMastersProgram chooseMasterprogram (DegreeType type,String major) {
        IMastersProgram master;
        if(type.equals(RegularThesis)) {
            master = new RegularThesis(major);
        } else if (type.equals(DegreeType.RegularNonThesis)) {
            master = new RegularNonThesis(major);
        } else master = new Executive(major);

        return master;
    }
}
