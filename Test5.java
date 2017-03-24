package e;

public class Test5 {
	public static void main(String[] args) {
		int[]arry=new int[2];
		arry[0]=1;
		arry[1]=3;
		printArry(arry);
	}
	
	public static void printArry(int[]arry){
		for(int i=0;i<arry.length;i++){
			System.out.println(arry[i]);
		}
	}

}
