import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
      int[] n = new int[10]; //Não sei como deixar o tamanho do array para ler infinitamente.
        int i = 0;
    
    while (i < 10) {
      System.out.println("Digite um número: ");
        n[i] = sc.nextInt();
          if (n[i] < 0) {
            break;
          }
            i++;
            
      }
    Arrays.sort(n);
        System.out.println("O menor número digitado foi: " + n[0]);
          System.out.println("O maior número digitado foi: " + n[9]); 
    } 
  }
