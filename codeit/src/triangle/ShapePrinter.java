package triangle;

public class ShapePrinter {
	public void printPyramid(int height) {
        
		//한줄씩 출력
		for(int i=1;i<=height;i++) {
			//공백 넣어주기 높이-i만큼씩 공백넣어주기
			//첫번째줄에 공백 2개필요
			//두번째줄에 공백 1개필요
			//세번째줄에 공백 0개필요
			for(int j=1; j<=height-i;j++) {
				System.out.print(" ");
			}
			//별 출력하기 홀수만큼씩 출력
			for(int j=1;j<2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
    }
	
}
