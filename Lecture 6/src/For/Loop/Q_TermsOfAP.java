package For.Loop;
import java.util.Scanner;
public class Q_TermsOfAP {

	public static void main(String[] args) {
		 
    Scanner s=new Scanner(System.in);
    int x=s.nextInt();
     int c=0;
      int AP=0;
     for(int i=1;i>=1;i++)
     {
    	AP=(3*i)+2;
    	if(AP% 4==0)
    	{
    		continue;
    	}
    	System.out.print(AP +" ");
    	c++;
    	
    	if(c==x) {
    		break;
    	}
     }
	}

}
