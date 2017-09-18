import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int a, n, h, w = 0;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		h = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			a = scanner.nextInt();
			if (a > h) {
				w += 2;
			} else {
				w += 1;
			}
		}
		System.out.println(w);
	}
}
