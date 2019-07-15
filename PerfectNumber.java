import java.util.Scanner;
class PerfectNumber {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numberToCheck = s.nextInt();
    if(numberToCheck == sumOfDivisors(numberToCheck)) {
      System.out.println("Yup!");
    }
    else {
      System.out.println("No..;(");
    }
  }
  public static int sumOfDivisors(int number) {
    int sum = 1;
    for(int i = 2; i < Math.sqrt(number); i++) {
      if(number % i == 0) {
        sum = sum + i + number / i;
      }
    }
    return sum;
  }
}
