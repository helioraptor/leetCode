import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
/*
Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
*/
    public void Test1() {
        var t = new LongestSubstringWithoutRepeatingCharacters();
        var l = t.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, l);
    }

/*
Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
*/
    @Test
    public void Test2() {
        var t = new LongestSubstringWithoutRepeatingCharacters();
        var l = t.lengthOfLongestSubstring("bbbbb");
        assertEquals(1,l);
    }

/*
Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/
    @Test
    public void Test3() {
        var t = new LongestSubstringWithoutRepeatingCharacters();
        var l = t.lengthOfLongestSubstring("pwwkew");
        assertEquals(3,l);
    }

    @Test
    public void Test4() {
        var t = new LongestSubstringWithoutRepeatingCharacters();
        var l = t.lengthOfLongestSubstring(" ");
        assertEquals(1,l);
    }

    @Test
    public void Test5() {
        var t = new LongestSubstringWithoutRepeatingCharacters();
        var l = t.lengthOfLongestSubstring("abc");
        assertEquals(3,l);
    }

    @Test
    public void Test6() {
        var t = new LongestSubstringWithoutRepeatingCharacters();
        var l = t.lengthOfLongestSubstring("aabaab!bb");
        assertEquals(3,l);
    }

}