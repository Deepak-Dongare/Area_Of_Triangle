import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Area;
		float b,c;
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the value of  base");
		b=sc.nextInt();
		System.out.println("Enter the  value of Height");
		c=sc.nextInt();
		Area=(0.5)*(b*c);
		System.out.println("Area of Triangle"+Area);

	}

}
