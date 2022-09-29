package lt.Ihu.unit.main;
import java.util.Scanner;

public class Verzweigung40 {

	public static void main(String[] args) {
		double x,Fx;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Для вычисления знаения, введите х");
		x=scanner.nextInt();
		
		if (x<=13){
			Fx=Math.pow(-x,3)+9;
			System.out.println("Значение вычисления F(x)="+Fx);
		}else {
			Fx=-(3/(x+1));
			System.out.println("Значение вычисления F(x)="+Fx);
		}

	}

}
