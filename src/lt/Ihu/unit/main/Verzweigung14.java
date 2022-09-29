package lt.Ihu.unit.main;
import java.util.Scanner;

public class Verzweigung14 {

	public static void main(String[] args) {
		double ecke1,ecke2,summ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Для определенния существования треугольника, введите первый угол");
		ecke1=scanner.nextInt();
		System.out.println("Введите второй угол");
		ecke2=scanner.nextInt();
		summ=ecke1+ecke2;
		
		if (summ<180) {
			System.out.println("Такой треугольник существует");
			if (summ==90) {
				System.out.println("Это прямоуголный треугольник");
			}
		} else {
			System.out.println("Такого треугольника не существует");
				
		}

	}

}
