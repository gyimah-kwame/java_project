package collections;

import java.util.*;

public class Register {

    List<? extends Student> nameables; //instance variable


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
     * @return list of names
     */
    public List<String> getRegister() {
        List<String> names = new ArrayList<>(); // create a temporal list to hold our names

        for (Nameable nameable : nameables) { //loop through list of nameables
            names.add(nameable.getName()); // add the name of each nameable to the list we created earlier
        }

        return names; //return a list of names
    }

    /**
     *
     * method refactoring
     *
     * @param level level
     * @return a list of student's names
     */
    public Map<Level, List<Student>> getRegisterByLevel(Level level) {
        List<Student> students = new ArrayList<>();

        for (Student student : nameables) {
            if (student.getLevel() == level) {
                students.add(student);
            }
        }

        Map<Level, List<Student>> map = new HashMap<>();
        map.put(level, students);

        return map;
    }

    public List<? extends Student> sort(Comparator<Student> comparator) {
       nameables.sort(comparator);
       return nameables;
    }

    public String printReport() {

        return null;
    }
}
