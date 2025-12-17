package practice;

public class PalindromeStringCheck {
    public static void main(String[] args) {
        String str = "ABCA";
        if(isPalindrome(str)){
            System.out.println(str + "是回文串!");
        }else {
            System.out.println(str + "不是回文串");
        }
    }
    /// ### 回文串判断
    ///
    /// “回文串”是一个正读和反读都一样的字符串，请你实现一个Java程序，判断用户输入的字符串（仅出现英文字符）是否为“回文”串。
    ///
    /// >  ABCBA   就是一个回文串，因为正读反读都是一样的
    /// >  ABCA   就不是一个回文串，因为反着读不一样
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
