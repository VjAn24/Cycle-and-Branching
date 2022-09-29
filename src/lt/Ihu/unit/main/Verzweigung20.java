package lt.Ihu.unit.main;
import java.util.Scanner;

public class Verzweigung20 {

	public static void main(String[] args) {
		double a,b,c,k,neua,neub,neuc;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Для определенния количества положительных числе, введите а");
		a=scanner.nextInt();
		System.out.println("Введите b");
		b=scanner.nextInt();
		System.out.println("Введите с");
		c=scanner.nextInt();
		System.out.println("Введите делитель k");
		k=scanner.nextInt();
		neua=a%k;
		neub=b%k;
		neuc=c%k;
		if ((neua==0) & (neub==0)&(neuc==0)){
			System.out.println("На число "+k +"делятся"+a+b+c);
		}
		if ((neua==0) & (neub==0)&(neuc!=0)){
			System.out.println("На число "+k +"делятся"+a+b);
		}
		if ((neua==0) & (neub!=0)&(neuc==0)){
			System.out.println("На число "+k +"делятся"+a+c);
		}
		if ((neua!=0) & (neub==0)&(neuc==0)){
			System.out.println("На число " +k +"делятся"+b+c);
		}
		if ((neua==0) & (neub!=0)&(neuc!=0)){
			System.out.println("На число "+k +"делятся"+a);
		}
		if ((neua!=0) & (neub!=0)&(neuc==0)){
			System.out.println("На число " +k +"делятся"+c);
		}
		if ((neua!=0) & (neub==0)&(neuc!=0)){
			System.out.println("На число"+ k +"делятся"+b);
		} else {
			System.out.println("На число" +k +"не делится ни одно число");
		}

	}

}
