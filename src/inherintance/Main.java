package inherintance;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        //create objects of type Student
        Student studentOne = new Student(List.of(10.0, 20.0, 30.0));
        Student studentTwo = new Student(List.of(50.00, 4.7));

        System.out.println("average of student one "+studentOne.getAverageGrade());
        System.out.println("average of student two "+studentTwo.getAverageGrade());

        System.out.println("\n**************************************************\n");

        //create objects of type naughty student
        NaughtyStudent naughtyStudentOne = new NaughtyStudent(List.of(10.0, 20.0, 30.0));
        NaughtyStudent naughtyStudentTwo = new NaughtyStudent(List.of(50.00, 4.7));

        System.out.println("average of naughty student one "+naughtyStudentOne.getAverageGrade());
        System.out.println("average of naughty student two "+naughtyStudentTwo.getAverageGrade());




    }
}
