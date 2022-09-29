package lt.Ihu.unit.main;
import java.util.Scanner;

public class Verzweigung17 {

	public static void main(String[] args) {
		double m,n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Для решения задачи, введите число m");
		m=scanner.nextInt();
		System.out.println("Введите число n");
		n=scanner.nextInt();
		
		if (m<n) {
			m=n;
			System.out.println("Числа m и n="+m);
		}if (m>n) {
			n=m;
			System.out.println("Числа m и n="+m);
		} else {
			m=0;
			n=0;
			System.out.println("Числа m и n="+m);
		}


	}

}
