package Package_1;

public class P122_3 {

	public static void main(String[] args) {
		Loop1: for(int i=2; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					if(j==5) {break Loop1;} //Loop1(라벨)로 이동후 정지
					System.out.println(i+" x "+j+" = "+(i*j));
				}
				System.out.println();
		}

	}

}
