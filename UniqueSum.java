import java.util.HashSet;
import java.util.Scanner;

public class UniqueSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> set=new HashSet<>();
        System.out.println("Enter a number");
     int num=sc.nextInt();
     while(num>0)
     {
        int digit=num%10;
        set.add(digit);
        num/=10;
     }
     
     int sum=0;
     for(int i:set)
     {
       sum+=i;
     }
     System.out.println(sum);
     
 }

}

