package assignment;

import java.util.Iterator;

public class Codility {
	
	public static void main(String[] args) {
		int[] A = {-6,-91,1011,-100,84,-22,473};
//		System.out.println(solution(A));
		
		String str = "rahul";
		String[] arr = str.split("", 0);
	}
	
	public static int solution(int[] A) {
		int max=-9;
		for(int i=0;i<A.length;i++) {
			if(A[i]>-10 && A[i]<10) {
				if(A[i]>max) {
					max=A[i];
				}
			}
		}
		return max;	
	}
}
