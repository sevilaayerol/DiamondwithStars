import java.util.Scanner;

public class stars {

	public static void main(String[] args) {
	    Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Say� Giriniz :");
        int n = klavye.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
         for (int x = n; x >= 1; x--) {
                for (int k = n; (k > x - 1); k--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2*x-1); j++) {
                        System.out.print("*");
                }
                System.out.println();
            }
      
        
        }

	}


	
