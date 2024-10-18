public class keypad {
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
"tu", "vwx", "yz"};
    public static void print(String number,int idx,String result){
        if (idx==number.length()) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < keypad[number.charAt(idx)-'0'].length(); i++) {
            char curr=keypad[number.charAt(idx)-'0'].charAt(i);
            print(number, idx+1, result+curr);
        }
    }

    public static void print1(String number,int idx,String result) {
        for (int i = 0; i < keypad[number.charAt(idx)-'0'].length(); i++) {
            char curr=keypad[number.charAt(idx)-'0'].charAt(i);
            for (var j = 0; j < keypad[number.charAt(idx+1)-'0'].length(); j++) {
                System.out.println(curr+keypad[number.charAt(idx+1)-'0'].charAt(j));
            }
        }
    }

    public static void main(String[] args) {
        String s="abc";
        // print(s, 0, "");
        // print1(s, 0, "");
        System.out.println(s.substring(0, 0));
    }
}
