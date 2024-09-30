import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
      float n;
        
        System.out.println("Digite o raio do circulo: ");
          n = sc.nextFloat();

    if (n > 0){
      System.out.println("A area do circulo é: " + (3.14 * (n * n)));
    }else{
      System.out.println("O raio não pode ser negativo");
    }

    
  }

 
}
