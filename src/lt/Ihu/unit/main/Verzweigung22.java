package lt.Ihu.unit.main;
import java.util.Scanner;

public class Verzweigung22 {

	public static void main(String[] args) {
		double x,y,neux,neuy;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Для решения задачи, введите x");
		x=scanner.nextInt();
		System.out.println("Введите y");
		y=scanner.nextInt();
				
		if (x<y) {
			neuy=x;
			neux=y;
			System.out.println("Значение x="+neux+"y="+neuy);
		} else {
			System.out.println("Значение x="+x+"y="+y);
		}

	}

}
