package Break_Continue;

public class ContinueDemo {

	public static void main(String[] args) {
//		int i = 1;
//		while (i <= 10) {
//			if (i == 5) {
//				i++;
//				continue;  // due to continue when i==5 the line 12 and 13 will be skipped and moved to next iteration
//			}
//			System.out.println(i);
//			i = i + 1;
//		}
		
		for (int k = 1; k <= 10; k++) {
			if (k == 5) {
				continue;  //when k==5 line 20 will be skipped and moved to next iteration
			}
			System.out.println(k);
		}   
//		####"break" is used to exit from the current loop.
//		####"return" statement is used to exit from the current function.
//		####"continue" is used to skip the current iteration of a loop and continue with the next iteration

	}

}
