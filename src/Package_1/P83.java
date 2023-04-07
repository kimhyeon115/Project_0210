package Package_1;

public class P83 {

	public static void main(String[] args) {
		double a = 78.5;
		double b = 7.1255;
		System.out.println(Math.round(a));
		System.out.println(Math.round(b*1000)/1000);
		System.out.println(Math.round(b*1000)/1000.0);
		//7.1255*1000 > 7125.5 > 소수점 1자리에 반올림 > 7.1255/1000
	}

}
