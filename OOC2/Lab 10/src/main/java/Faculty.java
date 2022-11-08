import java.util.*;

@DevelopmentHistory(version = 1, developer = "nibir", tester = "mahdin")
public class Faculty {
    String name;
    String designation;
    int salary;
    List<Course> courses = new ArrayList<>();

    @DevelopmentHistoryWithReview(developmentHistory = @DevelopmentHistory(developer = "nibir"), reviewers = {"X", "Y", "Z"})
    public Faculty(String name, String designation, int salary, List<Course> courses){
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.courses = courses;
    }

    @DevelopmentHistoryWithReview(developmentHistory = @DevelopmentHistory(developer = "nibir"), reviewers = {"X"})
    public Faculty(String name, String designation, int salary){
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    @DevelopmentHistoryWithReview(developmentHistory = @DevelopmentHistory(developer = "nibir"), reviewers = {"y"})
    public void teach(Course course){
        System.out.println("Mr. " + name + "is teaching this "+ course);
    }


    @DevelopmentHistoryWithReview(developmentHistory = @DevelopmentHistory(developer = "nibir"), reviewers = {"Z"})
    public void research(String topic){
        System.out.println("Mr. " + name + "is researching this "+topic);
    }


}
