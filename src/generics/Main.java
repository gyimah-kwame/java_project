package generics;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        //create objects of type Student
        Student studentOne = new Student(List.of(10.0, 20.0, 30.0), "student one", Level.SECONDARY);
        Student studentTwo = new Student(List.of(50.00, 4.7), "student two", Level.JHS);


        System.out.println("average of student one "+studentOne.getAverageGrade());
        System.out.println("average of student two "+studentTwo.getAverageGrade());

        System.out.println("\n**************************************************\n");

        //create objects of type naughty student
        NaughtyStudent naughtyStudentOne = new NaughtyStudent(List.of(10.0, 20.0, 30.0), "naughty student one", Level.PRIMARY);
        NaughtyStudent naughtyStudentTwo = new NaughtyStudent(List.of(50.00, 4.7), "naughty student two", Level.TERTIARY);

        System.out.println("average of naughty student one "+naughtyStudentOne.getAverageGrade());
        System.out.println("average of naughty student two "+naughtyStudentTwo.getAverageGrade());

        System.out.println("\n**************************************************\n");

        List<Nameable> nameables = List.of(studentOne, studentTwo, naughtyStudentOne, naughtyStudentTwo);

        Register register = new Register(nameables);

        System.out.println(register.getRegister());

        System.out.println("\n**************************************************\n");

        System.out.println(register.getRegisterByLevel(Level.SECONDARY));
        System.out.println(register.getRegisterByLevel(Level.TERTIARY));
        System.out.println(register.getRegisterByLevel(Level.PRIMARY));
        System.out.println(register.getRegisterByLevel(Level.JHS));


    }
}
