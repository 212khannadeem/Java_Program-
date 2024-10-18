public class Armstrong2{
    public static void main(String args[]) {
        for(int i=1;i<=1000;i++){
            int temp=i;
            int rem ,sum=0;
            while(temp>0){
                rem=temp%10;
                sum += rem*rem*rem;
                temp/=10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}