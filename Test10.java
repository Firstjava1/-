package e;

import a.Test;

public class Test10 {
	public static void main(String[] args) {
		int [] arr = {4,5,4,5,79};
		printArry (arr);
	}
	
	public static void printArry (int[]arry){
		System.out.print("[");
		for(int i=0;i<arry.length;i++){
			if(i!=arry.length-1){
				System.out.print(arry[i]+",");
			
		}else{
			System.out.print(arry[i]);
		}
	}
		System.out.print("]");
	}
}	


