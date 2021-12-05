import java.util.Scanner;

public class test{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter name");
		String name = obj.nextLine();
		System.out.println("Enter values");
		int x1 = obj.nextInt();
		int x2 = obj.nextInt();
		System.out.println(name);
		System.out.println(x1 + " " + x2);
	}
}
