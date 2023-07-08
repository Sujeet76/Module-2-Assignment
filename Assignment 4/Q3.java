@FunctionalInterface
interface Calculator {
  int calculate(int a, int b);
}

public class Q3 {
  public static void main(String[] args) {
    Calculator addition = (a, b) -> a + b;
    Calculator subtraction = (a, b) -> a - b;
    int result1 = addition.calculate(5, 3);
    int result2 = subtraction.calculate(8, 4);

    System.out.println("Result of addition: " + result1);
    System.out.println("Result of subtraction: " + result2);
  }
}
