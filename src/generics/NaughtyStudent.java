package generics;

import java.util.List;

public class NaughtyStudent extends Student {


    public NaughtyStudent(List<Double> grades, String name, Level level) {
        super(grades, name, level); //super will call the constructor of the parent class (which is student)
    }

    @Override
    public double getAverageGrade() {
        double averageGrade = super.getAverageGrade(); // this will call the getAverageGrade in the parent class

        //we then find 10% of the average grade and add it to the average grade
        return averageGrade * 0.10 + averageGrade;
    }
}
