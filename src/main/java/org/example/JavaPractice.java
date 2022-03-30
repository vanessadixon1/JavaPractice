package org.example;

/**
 * This is an Exercise that converts the Kilometer Per Hour to Miles Per Hour
 *
 */
public class JavaPractice
{
    public static void main(String[] args) {

    }


    public static int sumDigits(int number) {

        int count = 0;

        while(number > 0) {
            int num = number % 10;
            System.out.println(num);
            count  += num;
            number /= 10;
        }
        return count;
    }

    /**
     *this method take in a number and checks that the number is the same if it's reversed example 121 reversed equals 121
     * @param number
     * @return
     */
    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int currentNumber = number;

        //removes the negative
        if (number < 0) {
            number *= -1;
            currentNumber = number;
        }

        while(number > 0) {
            //gets the last number
            int lastDigit = number % 10;
            //increase the place value of reverse by one
            reversedNumber = reversedNumber * 10;
            //add last number to reverseNumber
            reversedNumber += lastDigit;
            //remove last digit from number
            number /= 10;
        }

        if (currentNumber == reversedNumber) {
            return true;
        } else {
            return false;
        }
    }
    public static int SumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int last = number % 10;
        int firstNumber = 0;
        while (number > 0) {
            firstNumber = number % 10;
            number /= 10 ;
        }
        int results = firstNumber + last;

        return results;
    }

    /**
     * this method will take in an int and see if any of the numbers in the int are even, if the number is even it will be added to the sum
     * @param number
     * @return
     */
    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }

        int sum = 0;
        while(number > 0) {
            int lastDigit = number % 10;
            if(lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            number /=10;
        }
        return sum;
    }

    /**
     * the purpose of this  method is to receive two numbers and check if the int numbers have a common number in both
     * @param num1 - first int number
     * @param num2 - second int number
     * @return - returns a boolean
     */
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        if( (num1/10)== (num2/10)|| (num1/10 )==( num2 % 10)||  (num1 % 10)== (num2/10) ||  (num1 % 10) == (num2 % 10)){
            return true;
        }else {
            return false;
        }
    }

    /**
     * this method return true if at least two of the numbers share the same rightmost digit otherwise false
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (num1 < 10 || num1 > 1000 || num2 < 10 || num2 > 1000 || num3 < 10 || num3 > 1000) {
            return false;
        }
        int num1LastNum = num1 % 10;
        int num2LastNum = num2 % 10;
        int num3LastNum = num3 % 10;

        if (num1LastNum == num2LastNum || num1LastNum == num3LastNum || num2LastNum == num3LastNum) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * this method will return true if the argument is within the range 10(inclusive) - 1000(inclusive) and false otherwise
     */
    public static boolean isValid(int num) {
        if (num < 10 || num > 1000) {
            return false;
        } else {
            return true;
        }
    }


}
