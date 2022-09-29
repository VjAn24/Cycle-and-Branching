package lt.Ihu.unit.main;

public class Zyklus05 {

	public static void main(String[] args) {
		int a, sum;
		a=1;
		sum=0;
		
		while (a<=100) {
			sum=sum+a;
			a+=2;
		}
		System.out.println("Сумма нечетных чисел = "+sum);


	}

}
