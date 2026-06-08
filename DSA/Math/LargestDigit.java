package DSA.Math;

/*
Problem:
Largest Digit

Link:

Approach:
Reverse the number using division and modulo operations and returining the largest digit from integer.

Time Complexity:
O(log 10 num)

Space Complexity:
O(1)
*/
public class LargestDigit {
    public static void main(String[] args) {
        int num = 1218567924;
        int largest = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit > largest) {
                largest = lastDigit;
            }
            num = num / 10;
        }
        System.out.println(largest);
    }
}
