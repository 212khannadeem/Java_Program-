import java.util.HashMap;
import java.util.HashSet;

public class hasshing{
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        System.out.println(set);
        if (set.contains(20)) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        set.remove(10);
    }
}