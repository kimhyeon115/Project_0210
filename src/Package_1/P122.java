package Package_1;

public class P122 {

	public static void main(String[] args) {
		Loop1: for(int i=2; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					if(j==3) {break;} //소속된 for문에서 탈출
					System.out.println(i+" x "+j+" = "+(i*j));
				}
				System.out.println();
		}

	}

}
