import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int N, amount;
		String operation;
		long sum;
		for (int I = 1; I <= T; I++) {
			N = scan.nextInt();
			scan.nextLine();
			sum = 0;
			System.out.format("Case %d:\n", I);
			for (int J = 1; J <= N; J++) {
				operation = scan.next();
				
				if (operation.equals("donate")) {
					amount = scan.nextInt();
					sum += amount;
				}
				if (operation.equals("report")) {
					System.out.println(sum);
					
				}
			}
		}
		scan.close();
	}

}
