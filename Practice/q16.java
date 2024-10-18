import java.lang.*;
public class q16 {
    public static void main(String args[]){
        double ari[]={9.00, 9.40, 9.50, 11.00, 15.00, 18.00};
        double dep[]={9.10, 12.00, 11.20, 11.30, 19.00, 20.00};

        int result=1;
        for (int i = 0; i < dep.length; i++) {
            int min_platform=1;
            for (int j = i+1; j < dep.length; j++) {
                if (ari[i]>=ari[j] && ari[i]<=dep[j] || ari[j]>=ari[i] && ari[j]<=dep[i]) {
                    min_platform++;
                }
            }
            result=Math.max(result, min_platform);
        }
        System.out.println(result);
    }
}
