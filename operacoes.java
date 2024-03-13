import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    float num1, num2;
    int codigo;
    System.out.print("Digite dois números:");
    num1 = entrada.nextFloat();
    num2 = entrada.nextFloat();

    System.out.println("Digite a operação desejada:");
    System.out.println("1 - Adição");
    System.out.println("2 - Subtração");
    System.out.println("3 - Multiplicação");
    System.out.println("4 - Divisão");

    codigo = entrada.nextInt();

    switch(codigo){
      case 1:
        System.out.println("Resultado: " + (num1 + num2));
        break;
      case 2:
        System.out.println("Resultado: " + (num1 - num2));
        break;
      case 3:
        System.out.println("Resultado: " + (num1 * num2));
        break;
      case 4:
        if (num2 == 0){
          System.out.println("Não é possível dividir por zero!");
        } else {
        System.out.println("Resultado: " + (num1 / num2));
        }
        break;
      default:
        
    }
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
