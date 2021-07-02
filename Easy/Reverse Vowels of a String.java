/*
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.

Example 1:
Input: s = "hello"
Output: "holle"

Example 2:
Input: s = "leetcode"
Output: "leotcede"

Constraints:
1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
*/

class Solution 
{
    public String reverseVowels(String s) 
    {
        List<Character> letters = List.of('a', 'u', 'o', 'i', 'e', 'A', 'U', 'O', 'I', 'E');
        char[] stringLetters = s.toCharArray();
        int i = 0, j = s.length() - 1;

        while (i < j)
        {
            while (i < j && !letters.contains(stringLetters[i]))
            {
                i++;
            }

            while (i < j && !letters.contains(stringLetters[j]))
            {
                j--;
            }

            char temp = stringLetters[i];
            stringLetters[i] = stringLetters[j];
            stringLetters[j] = temp;
            i++;
            j--;
        }

        return new String(stringLetters);
    }
}
