package scnner;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean b=true;
		boolean d=true;
		
		while (b) {
			System.out.println("(I)ntro (C)ourses (E)xit");
			String a = scanner.next();
			if (a.equals("c") || a.equals("C")) {
				while (d) {
					System.out.println("코드잇 수업을 소개합니다.");
					System.out.println("(P)ython (J)ava (I)OS (B)ack");
					String c = scanner.next();
					if (c.equals("j") || c.equals("J")) {
						System.out.println("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.");
						System.out.println("강사 : 김신의");
						System.out.println("추천 선수과목: Python");
					}
					else if(c.equals("i")||c.equals("I")) {
						System.out.println("최신 Swift언어를 통해 ios 개발을 시작할 수 있습니다.");
						System.out.println("강사 : 성태호");
						System.out.println("추천 선수과목: Python, Java");
					}
					else if(c.equals("p")||c.equals("P")) {
						System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다");
						System.out.println("강사 : 강영훈");
						System.out.println("추천 선수과목: 없음");
					}
					else{
						d=false;
					}
				}
			}
			else if(a.equals("i")||a.equals("I")) {
				System.out.println("안녕하세요! 우리는 코드잇입니다");
				System.out.println("함께 공부합시다!");
			}
			else {
				b=false;
			}

		}

	}

}
