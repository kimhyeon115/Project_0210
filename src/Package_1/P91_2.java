package Package_1;

import java.util.Scanner;

public class P91_2 {

	public static void main(String[] args) {
		System.out.println("성적 입력:");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		String kk = " ";
		if(a>=70) {kk="합격";}
		else {kk="불합격";}
		System.out.println("성적은:" + a);
		System.out.println("결과는:" + kk);
	}

}
