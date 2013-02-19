import java.util.Scanner;

public class Recursion {
	public static void main(String args[]) {
		System.out.println("Enter a string?");
		Scanner input = new Scanner(System.in);
		String n = input.nextLine();
		int x = n.length();
		System.out.print(n + "-");
		writeStars(n,x);

	}

	public static void writeStars(String n, int x) {

		if (x == 0) {
			System.out.println();
		} else {
			System.out.print(n.charAt(x - 1));
			writeStars(n, x - 1);
		}
	}
}
