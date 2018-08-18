import java.util.Scanner;
 class prog_10
{
public static void main(String args[]){
    long sum=0;
int n=2000000;
    outerloop:
    for(int i=2;i<n;i++){
        for(int j=2;j<=i;j++){
            if(i!=j&&i%j==0){
                continue outerloop;
            }
            else if(j==i){
                sum=sum+i;
            }
        }

    }

    System.out.println(sum);

}
}
