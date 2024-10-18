import java.util.HashSet;
import java.util.Set;

public class countElement {
    public int count(int a[]){
        Set<Integer> set= new HashSet<>();
        for (int i : a) {
            set.add(i);

        }
        return set.size();
    }

    public void union(int a[],int b[]){
        Set<Integer> set= new HashSet<>();
        for (Integer integer : a) {
            set.add(integer);
        }
        for (Integer integer : b) {
            set.add(integer);
        }
        System.out.println(set);
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4};
        countElement c=new countElement();
        System.out.println(c.count(a));
        int b[]={2,3,4,5};
        c.union(a, b);
    }
}
