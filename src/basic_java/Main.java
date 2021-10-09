package basic_java;


import java.util.List;

public class Main {

    public static void main(String[] args) {


        //create objects of type Student
        Student studentOne = new Student(List.of(10.0, 20.0, 30.0));
        Student studentTwo = new Student(List.of(50.00, 4.7));

        System.out.println("average of student one "+studentOne.getAverageGrade());
        System.out.println("average of student two "+studentTwo.getAverageGrade());

        //create a lecture object
        Lecture math = new Lecture();

        //add student to lecture
        math.enter(studentOne);
        math.enter(studentTwo);

        //get the highest average
        System.out.println("highest average is "+math.getHighestAverageGrade());


    }
}
