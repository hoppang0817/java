package hash;

import java.util.HashMap;

public class main {

	public static void main(String[] args) {
		//<키값 자료형, 원소 자료형>
		HashMap<String, String> pokedex = new HashMap<String, String>();
		//ArrayList에서는 add를 사용했지만
		//HashMap은 put을 사용해 추가
		//1개의 키에는 1가지의 원소만 저장가능 만약 1개의 키값에 여러개의 원소를 저장하면 마지막 원소만 저장됨
		pokedex.put("피카츄", "피카츄");
		//pokedex.put("피카츄", "피츄");
		pokedex.put("라이츄", "라이츄");
		pokedex.put("파이리", "파이리");
		pokedex.put("꼬북이1", "꼬북이");
		
		//ArrayList는 삭제나 추가로 각 원소마다 인덱스 번호가 달라질수있지만
		//HashMap은 키값을 사용하기때문에 인덱스 번호가 달라져도 키값으로 원소를 정확히 출력할수있음
		pokedex.remove("라이츄");
		System.out.println(pokedex.keySet());
		//keySet()메소드는 HashMap의 키들을 담겨있는 리스트를 가져와줌
		for(String key : pokedex.keySet()) {
			System.out.println(pokedex.get(key));
		}
	//	System.out.println(pokedex.get("피카츄"));//피츄 출력됨
	}

}
