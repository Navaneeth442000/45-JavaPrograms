import java.util.Scanner;

public class Check {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sn.nextInt();
		if(num>=0)
		{
			System.out.println("Number is Positive");
		}
		else
		{
			System.out.println("Number is Negative");
		}
	}

}
