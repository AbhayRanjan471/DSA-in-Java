package If_else;
import java.util.Scanner;

public class TotelSalary {

	public static void main(String[] args) {
		
//		Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and 
//		the grade (an uppercase character), and depending upon which the total salary is calculated as -
//	    totalSalary = basic + hra + da + allow – pf
//	where :
//	hra   = 20% of basic
//	da    = 50% of basic
//	allow = 1700 if grade = ‘A’
//	allow = 1500 if grade = ‘B’
//	allow = 1300 if grade = ‘C' or any other character
//	pf    = 11% of basic.
//	Round off the total salary and then print the integral part only
		
		Scanner s=new Scanner(System.in);
		int basic=s.nextInt();
		char grade=s.next().charAt(0);
		
		double hra= (0.2*basic);
		double da=(0.5*basic);
		double pf= (0.11*basic);
		
		if(grade=='A')
		{
			double totalSalary=basic+hra+da+1700-pf;
			totalSalary=Math.round(totalSalary);
			System.out.println((int)totalSalary);
		}
		else if(grade=='B')
		{
			double totalSalary=basic+hra+da+1500-pf;
			totalSalary=Math.round(totalSalary);
			System.out.println((int)totalSalary);
		}
		else		 
		{
			double totalSalary=basic+hra+da+1300-pf;
			totalSalary=Math.round(totalSalary);
			System.out.println((int)totalSalary);
		}
		
	}

}
