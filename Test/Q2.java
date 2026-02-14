import java.util.Scanner;

public class factorial_number {
	
	public static void main(String[] args) {
		int num;
		System.out.println("factorial series is: ");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		
		int f=1;
		System.out.println("Factorial series is: ");
		for(int i=1;i<=num;i++)
		{
			f*=i;
			System.out.println(i+"="+f);
		}
	}

}
