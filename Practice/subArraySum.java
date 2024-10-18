import java.util.HashMap;

public class subArraySum {
    
    public void subArray(int a[],int sum){
        int  currSum=0;
        int start=0;
        int end=-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            currSum+=a[i];
            if (currSum==sum) {
                start=1;
                end=i;
                break;

            }
            if (map.containsKey(currSum-sum)) {
                start=map.get(currSum-sum)+1;
                end=i;
                break;
            }
            map.put(currSum, i);
        }
        if (end==-1) {
            System.out.println("Not Found");
        }
        else{
            System.out.println(start+" "+end);
        }
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int n=3;
        subArraySum s=new subArraySum();
        s.subArray(a, n);
    }
}
