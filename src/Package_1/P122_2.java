package Package_1;

public class P122_2 {

	public static void main(String[] args) {
		Loop1: for(int i=2; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					if(j==5) {continue;} //즉시 소속 for문 리턴
					System.out.println(i+" x "+j+" = "+(i*j));
				}
				System.out.println();
		}

	}

}
