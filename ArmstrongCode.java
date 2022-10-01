// An armstrong number is a number which is equal to the cube of its digits.
import java.util.*;
class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = 0, c, d;
		System.out.print("Enter the number:");
		int n = sc.nextInt();
		c = n;
		sc.close();
		for(; n > 0;) {
			d = n %10;
			r = r + d * d * d;
			n = n/10;
		}
		if(r == c) {
			System.out.println("Number is Armstrong.");
		}
		else {
			System.out.println("Number is not Armstrong.");
		}
	}
}
