package lt.Ihu.unit.main;
import java.util.Scanner;

public class Verzweigung13 {

	public static void main(String[] args) {
		double x1,x2,y1,y2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Для определенния близости к началу координат ближе, Точка А введите x1");
		x1=scanner.nextInt();
		System.out.println("Точка А, введите y1");
		y1=scanner.nextInt();
		System.out.println("Точка В, введите x2");
		x2=scanner.nextInt();
		System.out.println("Точка В, введите y2");
		y2=scanner.nextInt();
		
		if ((x1<x2)||(x1<y2)||(y1<y2)||(y1<x2)) {
			System.out.println("Точка А ближе к началу координат");
		} else {
			System.out.println("Точка В ближе к началу координат");
		}

	}

}
