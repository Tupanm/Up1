import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
      float n;
        
        System.out.println("Digite um número: ");
          n = sc.nextFloat();

    if (n > 0){
      System.out.println("O número é Positivo");
    }else if(n == 0){
      System.out.println("O número é Neutro");
    }
    else{
      System.out.println("O número é Negativo");
    }

    
  }

 
}
