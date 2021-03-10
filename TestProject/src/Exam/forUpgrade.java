package Exam;

public class forUpgrade {
	public static void main (String[] args) {
		
		//일반 for문 , 확장 for문 (jdk5버전 이후 사용 가능)
		
		
		int [] a = {1, 3, 5, 7, 9};
		int sum1 = 0 , sum2 =0;
		
		for(int i=0; i<a.length; i++) {
			sum1 += a[i];
		}
		
		for(int i : a) {
			sum2 += i;
		}
		System.out.println("합1은="+sum1);
		System.out.println("합2는="+sum2);
	}
}
