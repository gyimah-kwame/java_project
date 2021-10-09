package basic_java;

import java.util.List;

public class Student {


    private List<Double> grades; //instance variable

    /**
     * Constructor (automatically called when an object is created)
     *
     * @param grades grades being passed to the class when being instantiated
     */
    public Student(List<Double> grades) {
        this.grades = grades; //we assign the grades(parameter) passed to the instance variable so we can use it the class
    }

    public double getAverageGrade() {
        double sum = 0; //declare sum and assign 0 to it cos we need a starting point of our summation

        //loop through the grades list and add the each element to the current value of sum
        for (Double grade : grades) {
            sum = sum + grade;
        }

        return sum/grades.size();
    }
}
