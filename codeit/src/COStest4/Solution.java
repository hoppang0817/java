package COStest4;

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left<right){
        	//temp=원 값을 저장해놓는 변수 temp=1
        	//temp=4
            int temp = arr[left];
            //arr[0]=3
            //arr[1]=2
            arr[left] = arr[right];
            //arr[3]=1
            //arr[2]=4
            arr[right] = temp;
            //left=1
            //left=2
            left += 1;
            //right=2
            //right=1
            right -= 1;
            //첫 패턴결과 [3,4,2,1]
            //두 번째패턴결과 [3,2,4,1]
        }
        return arr;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 4, 2, 3};
        int[] ret = sol.solution(arr);
 
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + " .");
    }
}