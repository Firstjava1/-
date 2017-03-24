package e;

public class Test4 {
	public static void main(String[] args) {
		int[] arry=new int[2];
		arry[0]=2;
		arry[1]=1;
		printArray(arry);
	}
	
	
	public  static void printArray(int[] arry){
		for(int i=0;i<arry.length;i++){
			System.out.println(arry[i]);
		}
	}

}
