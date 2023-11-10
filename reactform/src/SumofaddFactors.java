import java.util.*;
class SumofoddFactors
{
    public static void oddfacrors(int n){
        int sum = 1;
        for(int i = 2;i <= n/2;i++){
            if(n%2!=0)
                sum = i++;
        }
    System.out.println(sum);

    }

}
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        SumofoddFactors.oddfactors(num);
    }