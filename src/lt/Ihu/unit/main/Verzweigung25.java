package lt.Ihu.unit.main;
import java.util.Scanner;

public class Verzweigung25 {

	public static void main(String[] args) {
		int sensor;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите показания датчика:");
		sensor=scanner.nextInt();
				
		if (sensor>60) {
			System.out.println("Пожароопасная ситуация!");
		} 

	}

}
