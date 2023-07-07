public class Q4_PolymorphismExample_compileTime {
    public static void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum of two integers: " + sum);
    }

    public static void add(double num1, double num2) {
        double sum = num1 + num2;
        System.out.println("Sum of two doubles: " + sum);
    }

    public static void add(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println("Sum of three integers: " + sum);
    }

    public static void main(String[] args) {
        add(5, 10);
        add(2.5, 3.7);
        add(1, 2, 3); 
    }
}
