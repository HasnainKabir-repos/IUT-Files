package com.degree;

public class Executive implements IMastersProgram{
    String major;
    public Executive(String major){
        this.major = major;
    }
    public boolean isEligible(float cgpa, String major){
        return (cgpa >= 3.75 || this.major.equals(major));
    }

    public int getMarks(int theoryMarks, int thesisMarks, int projectMarks){
        return theoryMarks;
    }
}
