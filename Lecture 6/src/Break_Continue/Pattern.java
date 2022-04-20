package Break_Continue;

public class Pattern {

	public static void main(String[] args) {
		int n = 4;
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= n) {
				System.out.print(j + " ");  
				j++;
				if (j > i) {
					break; // in this break will only terminate the inner loop and will not effect the outer loop
				}
			}
			System.out.println();
			i++;
		}

	}

}
