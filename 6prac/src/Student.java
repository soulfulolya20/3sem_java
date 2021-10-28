
public class Student implements Comparable<Student> {

    protected final String name;
    protected final Integer iD;

    public Student(String name, int iD) {
        this.name = name;
        this.iD = iD;
    }

    @Override
    public int compareTo(Student o) {
        return this.iD.compareTo(o.iD);
    }

    @Override
    public String toString() {
        return "Student: " + this.name + ". ID: " + this.iD;
    }
}

