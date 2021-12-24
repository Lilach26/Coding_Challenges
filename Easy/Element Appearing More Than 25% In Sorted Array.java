/*
Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.

Example 1:
Input: arr = [1,2,2,6,6,6,6,7,10]
Output: 6

Example 2:
Input: arr = [1,1]
Output: 1

Constraints:
1 <= arr.length <= 104
0 <= arr[i] <= 105
*/

class Solution {
    public int findSpecialInteger(int[] arr) {
        int q = Math.round(arr.length / 4) + 1;
        int res = 0, temp = 1;

        if (arr.length == 1) return arr[res];

        for (int i = 1; i < arr.length; i++) {
          if (arr[i] != arr[i - 1]) {
            temp = 1;
          }
          else {
            temp++;
            if (temp >= q) {
              res = arr[i];
              break;
            }
          }
        }

        return res;
    }
}
