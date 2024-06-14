import java.util.*;
public class PINcreate {
    public static void pin (int n1, int n2,int n3)
    {
        String result="";
        int[] max=new int[3];
         for (int i=0;i<3;i++)
         {
            int[] arr=new int[3];
            arr[0]=n1%10;
            arr[1]=n2%10;
            arr[2]=n3%10;
            n1/=10;
            n2/=10;
            n3/=10;
            Arrays.sort(arr);
            result=arr[0]+result;
            max[i]=arr[2];
         }
         Arrays.sort(max);
         result=max[2]+result;
         int i=Integer.parseInt(result);
         System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        pin(n1, n2, n3);
        
    }
}
