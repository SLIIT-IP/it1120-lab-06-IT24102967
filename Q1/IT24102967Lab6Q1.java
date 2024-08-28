import java.util.Scanner;

public class IT24102967Lab6Q1
{
   
     public static void main(String[] args){
	 
	 Scanner sc = new Scanner (System.in);
	 
	 System.out.print("Enter a number:");
	 Double number = sc.nextDouble();
	 
	 Double square = Math.pow(number, 2);
	 Double squareroot = Math.sqrt(number);
	 System.out.println("The square of "+number + " is: " + square);
	 System.out.println("The square root of"+ number + " is: " + squareroot);
    }
}
