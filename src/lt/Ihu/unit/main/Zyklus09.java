package lt.Ihu.unit.main;

public class Zyklus09 {

	public static void main(String[] args) {
		long a,sum;
		a=1;
		sum=0;
		while(a<=100) {
			sum=sum + a*a;
			a+=1;
		}
		System.out.println("Произведение квадратов первых двухсот чисел="+sum);

	}

}
