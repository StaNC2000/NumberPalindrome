package com.eS;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int ifPalindrome = number;
        int reminder;

        while (ifPalindrome != 0){
            reminder = ifPalindrome % 10;
            reverse = reverse * 10 + reminder;
            ifPalindrome = ifPalindrome / 10;

            if (reverse == number){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // write your code here

        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(-100000001));
        System.out.println(isPalindrome(10231));
    }
}
