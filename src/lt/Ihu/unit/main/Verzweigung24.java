package lt.Ihu.unit.main;
import java.util.Scanner;

public class Verzweigung24 {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Сколько лепестков на вашей ромашке. Введите количество");
		n=scanner.nextInt();
			
		if (n%2==0) {
			System.out.println("Любит");
		} else {
			System.out.println("Не любит");
		}

	}

}
