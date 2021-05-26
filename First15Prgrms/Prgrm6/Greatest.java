import java.util.Scanner;

public class Greatest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1+" is largest");
		
		}
		else if(num2>num3)
		{
		System.out.println(num2+" is largest");
		}
		else
		{
			System.out.println(num3+" is largest");
		}

	}
}
