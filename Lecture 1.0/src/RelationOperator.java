import java.util.Scanner;
public class RelationOperator {

	public static void main(String[] args) {
		
    Scanner s=new Scanner(System.in);
    int i=s.nextInt();
    int j=s.nextInt();
    
    boolean isEq=(i==j);
    boolean neq=(i!=j);
    boolean isgr=(i>j);
    boolean isless=(i<j);
    boolean isgreq=(i>=j);
    boolean islessEq=(i>=j);
    System.out.println(isEq);
    System.out.println(neq);
    System.out.println(isgr);
    System.out.println(isless);
    System.out.println(isgreq);
    System.out.println(islessEq);

	}

}
