import java.util.*;


public class reloperator_11172 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		int a, b;
		while(t-- > 0){
			a = in.nextInt();
			b = in.nextInt();

		if (a < b){
			System.out.println("<");
		}
		else if (a == b){
			System.out.println("=");
		}
		else {
			System.out.println(">");
		}
		}
	}
}