import java.util.Comparator;

public class Student{

    public enum Program{CSE, SWE, IT}
    float cgpa;

    String studentId;
    String name;

    Student(String studentId, String name, float cgpa) throws InvalidStudentIdException {
        setStudentId(studentId);
        this.name = name;
        this.cgpa = cgpa;
    }
    public float getCgpa() {
        return cgpa;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) throws InvalidStudentIdException {

        if(studentId.length() == 9)
            this.studentId = studentId;
        else{
            throw new InvalidStudentIdException("StudentId is invalid");
        }
    }

    public void study(){
        System.out.println("I am studying");
    }

    public void play(){
        System.out.println("I am playing");
    }

    public static Comparator<Student> orderById = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            String id1 = o1.getStudentId().toUpperCase();
            String id2 = o2.getStudentId().toUpperCase();

            return id2.compareTo(id1);
        }
    };

    public static Comparator<Student> orderByName = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            String name1 = o1.getName().toUpperCase();
            String name2 = o2.getName().toUpperCase();

            return name2.compareTo(name1);
        }
    };

    public static Comparator<Student> orderByCgpa = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            float cgpa1 = o1.getCgpa();
            float cgpa2 = o2.getCgpa();

            return Float.compare(cgpa1, cgpa2);
        }
    };

    public static Comparator<Student> orderByIdAndCgpa = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            String id1 = o1.getName();
            String id2 = o2.getName();

            int comp1 = id2.compareTo(id1);

            if(comp1!=0) return comp1;

            float cgpa1 = o1.getCgpa();
            float cgpa2 = o2.getCgpa();

            return Float.compare(cgpa1, cgpa2);
        }
    };

    @Override
    public String toString() {
        return "StudentID: "+ studentId + " Name: "+ name+ " CGPA: "+cgpa;
    }
}
