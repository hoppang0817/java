package unitConversion;

import java.util.Random;

public class main {

	public static void main(String[] args) {
		
		  System.out.format("35 lb -> %.2f kg\n", UnitConverter.toKilograms(35));
	        System.out.format("62 kg -> %.2f lb\n", UnitConverter.toPounds(62));
	        System.out.format("12.2 in -> %.2f cm\n", UnitConverter.toCentimeters(12.2));
	        System.out.format("3.82 cm -> %.2f in\n", UnitConverter.toInches(3.82));
	        System.out.format("48 °F -> %.2f °C\n", UnitConverter.toCelsius(48));
	        System.out.format("-9 °C -> %.2f °F\n", UnitConverter.toFahrenheit(-9));
	        
	        Random rand = new Random();
	        int min = 10;
	        int max = 30;
	        //0~20값을 출력하고 거기에 +10을 해줌으로 10~30사이의 값이 나옴
	        System.out.println(rand.nextInt((max-min)+1)+min);
	        
	}

}
