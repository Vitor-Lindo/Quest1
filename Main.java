import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Informe a base");
    int n1=entrada.nextInt();
    System.out.println("Informe o expoente");
    int n2=entrada.nextInt();
    int aux=0;
    aux=n1;

    for(int i=2; i<=n2; i++){
      n1=aux*n1;
    }
    
    System.out.println("O resultado eh");
    System.out.println(n1);
  }
}