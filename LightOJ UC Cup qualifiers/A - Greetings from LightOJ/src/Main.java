// Verdict : Accepted
// LightOJ
import java.util.*;
class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		long a, b;
		for (int I = 1; I <= testCase; I++) {
			a = scan.nextInt();
			b = scan.nextInt();
			System.out.format("Case %d: %d\n", I, (a+b));
		}
	}

}
