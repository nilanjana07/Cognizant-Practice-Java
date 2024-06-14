import java.util.Scanner;
// Example1 -
// Given,
// the total levels in the hill pattern = 5 (i.e. with 5 rows)
// the weight of the head level (first row) = 10
// the weight increments of each subsequent level = 2
// Then, The total weight of the hill pattern will be calculated as = 10 + (12+12) + (14+14+14) + 
// (16+16+16+16) + (18+18+18+18+18) = 10 + 24 + 42 + 64 + 90 = 230
// Example2 -
// Given,
// the total levels in the hill pattern = 4
// the weight of the head level = 1
// the weight increments of each subsequent level = 5
// Then, Total weight of the hill pattern will be = 1 + (6+6) + (11+11+11) + (16+16+16+16) = 1 + 12 + 33 + 64 
// = 110

public class HillCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of levels");
        int level=sc.nextInt();
    if(level==0){
    System.out.println(0);
    return;
    }

        System.out.println("Enter the first weight");
        int weight=sc.nextInt();
        System.out.println("Enter the weight increment");
        int inc=sc.nextInt();
        int sum=weight;
        for(int i=2;i<=level;i++)
        {
            weight+=inc;
            sum+=(weight*i);
        }
        System.out.println(sum);
    }
}
