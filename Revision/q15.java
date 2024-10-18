public class q15 {
    public static void main(String args[]){
        int a[]={9,7,2,2,7,4,7};
        int i;
        LEVEL :for (i = 0; i < a.length; i++) {
            int count=0;
            for (int j = 0; j <i; j++) {
                if(a[i]==a[j]){
                    continue LEVEL;
                }
            }
            for (int j = i; j < a.length; j++) {
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count%2!=0){
                System.out.println(a[i]);
            }
        }
    }
}
