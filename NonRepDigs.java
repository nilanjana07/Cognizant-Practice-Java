import java.util.Scanner;
// Non-Repeated Digits Count
// Write a function to find the count of non-repeated digits in a given number N. The number will be
// passed to the function as an input parameter of type int.
// Assumption: The input number will be a positive integer number >= 1 and <= 25000.
// Some examples are as below -
// If the given number is 292, the function should return 1 because there is only 1 non-repeated digit '9' in
// this number
// If the given number is 1015, the function should return 2 because there are 2 non-repeated digits in this
// number, '0', and '5'.
// If the given number is 108, the function should return 3 because there are 3 non-repeated digits in this
// number, '1', '0', and '8'.
// If the given number is 22, the function should return 0 because there are NO non-repeated digits in this
//number.
public class NonRepDigs
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
     int num=sc.nextInt();
     int count=0;
     String str=num+"";
 for(int i=0;i<str.length();i++)
 {
    String check="";
    if(i==str.length()-1)
    {
         check=str.substring(0,str.length()-1);
    }
    else{
     check=str.substring(0, i)+str.substring(i+1, str.length());}

    char ch=str.charAt(i);
    if(check.indexOf(ch)==-1)
    count++;
    
 }
 System.out.println(count);
}

}
