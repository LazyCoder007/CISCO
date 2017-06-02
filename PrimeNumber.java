import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int a=sc.nextInt();
        checkPrime(a);

	}
	public static void checkPrime(int number){
		int i,flag=0;
		if(number==1||number ==2){
			System.out.println(number +" is Prime");
		    }
	    else {
			for(i=2;i<=number/2;i++){
	          if(number%i==0){
	        	  flag=1;
	          }
		   } 
	          if(flag==1){
	        	  System.out.println(number+" is not Prime");
	           }
	          else{ 
	        		  System.out.println(number+" is Prime");
	        	  }
	        	  
		}		
	}
}
