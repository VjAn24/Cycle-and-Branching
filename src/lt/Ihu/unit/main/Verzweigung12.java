package lt.Ihu.unit.main;
import java.util.Scanner;

public class Verzweigung12 {

	public static void main(String[] args) {
		double a,b,c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите первое число");
		a=scanner.nextInt();
		System.out.println("Введине второе число");
		b=scanner.nextInt();
		System.out.println("Введите третье число");
		c=scanner.nextInt();
		
		if (a<0) {
			a=Math.pow(a, 4);
			System.out.println("Первое число = "+a);
		} else {
			a=Math.pow(a, 2);
			System.out.println("Первое число = "+a);
		}
		if (b<0) {
			b=Math.pow(b, 4);
			System.out.println("Первое число = "+b);
		} else {
			b=Math.pow(b, 2);
			System.out.println("Первое число = "+b);
		}
		if (c<0) {
			a=Math.pow(c, 4);
			System.out.println("Первое число = "+c);
		} else {
			c=Math.pow(c, 2);
			System.out.println("Первое число = "+c);
		}
	}
}
