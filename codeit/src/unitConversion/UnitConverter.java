package unitConversion;

public class UnitConverter {
	   // 필요한 상수 정의
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double POUND_PER_KILOGRAMS = 1 / KILOGRAMS_PER_POUND;
	public static final double CENTIMETERS_PER_INCH = 2.54;
	public static final double INCH_PER_CENTIMETERS = 1 / CENTIMETERS_PER_INCH;

    public static double toPounds(double kilograms) {
		return POUND_PER_KILOGRAMS*kilograms;
        // 메소드 내부를 채워주세요 kilogram->pound변환
    }
    public static double toKilograms(double pounds) {
		return KILOGRAMS_PER_POUND*pounds;
        // 메소드 내부를 채워주세요
    }
    public static double toCentimeters(double inches) {
		return CENTIMETERS_PER_INCH*inches;
        // 메소드 내부를 채워주세요
    }
    public static double toInches(double centimeters) {
		return INCH_PER_CENTIMETERS*centimeters;
        // 메소드 내부를 채워주세요
    }
    public static double toFahrenheit(double celsius) {
		return celsius*1.8+32;
        // 메소드 내부를 채워주세요
    }
    public static double toCelsius(double fahrenheit) {
		return (fahrenheit-32)*1.8;
        // 메소드 내부를 채워주세요
    }
}
