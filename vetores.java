import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int num[] = new int[10];

    for (int i = 0; i < 10; i++) {
      System.out.println("Digite um número:");
      num[i] = entrada.nextInt();

    }

    for (int i = 0; i < 10; i++) {
      if (num[i] % 2 == 0)
        System.out.println("O número " + num[i] + " é par.");

    }

  }

}
