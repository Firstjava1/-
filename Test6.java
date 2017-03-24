package e;

public class Test6 {
//	public static int getMax(int[]arry){
//		int max=arry[0];
//		for(int i=1;i<arry.length;i++){
//			if(max<arry[i]){
//				max=arry[i];
//			}
//		}
//		return max;
//	}
//	public static int getMin(int[]arry){
//		int min=arry[0];
//		for(int i=1;i<arry.length;i++){
//			if(min<arry[i]){
//				min=arry[i];
//			}
//	}
//		return min;
//}
//	
	public static void main(String[] args) {
		int[]arry=new int[]{10,5,7};
		arry[0]=10;
		arry[1]=5;
		arry[2]=7;
		printArry(arry);	
	}

public static void printArry(int[]arry){
	for(int i=0;i<arry.length;i++){
		System.out.println(arry[i]);
	}
}
  public static void main1(String[] args) {
	  for(int i=0;i<3;i++){
		  for(int j=0;j<4;j++){
			  System.out.println("*");
		  }
		  System.out.print("*");
	  }
	
}

   public static void main2(String[] args) {
	   System.out.println("*");
	   System.out.println("*");
	   System.out.println("*");
	   System.out.println("*");
	   System.out.println("*");
  }
}
   
