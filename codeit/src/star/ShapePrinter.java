package star;

public class ShapePrinter {
	public void printTriangle(int height) {
    //height길이 만큼 별 출력 3이면 세로로 별 한개씩 세줄 출력됨
		for(int i=1;i<=height;i++) {
			//i의 길이만큼 별출력 i가 1이면 한개 출력
			//i가 2이면 두개 출력
			//i가 3이면 세개 출력
    	  for(int j=1;j<=i;j++) {
    		  System.out.print("⭐");
    	  }
    	  // 줄바꿈
    	  // 줄바꿈
    	  // 줄바꿈
    		  System.out.println();
      }
    }
}
