package lt.Ihu.unit.main;
import java.util.Scanner;

public class Verzweigung10 {

	public static void main(String[] args) {
		double a,b,pi,Sa,Sb;
		pi=3.14;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Для определенния площади наименьшего круга, введите радиус первого круга");
		a=scanner.nextInt();
		System.out.println("Введите радиус второго круга");
		b=scanner.nextInt();
		Sa=pi*(a*a);
		Sb=pi*(b*b);
		if (Sa<Sb) {
			System.out.println("Площадь первого круга наименьшая");
		} else {
			System.out.println("Площадь второго круга наименьшая");
		}

	}

}
