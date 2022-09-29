package lt.Ihu.unit.main;
import java.util.Scanner;

public class Verzweigung19 {

	public static void main(String[] args) {
		double a,b,c;
		int attempt;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Для определенния количества положительных числе, введите а");
		a=scanner.nextInt();
		System.out.println("Введите b");
		b=scanner.nextInt();
		System.out.println("Введите с");
		c=scanner.nextInt();
		attempt=0;
		
		if (a>0) {
			attempt+=1;
		} 
		if (b>0){
			attempt+=1;
		}
		if (c>0){
			attempt+=1;
		}
		System.out.println("Количество положительных чисел = "+attempt);
		

	}

}
