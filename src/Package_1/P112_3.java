package Package_1;

public class P112_3 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=0; i<=100; i++) {
			if(i%2==1) {sum += i;}
		}
		System.out.println("1부터 100까지의 홀수의 합은:" + sum);
		
		int sum2 = 0;
		for(int j=0; j<=100; j++) {
			if(j%2==0) {continue;}
			sum2 += j;
		}
		System.out.println("1부터 100까지의 홀수의 합은:" + sum);
	}

}