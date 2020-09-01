/**
 * @description:
 * @author: WangJun
 * @time: 2020/8/29 15:57
 */
public class Question6 {
        public static String longestPalindrome(String s) {
            if(s.length()<2||s==null)
                return s;
            int length = s.length();
            String longest = "";
            int maxlength = longest.length();
            for(int i = 0;i<length-1;++i){
                if(getLongString(s,i).length()>maxlength){
                    longest = getLongString(s,i);
                    maxlength = longest.length();
                }
            }
            return longest;
        }
        public static String getLongString(String s ,int mid){
            int left=mid -1,right = mid+1;
            while(right<s.length()&&s.charAt(right)==s.charAt(mid))
                ++right;
            while(right<s.length()&&left>=0){
                if(s.charAt(left)==s.charAt(right)){
                    right++;
                    left--;
                }
                else break;
            }
            return s.substring(left+1,right);
        }

    public static void main(String[] args) {
        System.out.printf(longestPalindrome("a"));
    }
}
