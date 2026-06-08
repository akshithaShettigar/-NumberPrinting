//Print numbers from 1 to 100
import java.util.Scanner;
class Numbers{
	int n;
	Numbers(int n){
		this.n=n;
	}
	void calculation(){ 
		for(int i=0;i<=n;i++)
			System.out.print("\t"+i);
	}
}
class NumberMain{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		Numbers p1= new Numbers(n);
		p1.calculation();

	}
}
