package lt.Ihu.unit.main;
import java.util.Scanner;

public class Verzweigung11 {

	public static void main(String[] args) {
		double a,b,c,d,e,f,S1,S2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Для определенния площади наибольшего треугольника, введите первый катет, первого треугольника");
		a=scanner.nextInt();
		System.out.println("Второй катет, первого треугольника");
		b=scanner.nextInt();
		System.out.println("Введите первый катет, второго треугольника");
		d=scanner.nextInt();
		System.out.println("Второй катет, второго треугольника");
		e=scanner.nextInt();
		S1=(a*b)/2;
		S2=(d*e)/2;
		if (S1<S2) {
			System.out.println("Площадь первого треугольника наименьшая");
		} else {
			System.out.println("Площадь второго треугольника наименьшая");
		}

	}

}
