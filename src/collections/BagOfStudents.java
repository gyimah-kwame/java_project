package collections;

import java.util.ArrayList;
import java.util.List;

public class BagOfStudents {

    private List<Student> students;

    public BagOfStudents() {
        students = new ArrayList<>();
    }

    public void add(Student student) {
        students.add(student);
    }

    public void remove(Student student) {
        students.remove(student);
    }

    public void clear() {
        students.clear();
    }
}
