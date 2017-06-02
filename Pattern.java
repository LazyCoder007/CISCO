
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(7);
	}
	public static void printPattern(int number ){
		int i,j,p=number;
		for(i=1;i<2*number;i++){
			if(i<=p){
				for(j=1;j<=i;j++){
					System.out.print(j+" ");
				}
				System.out.println();	
			}
			else{
				for(j=1;j<p;j++){
					System.out.print(j+" ");
				}
				System.out.println();	
				p--;
				
			}
			
		}
		
	}

}
