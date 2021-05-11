package array;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
	}

	public static int getSurvivingIndex(int n, int k) {
		ArrayList<Integer> soldiers = new ArrayList<>();
		int killIndex=0;
		//군사를 줄세움
		for(int i=1; i<=n;i++){
			soldiers.add(i);
		}
		//시체보관소
		  ArrayList<Integer> corpse_list = new ArrayList<>();

	       // 최후의 한명이 남는 순간까지 게임을 반복한다
		  //첫번째 군사를 마지막으로 옮기고 반복
		  //for문 마지막은 5번째 군사임-> 삭제
	       while (n >= 2) {
	           for (int i = 1; i <= k - 1; i++) {
	               soldiers.add(soldiers.get(0));
	               soldiers.remove(0);
	           }
	           corpse_list.add(soldiers.get(0));
	           soldiers.remove(0);
	           n--;
	       }
	       
	       // 시체 나열
	       //시체 보관소에 있는 시체가 들어온 순서대로 출력
	       for (Integer corpse : corpse_list) {
	           System.out.println(corpse + "번 군사가 죽습니다. ");
	       }

	       // 최후의 1인
	       return soldiers.get(0);
	   }
}