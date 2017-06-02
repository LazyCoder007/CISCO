import java.util.InputMismatchException;
import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
          System.out.print("Enter number : ");
          try{
          int a= sc.nextInt();
          System.out.println("Sum  of digits of "+a +" is : "+sumOfDigits(a));
          }
          catch(InputMismatchException e){
        	  System.out.println("Please Enter only Numbers");
          }
          }
	public static int sumOfDigits(int number){
		int p=number,n=0;
		while(p>0){
			 n=n+p%10;
			 p=p/10;      
		 }	  
		return n;
		
	}

}
