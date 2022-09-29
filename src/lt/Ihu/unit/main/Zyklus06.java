package lt.Ihu.unit.main;
import java.util.Scanner;

public class Zyklus06 {

	public static void main(String[] args) {
		double a,b, sum;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите любое положительное число:");
		a=scanner.nextInt();
		b=1;
		sum=0;
		
		while (b<=a) {
			sum=sum+b;
			b+=1;
		}
		System.out.println("Сумма всех чисел = "+sum);



	}

}
