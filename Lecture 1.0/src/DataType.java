
public class DataType {

	public static void main(String[] args) {
		char c= 'a';
		System.out.println(c+3);
		int i=c+10;
		System.out.println(i);
		
		i=c;   
		//char abc=i;          it will show error bcz we r trying to copy higher byte into lower byte
		
		long l=i;
		//i=l;
		
		double d=i;
		//i=d;
		
	 /*floar f =1.23           System treats all decimal numbers as
		 *  double by default. So 1.4 is stored as
		 *   double(which is of 8 bytes). When we will try put a
		 *    double into a float(which is of 4 bytes), it
		 *     will give you error.                                                                   */
		float f=1.23f;     //righte way to take float
		 
		d=f;
		//f=d;
		
		
	}

}
