//Convert Celsius to Fahrenheit: Write a program to convert a temperature from Celsius to Fahrenheit.
//c*9/5+32
import java.util.*;
public class conversion 
{

	public static void main(String[] args) 
	{
		double c,f;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the temperature in celsius ");
		c=sc.nextDouble();//Taking input
		
		//converting it from celsius to Fahrenheit
		
		f=(c*9/5)+32;
		
		System.out.println("The temperature in fahrenheit  is "+f);

	}

}
//