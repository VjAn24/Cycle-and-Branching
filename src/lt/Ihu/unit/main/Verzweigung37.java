package lt.Ihu.unit.main;
import java.util.Scanner;

public class Verzweigung37 {

	public static void main(String[] args) {
		double x,Fx;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Для вычисления знаения, введите х");
		x=scanner.nextInt();
		
		if (x>=3){
			Fx=Math.pow(-x,2)+3*x+9;
			System.out.println("Значение вычисления F(x)="+Fx);
		}else {
			Fx=1/(Math.pow(x,3)-6);
			System.out.println("Значение вычисления F(x)="+Fx);
		}

	}

}
