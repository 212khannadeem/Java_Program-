import javax.print.attribute.SupportedValuesAttribute;

public class toh {
    public static void towerOfHinoe(int n, String sou ,String help ,String des){
        if(n==1){
            System.out.println("transfer disk "+ n+ " from "+sou+ " to "+des);
            return ;
        }

        towerOfHinoe(n-1, sou, des, help);
        System.out.println("transfer disk "+ n + " from "+ sou + " to "+ des);
        towerOfHinoe(n-1, help, sou, des);
    }
    public static void main(String args[]){
        int n=3;
        towerOfHinoe(n, "S", "H", "D");
    }
    
}
