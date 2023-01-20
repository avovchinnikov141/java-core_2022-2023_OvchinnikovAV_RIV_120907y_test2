import java.util.Scanner;

public class Timus_task1_1068 {

	public static void main(String[] args) {
		
	 Scanner in = new Scanner(System.in);
		     int c = 0;
	        
	         int f = in.nextInt();
	     
	         if (f > 0)
	         {
	             for (int i = 1; i <= f; i++)
	                 c += i;
	             System.out.println(c);
	         }
	         else if (f <= 0)
	         {
	             for (int i = f; i <= 1; i++)
	                 c += i;
	             System.out.println(c);
	         }
	         in.close();
	     }
	 }