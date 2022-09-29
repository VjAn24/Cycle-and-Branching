package lt.Ihu.unit.main;
import java.util.Scanner;

public class Verzweigung21 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
		String str1=scanner.nextLine();
		
		if ((str1=="Д")||(str1=="д")){
			System.out.println("Мне нравятся мальчики");
		} else {
			System.out.println("Мне нравятся девочки");
		}

	}

}
