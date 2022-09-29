package lt.Ihu.unit.main;
import java.util.Scanner;

public class Verzweigung38 {

	public static void main(String[] args) {
		double x,Fx;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Для вычисления знаения, введите х");
		x=scanner.nextInt();
		
		if ((0<=x)&(x<=3)){
			Fx=Math.pow(x,2);
			System.out.println("Значение вычисления F(x)="+Fx);
		}else {
			Fx=4;
			System.out.println("Значение вычисления F(x)="+Fx);
		}

	}

}
