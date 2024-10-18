import java.util.*;


class Bloodgroup
{
    String str;
    Bloodgroup(String s)
    {
        str=s;
        switch (s) {
            case "A+":
            case "a+":
                System.out.println("You may proceed. Your blood type is "+str);
                break;
            case "A-":
            case "a-":
                System.out.println("You may proceed. Your blood type is "+str);
                break;
            case "B+":
            case "b+":
                System.out.println("You may proceed. Your blood type is "+str);
                break;
            case "B-":
            case "b-":
                System.out.println("You may proceed. Your blood type is "+str);
                break;
            case "O+":
            case "o+":
                System.out.println("You may proceed. Your blood type is "+str);
                break;
            case "O-":
            case "o-":
                System.out.println("You may proceed. Your blood type is "+str);
                break;
            case "AB+":
            case "ab+":
                System.out.println("You may proceed. Your blood type is "+str);
                break;
            case "AB-":
            case "ab-":
                System.out.println("You may proceed. Your blood type is "+str);
                break;
        
            default:
                System.out.println("Invalid Blood Type ");
                break;
        }
    }
}

class p2  
{  
    public static void main(String[] args)  
    {  
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Your Name: ");  
        String name= sc.nextLine();   
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        System.out.println();
        System.out.print("Enter Your Blood Group: ");
        String bg = sc.next();
        System.out.println();
        Bloodgroup b = new Bloodgroup(bg);

    }  
}  