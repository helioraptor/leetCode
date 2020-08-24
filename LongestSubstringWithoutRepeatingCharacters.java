import java.util.HashMap;
import static java.lang.Integer.*;

//Given a string, find the length of the longest substring without repeating characters.
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        var maxLen = 0;
        var lastSeenAt = new HashMap<Character, Integer>();
        int cutoff = -1;

        for(var i1 = 0; i1!=s.length(); i1++){
            char c = s.charAt(i1);
            int lastSeen = -1;
            if (lastSeenAt.containsKey(c)) {
                lastSeen = lastSeenAt.get(c);
            }
            var Len = i1 - Integer.max(lastSeen,cutoff);

            if(maxLen < Len){
                maxLen = Len;
            }

            if (!lastSeenAt.containsKey(c)) {
                lastSeenAt.put(c,i1);
            }
            else{
                if(cutoff < lastSeenAt.get(c)){
                    cutoff = lastSeenAt.get(c);
                }
                lastSeenAt.replace(c,i1);
            }
        }
        return maxLen;
    }
}
