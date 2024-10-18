public class q3 {
    public static void main(String args[]) {
        String str="bilal";
        boolean flag=true;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    flag=false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("String element is Unique");
        }
        else{
            System.out.println("String element is not Unique");
        }
    }
}
