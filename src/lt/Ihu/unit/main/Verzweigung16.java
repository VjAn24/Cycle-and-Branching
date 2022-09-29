package lt.Ihu.unit.main;

import java.util.Scanner;

public class Verzweigung16 {

	public static void main(String[] args) {
		double x1,y1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Для определенния близости к началу координат ближе, Точка А введите x1");
		x1=scanner.nextInt();
		System.out.println("Точка А, введите y1");
		y1=scanner.nextInt();
		
		if (x1>0) {
			if (y1>0) {
			System.out.println("Точка А в правом верхнем квадрате");
			} else {
				System.out.println("Точка А в правом нижнем квадрате");
			}
		} else {
			if (y1>0) {
				System.out.println("Точка А в левом верхнем квадрате");
				} else {
					System.out.println("Точка А в левом нижнем квадрате");
				}
		}


	}

}
