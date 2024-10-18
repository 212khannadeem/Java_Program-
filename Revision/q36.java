public class q36 {
    public static void main(String args[]){
        int a[][]={ {10, 20, 30, 40},
                    {15, 25, 35, 45},
                    {27, 29, 37, 48},
                    {32, 33, 39, 50} };
        int n=100;
        boolean flag =true;
        for (int i = 0; i <4; i++) {
            for (int j = 0; j < 4; j++) {
                if(a[i][j]==n){
                    System.out.println(i+" "+j);
                    flag=false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("Element Not Found");
        }
    }
}
