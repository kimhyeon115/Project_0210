package Package_1;

public class P74 {

	public static void main(String[] args) {
		int j = 20;
		int i = 10;
		j = i++;				//j=i >> i=i+1
		System.out.println(j);
		System.out.println(i);
		int k1 = 20;
		int k2 = 30;
		k1 = ++k2;				//k2=k2+1 >> k1=k2
		System.out.println(k1);
		System.out.println(k2);
	}

}
