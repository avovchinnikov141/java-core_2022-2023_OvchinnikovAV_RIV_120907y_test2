import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		  
	        System.out.println("Введите число:");
	        int a = in.nextInt();
	        if (a>10 && a%4 == 0) {
	        	  System.out.printf("Число соответствует критериям:\nчисло делится на 4\nоно не меньше 10");
	        } else System.out.printf("Число не соответствует критериям:\nчисло делится на 4\nоно не меньше 10");
	         in.close();
	        
	}

}
