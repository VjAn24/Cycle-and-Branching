package lt.Ihu.unit.main;

public class Zyklus08 {

	public static void main(String[] args) {
		double x,y,a,c,b,h;
		a=0;
		b=25;
		h=1;
		c=1;
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		for(x = a; x <=b; x = x + h) {
			if (x==15);{
				y=x+c;
			}if(x!=15){
				y=(x-c)+6;
			}
		System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}
		System.out.println("---------------------------------");


	}

}
