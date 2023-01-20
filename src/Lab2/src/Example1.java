import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		  
	        System.out.println("Введите число, а я проверю делится ли оно нацело на 3");
	        int a = in.nextInt();
	        if (a%3 == 0) {
	        	  System.out.printf("Делится");
	        } else System.out.printf("Не делится");
	         in.close();
	        
	     }
	}


