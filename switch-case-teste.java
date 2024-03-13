import java.util.Scanner;

  // USANDO SWICTH CASE

public class Main{
  public static void main(String[] args){

  Scanner entrada = new Scanner(System.in);
  int codigo, quantidade;

  System.out.println("Digite o código do produto e a quantidade adquirida:");
  codigo = entrada.nextInt();
  quantidade = entrada.nextInt();

    switch(codigo) {
      case 0:
        System.out.println("Cachorro Quente");
        System.out.println("Total: R$" + (quantidade * 1.50));
        break;
        
      case 1:
        System.out.println("Refrigerante");
        System.out.println("Total: R$" + (quantidade * 2));
        break;
        
      default:
        System.out.println("Produto não cadastrado.");
        
        
    }
}
}
