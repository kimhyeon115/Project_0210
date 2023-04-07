package Package_1;

import java.util.Scanner;

public class P91 {

	public static void main(String[] args) {
		System.out.println("성적 입력:");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		String kk = " ";
		kk = (a>=70) ? "합격" : "불합격";
		System.out.println("점수는:" + a);
		System.out.println("결과는:" + kk);
	}

}
