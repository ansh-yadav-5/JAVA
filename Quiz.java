import java.util.Scanner;
import java.util.Random;

public class Quiz {

  public static void main(String[] args) {
    int n,score = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number of question");
    n = input.nextInt();
    char[] operators = {'+', '-', '*', '/'};
    Random rand = new Random();
    for (int i = 1; i <= n; i++) {
      int num1 = rand.nextInt(10) ;
      int num2 = rand.nextInt(10) ;
      int op = rand.nextInt(4);
      System.out.println("Question " + i + ": " + num1 + " " + operators[op] + " " + num2);
      int answer = input.nextInt();
      int correctAnswer;
      switch (op) {
        case '+':
          correctAnswer = num1 + num2;
          break;
        case '-':
          correctAnswer = num1 - num2;
          break;
        case '*':
          correctAnswer = num1 * num2;
          break;
        case '/':
          correctAnswer = num1 / num2;
          break;
        default:
          correctAnswer = 0;
      }
      if (answer == correctAnswer) {
        score++;
      }
    }
    System.out.println("Your score is: " + score);
  }
}