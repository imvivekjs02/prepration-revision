package DSA.Math;
/*
Problem:
Palindrome Number

Link:
https://leetcode.com/problems/palindrome-number/description/?envType=problem-list-v2&envId=do1uosyi

Approach:
Palindrome number using division and modulo operations and check if it is same as original number.

Time Complexity:
O(log 10 num)

Space Complexity:
O(1)
*/

public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int copy = num;
        int reverse = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        if (copy == reverse) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
