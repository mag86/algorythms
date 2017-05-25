/**
 * Created by admin on 24.05.2017.
 */
public class UniqueSubstring {

    public static void main(String[] args) {
        new UniqueSubstring().lengthOfLongestSubstring("abcabcbb");

    }


    public int lengthOfLongestSubstring(String s) {
            String sub = new String();
            String subMax = new String();
            int counter =0;
            int counterMax =0;
            for (int i = 0; i < s.length()-1; i++){
                if (s.charAt(i)!=s.charAt(i+1)){
                    sub = s+s.charAt(i);
                    counter++;
                }
                else {
                    if (counter>counterMax){
                        counterMax = counter;
                        subMax = sub;
                    }
                }
            }
            return counterMax;


        }

}
