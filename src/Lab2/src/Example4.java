import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		  
	        System.out.println("Введите число от 5 до 10 включительно:");
	        int a = in.nextInt();
	        if (a<=10 && a>=5) {
	        	  System.out.printf("Число в диапазоне от 5 до 10");
	        } else System.out.printf("Число не в диапазоне от 5 до 10");
	         in.close();
	        
	}

}
