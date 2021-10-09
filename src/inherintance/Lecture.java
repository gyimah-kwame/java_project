package inherintance;

import java.util.ArrayList;
import java.util.List;

public class Lecture {


    private List<Student> students;


    /**
     * we create (instantiate) a list  in the constructor to store the student
     */
    public Lecture() {
        students = new ArrayList<>();
    }

    /**
     * this method accepts a student and adds it to the students list
     *
     * @param student
     */
    public void enter(Student student) {
        students.add(student); //add student to the list of student
    }


    /**
     * find the highest average in the list of students
     *
     * @return highest average
     */
    public double getHighestAverageGrade() {
        double highestAverage = 0;

        for (Student student : students) {
            if (student.getAverageGrade() > highestAverage) {
                highestAverage = student.getAverageGrade();
            }
        }

        return highestAverage;
    }
}
