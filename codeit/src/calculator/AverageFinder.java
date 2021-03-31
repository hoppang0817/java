package calculator;

public class AverageFinder {

	 double computeAverage(int[] intArray) {
		 int i;
		 int sum =0;
		 for(i=0;i<intArray.length;i++) {
			 sum += intArray[i];
		 }
		 return (double) sum / intArray.length;
	    }
}
