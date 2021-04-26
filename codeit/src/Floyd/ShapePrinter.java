package Floyd;

public class ShapePrinter {

	public void printFloydsPyramid(int height) {
		//가장 큰수의 자릿수
		int length=String.valueOf(height*(height+1)/2).length();
		//출력할 수
		int num = 1;
		//행을 바꺼주는 반복문
		for(int row=1; row<=height;row++) {
			
			//한행에서 열을 바꾸는 반복문
			for(int i=1; i<=row; i++) {
				//입력될 수의 자릿수
				int numlength = String.valueOf(num).length();
				
				//한열안에서 자릿수를 맞추는 반복문
				//가장 큰수의 자릿수-입력될수의 자릿수를 해 뺀수만큼 공백을준다
				for(int k=1;k<=length-numlength;k++) {
					System.out.print(" ");
				}
				
				System.out.print(num+" ");
				num++;
			}
			
			System.out.println();
		}
	}

}
