package lt.Ihu.unit.main;
import java.util.Scanner;

public class Verzweigung23 {

	public static void main(String[] args) {
		int date,monat;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Укажите ваше число рождения:");
		date=scanner.nextInt();
		System.out.println("Укажите номер месяца рождения:");
		monat=scanner.nextInt();
		
		if (date<=31) {
			if (monat<=12) {
			System.out.println("Вы родились"+date+"."+monat);
			}
		} else {
			System.out.println("Введины некорректные данные.");
		}

	}

}
