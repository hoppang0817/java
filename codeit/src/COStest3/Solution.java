package COStest3;

class Solution {
	//총개수
    int[] func_a(int[] arr){
        int[] counter = new int[1001];
        for(int i = 0; i < arr.length; i++)
            counter[arr[i]]++;
        return counter;
    }
    
    //배열에서 가장큰수 구함
    int func_b(int[] arr){
        int ret = 0;
        for(int i = 0; i < arr.length; i++){
            if(ret < arr[i])
                ret = arr[i];
        }
        return ret;
    }
    
    //배열의 숫자가 0이아니고 배열의 숫자가 1001보다 작으며 ret은 해당배열의 숫자
    int func_c(int[] arr){
        final int INF = 1001;
        int ret = INF;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0 && ret > arr[i])
                ret = arr[i];
        }
        return ret;
    }
    public int solution(int[] arr) {
        int[] counter = func_a(arr);
        int maxCnt = func_b(counter);
        int minCnt = func_c(counter);
        return maxCnt / minCnt;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 3, 1, 3, 3, 2, 3, 2};
        int ret = sol.solution(arr);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}