package lt.Ihu.unit.main;

public class Zyklus07 {

	public static void main(String[] args) {
		double x,y,a,b,h;
		a=-10;
		b=15;
		h=1;
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		for(x = a; x <=b; x = x + h) {
			if (x>2);{
				y=x;
			}if(x<=2){
				y=-x;
			}
		System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}
		System.out.println("---------------------------------");

	}

}
