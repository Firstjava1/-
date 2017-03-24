package e;

public class Test9 {
public static void main(String[] args) {
	chengFa(5);
}

private static void chengFa(int x) {
	for(int i=1;i<=x;i++){
		for(int j=1;j<=i;j++){
			System.out.print(j+"*"+i+"="+(i*j)+"\t");
		}
		System.out.println();
	}
  }
}
