package folyd;

public class ShapePrinter {
	public void printFloydsPyramid(int height) {
        // 코드를 입력하세요.
		//최대값의 길이
		int length = String.valueOf(height * (height+1)/2).length();
		//출력될값 
		int cuont =1;
		
		//반복문 1 - 행을 바꾸는 반복문
		for(int i =1; i<=height ; i++) {
			//반복문2 - 한행에서 열을 바꾸는 반복문
			for(int j =1; j<=i;j++) {
				if(length == 1) {
					System.out.print(" ");
				}
				else if(length == 2) {
					if(cuont<10) {
					System.out.println("  ");
					}
				}else
				for(int l =1;l<=j;l++) {
					System.out.print(cuont);
					cuont++;
					break;
				}
			}
			System.out.println();
		}
    }
}
