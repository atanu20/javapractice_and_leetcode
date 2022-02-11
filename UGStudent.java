
abstract class Student {
    private String name;

    public Student(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }
}

public class UGStudent extends Student {
    private int projectMarks;

    public UGStudent(int mark) {
        super("abc");
        this.projectMarks = mark;
    }

    public static void main(String[] args) {
        Student s = new UGStudent(85);
        System.out.println(s.getName());
    }

}
