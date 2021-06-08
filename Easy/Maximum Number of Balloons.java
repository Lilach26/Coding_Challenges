/*
Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
You can use each character in text at most once. Return the maximum number of instances that can be formed.

Example 1:
Input: text = "nlaebolko"
Output: 1

Example 2:
Input: text = "loonbalxballpoon"
Output: 2

Example 3:
Input: text = "leetcode"
Output: 0

Constraints:
1 <= text.length <= 104
text consists of lower case English letters only.
*/

class Solution 
{
    public int maxNumberOfBalloons(String text) 
    {
        int[] letters = new int[26];
        int counter = 0, letterB = 0, letterA = 0, letterO = 0, letterL = 0, letterN = 0;
        
        for (char letter : text.toCharArray())
        {
            switch (letter)
            {
                case 'b':
                    letterB++;
                    break;
                case 'a':
                    letterA++;
                    break;
                case 'n':
                    letterN++;
                    break;
                case 'o':
                    letterO++;
                    break;
                case 'l':
                    letterL++;
                    break;
            }
        }
        
        for (int i = 0; i < text.length() / 7; i++)
        {
            if (letterB >= 1 && letterA >= 1 && letterN >= 1 && letterO >= 2 && letterL >= 2)
            {
                letterB--;
                letterA--;
                letterN--;
                letterO -= 2;
                letterL -= 2;
                
                counter++;
            }
        }
        
        return counter;
    }
}
