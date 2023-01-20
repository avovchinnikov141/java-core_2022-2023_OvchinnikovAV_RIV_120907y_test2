import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		  
	        System.out.println("Введите число:");
	        int a = in.nextInt();
	        if (a%3 == 2 && a%7 ==1) {
	        	  System.out.printf("Число соответствует критериям:\nпри делении на 5 в остатке получается 2\nпри делении на 7 в остатке получается 1");
	        } else System.out.printf("Число не соответствует критериям:\nпри делении на 5 в остатке получается 2\nпри делении на 7 в остатке получается 1");
	         in.close();
	        
	     }
	}
