import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Timus_task2_ {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.####");
		        df.setRoundingMode(RoundingMode.CEILING);
		int a=in.nextInt();
		long[] k=new long[a];
		for(int j=0; j<a; j++){
		k[j]=in.nextLong();
		}

		double[] l=new double[a];
		for(int c=0;c<a; c++){
		l[c]=Math.sqrt(k[c]);
		}
		for(int j=a-1; j>=0; j--){

		System.out.println(df.format(l[j]));
		}
		}
		}
