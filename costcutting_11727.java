import java.util.*;


public class costcutting_11727 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		int a, b, c;
		for (int i = 1; i <= t; i++) {
			
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();

			if (a < b && b < c ){
				System.out.println("Case " + i + ": " + b);
			}
			else if (a < b && b > c && a < c ){
				System.out.println("Case " + i + ": " + c);
			}
			else if (a < b && b > c && a > c ){
				System.out.println("Case " + i + ": " + a);	
			}
			else if (a > b && b < c && a < c) {
				System.out.println("Case " + i + ": " + a);
			}
			else if (a > b && b < c && a > c) {
				System.out.println("Case " + i + ": " + c);
			}
			else {
				System.out.println("Case " + i + ": " + b);
			}
		}
	}
}