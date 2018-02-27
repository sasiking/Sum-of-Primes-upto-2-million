import java.util.Scanner;
public class PriSum{
	public static void main(String[] args){
		int i,j,n,fac;
		long mysum=0;
		Scanner in = new Scanner(System.in);		
		System.out.println("Enter any number");
		n = in.nextInt();
		
		for(i = 2;i<=n;i++){
			fac=0;
			for(j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					fac++;
				    break;
			}
			}
			if(fac==0)
				mysum += i;
		}
		System.out.println("Sum of Prime Numbers upto "+n+" = "+mysum);
	}
}