package Package_1;

import java.util.Scanner;

public class P103 {

	public static void main(String[] args) {
		System.out.println("성적 입력");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		String b = " ";
		if(a<60) {b = "F";}
		else if(a<70) {b = "D";}
		else if(a<80) {b = "C";}
		else if(a<90) {b = "B";}
		else {b = "A";}
		System.out.println("성적은:" + a);
		System.out.println("학점은:" + b);
	}

}
