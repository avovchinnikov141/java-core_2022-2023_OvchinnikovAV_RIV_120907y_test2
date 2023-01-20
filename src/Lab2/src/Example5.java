import java.util.Scanner;

public class Example5 {


	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		  
	        System.out.println("Введите число:");
	        float a = in.nextFloat();
	        System.out.printf("тысяч во введенном пользователем числе\n(определяется четвертая цифра справа в десятичном представлении числа) = %.2f",
	        (a/1000)%10);
	        in.close();
	        
	}

}
