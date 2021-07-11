package COStest;

// You may use import as below.
import java.util.*;

	class Solution {
		public static void main(String[] args) {
			Solution sol = new Solution();
			int price1 = 2500;
			String grade1 = new String("V");
			int ret1 = sol.solution(price1, grade1);
			
			// Press Run button to receive output.
			System.out.println("Solution: return value of the method is " + ret1 + " .");
			
			int price2 = 96900;
			String grade2 = new String("S");
			int ret2 = sol.solution(price2, grade2);
			
			// Press Run button to receive output.
			System.out.println("Solution: return value of the method is " + ret2 + " .");
		}
	
		public int solution(int price, String grade) {
			double reuslt =0;
			if(grade.equals("S")) {
				reuslt=price-(((double)5/100)*price);
			}else if(grade.equals("G")) {
				reuslt= price-(((double)10/100)*price);
			}else if(grade.equals("V")) {
				reuslt= price-(((double)15/100)*price);
			}
			
			return (int)reuslt;
		}

}
