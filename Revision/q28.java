public class q28 {
    public static void main(String args[]){
        int a[]={1,8,3,4,5,7};
        for (int i = 0; i < a.length; i++) {
            boolean flag=true;
            LEVEL :for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]) {
                    flag=true;
                    continue LEVEL;
                }
                else{
                    flag=false;
                    break;
                }            
            }
            if (flag) {
                System.out.println(a[i]);
            }
        }
    }
}
