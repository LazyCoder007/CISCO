import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int a=sc.nextInt();
        fibonacciSeries(a);   
	}
	public static void fibonacciSeries(int limit){
		int a=0,b=1,c=1;
		if(limit<=1)
			System.out.println(b);
		else {
			
		System.out.print("Fibonaci Series unitll "+limit+" is : ");
		while(c<limit){
			System.out.print(c+" ");
			c=a+b;
             a=b;
             b=c;
		}
		}
	}

}
