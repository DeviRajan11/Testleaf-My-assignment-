package week1day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n= 10;
		int i=0;
		int j=1;
		System.out.print(i+" ");
		System.out.print(j+" ");
		for(int k=1; k<n; k++)
		{
			k= i+j;
			System.out.print(k+" ");
			i=j;
			j=k;
					
		}

	}

}
