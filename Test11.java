package e;

public class Test11 {
	public static void main(String[] args) {
		
	
	for (int i = 1; i <= 5; i++) {
		for (int j = 5 - i; j >= 0; j--) {
		System.out.print(" ");
	}
		for (int k = 7; k >= 9-2*i; k--) {
		System.out.print("*");
		}
		System.out.println();
		}

    }
}
