import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    float num[] = new float[5];
    float numY[] = new float[5];
    
    for(int i=0;i<5;i++){
      System.out.println("Digite um número:");
      num[i] = entrada.nextFloat();   
      numY[i] = (num[i]/2);
    }

    for(int i=0; i<5; i++){
     System.out.println("O "+ i +"º número do vetor X é: "+num[i]);
      System.out.println("O "+ i +"º número do vetor Y é: "+numY[i]);
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
