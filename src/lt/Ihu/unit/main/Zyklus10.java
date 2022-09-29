package lt.Ihu.unit.main;

public class Zyklus10 {

	public static void main(String[] args) {
		long a,sum;
		a=1;
		sum=1;
		for( ;a<=200;a++) {
			sum=(long)(sum *(Math.pow(a, 2)));
			
		}
		System.out.println("Произведение квадратов первых двухсот чисел="+sum);


	}

}
