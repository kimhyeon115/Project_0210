package Package_1;

public class p120 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		for(;;) {
			sum += i;
			if(i==100) {break;}
			i++;
		}
		System.out.println("1부터 100까지의 합은:" + sum);
	}

}
