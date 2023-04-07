package Package_1;

public class P119 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(true) {	//무한루프
			sum += i;
			if(i==10) {break;}//i == 10 (i는 변수,대입이X,조건식O)
			i++;
		}
		System.out.println("1부터 100까지의 합:" + sum);
	}

}
