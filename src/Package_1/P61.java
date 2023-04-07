package Package_1;

import java.util.Scanner;

public class P61 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("이름 입력:");
		String name = scn.nextLine();
		System.out.println("국어 점수 입력:");
		int mat = scn.nextInt();
		System.out.println("수학 점수 입력:");
		int kor = scn.nextInt();
		int total = mat + kor;
		int avg = total / 2;
		System.out.println("이름은:" + name);
		System.out.println("국어 점수:" + kor);
		System.out.println("수학 점수:" + mat);
		System.out.println("합계 점수:" + total);
		System.out.println("평균 점수:" + avg);
	}

}
