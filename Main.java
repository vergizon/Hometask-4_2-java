public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double indexBmi = service.calculate(62.4, 1.62);
        System.out.println(indexBmi);
    }
}
