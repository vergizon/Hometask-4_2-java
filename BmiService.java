public class BmiService {
    public double calculate(double weight, double height) {
        double y = height * height;
        double indexBmi = weight / y;
        return indexBmi;
    }
}


