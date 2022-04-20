package Strings;

public class StringUse {

	public static void main(String[] args) {
		 char c='c';
		 String str="abcdefgh";
         System.out.println(str.charAt(1));
         System.out.println(str.length());
         System.out.println(str.substring(1,6));
         System.out.println(str.substring(3));
         System.out.println(str.substring(0));
         System.out.println(str);
         System.out.println(str.substring(str.length()));//it will print an empty string
         System.out.println(str.substring(1,1));//print an empty string bcz there is no string between (1,1)
         System.out.println(str.contains("cde"));// this check wither "cde" is part of str=abcdefgh; or not
         System.out.println(str.contains("cdf"));
         System.out.println(str.concat("abhi"));
         
         
         
	}

}
