package streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Register {

    private  List<? extends Student> nameables; //instance variable


    /**
     * we pass in a list of nameables to the class when instantiating it
     *
     * @param nameables list of students
     */
    public Register(List<? extends Student> nameables) {
        this.nameables = nameables;
    }

    /**
     * this method loops through a list of nameable objects and extracts the names by calling getName() method
     *
     *
     * @return list of names using streams
     */
    public List<String> getRegister() {

        return nameables.stream().map(Student::getName).collect(Collectors.toList());

    }

    /**
     *
     * method refactoring
     *
     * @param level level
     * @return a list of student's names using streams
     */
    public Map<Level, List<String>> getRegisterByLevel(Level level) {

        List<String> students = nameables.stream().filter(x -> x.getLevel() == level)
                .map(Student::getName)
                .collect(Collectors.toList());

        Map<Level, List<String>> map = new HashMap<>();
        map.put(level, students);

        return map;
    }

    public List<? extends Student> sort(Comparator<Student> comparator) {
       nameables.sort(comparator);
       return nameables;
    }


    public String getStudentName(Student student) throws StudentNotFoundException {

        Student st = nameables.stream().filter(s -> s == student).collect(Collectors.toList()).get(0);

        if (st == null) {
            throw new StudentNotFoundException("sorry student not found");
        }
        return student.getName();
    }

    public double getHighestGrade() {
        return nameables.stream()
                .map(Student::getGrades)
                .flatMapToDouble(DoubleStream::sorted)
                .max()
                .getAsDouble();

    }

    public List<Double> getAllAverages() {
        return nameables.stream().map(Student::getAverageGrade).collect(Collectors.toList());
    }

    public List<Double> getGradesAboutSixty() {
        return null;
//       nameables.stream()
//                .map(Student::getGrades)
//                .flatMapToDouble(DoubleStream::sorted)
//                .filter(x -> x > 60)
//                .collect(Collectors.toList());
    }

    public String printReport() {

        return null;
    }
}
