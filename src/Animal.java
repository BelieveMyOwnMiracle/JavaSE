import java.util.HashSet;
import java.util.Set;

public class Animal {
    public static void main(String[] args) {
        String s = " ";
        System.out.println(new Solution().lengthOfLongestSubstring(s));
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                ans = Math.max(set.size(), ans);
                set.clear();
                set.add(c);
            }else{
                set.add(c);
            }
        }
        return ans;
    }
}

