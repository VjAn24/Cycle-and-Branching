package lt.Ihu.unit.main;
import java.util.Scanner;

public class Verzweigung15 {

	public static void main(String[] args) {
		double x,y,neux,neuy;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Для решения задания, введите x");
		x=scanner.nextInt();
		System.out.println("Введите y");
		y=scanner.nextInt();
		
		if (x<y) {
			neux=(x+y)/2;
			neuy=x*y*2;
		} else {
			neuy=(x+y)/2;
			neux=x*y*2;
		}
		System.out.println("Новое значение x="+neux+"Новое значение y="+neuy);


	}

}
