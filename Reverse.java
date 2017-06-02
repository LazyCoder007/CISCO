import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Scanner sc=new Scanner(System.in);
              System.out.print("Enter number to be Reversed: ");
              int a= sc.nextInt();
              System.out.println("Reverse of "+a +" is : "+reverseNumber(a));
	}
  public static int reverseNumber(int number){
	  int p=number,n=0;
	 while(p>0){
		 n=n*10+p%10;
		 p=p/10;      
	 }	  
	  return n;
  }
}