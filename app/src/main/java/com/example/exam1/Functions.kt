package com.example.exam1

class Functions {

    //დაწერეთ ფუნქცია რომელიც პარამეტრად მიიღებს ორ მთელ რიცხვს და დააბრუნებს მათ უსჯ.

    private fun findLCM(a: Int, b: Int): Int {

        val biggerNum = if(a > b) a else b
        var lcm = biggerNum
        while(true) {

            if(((lcm % a) == 0) && ((lcm % b) == 0)) {
                break
            }

            lcm  += biggerNum
        }

        return lcm

    }

    //დაწერეთ ფუნქცია რომელიც პარამეტრად მიიღებს ორ მთელ რიცხვს და დააბრუნებს უსგ.

    private fun findGCD (a: Int, b: Int): Int {

        var n1 = a
        var n2 = b

        while (n1 != n2) {
            if (n1 > n2)
                n1 -= n2
            else
                n2 -= n1
        }

        return n1

    }

    //დაწერეთ ფუნქცია რომელიც პარამეტრად მიიღებს String მონაცემს და დააბრუნებს პასუხს შეიცავს თუ არა ეს მონაცემი შემგედ სიმბოლოს ‘$’’

    private fun findSymbol(a: String): Boolean {

        return a.contains('$')
    }

    //აწერეთ რეკურსიული ფუნქცია რომელიც დაითვლის 100-მდე ყველა ლუწი რიცხვების ჯამს

    fun main() {
        println(recursionSum(100))
    }

    private fun recursionSum(num: Int): Int {
        return if (num != 0)
            num + recursionSum(num - 1)
        else
            num
    }

    //აწერეთ ფუნქცია რომელიც პარამეტრად მიიღებს მთელ რიცხვს და დააბრუნებს ამ რიცხვის შებრუნებულს. მაგალითად შემოვიდა 10220 უნდა დაბრუნდეს 2201

    private fun palindrome(number: Int): Int {

        var num = number
        var reversedInteger = 0
        var remainder: Int

        while (num != 0) {
            remainder = num % 10
            reversedInteger = reversedInteger * 10 + remainder
            num /= 10
        }

        return reversedInteger
    }

    //დაწერეთ ფუნქცია რომელიც პარამეტრად მიიღებს String მონაცემს და დააბრუნებს პასუხს არის თუ არა ეს მონაცემი პოლინდრომი

    private fun isPalindromeString(inputStr: String): Boolean {

        val sb = StringBuilder(inputStr)

        val reverseStr = sb.reverse().toString()

        return inputStr.equals(reverseStr, ignoreCase = true)
    }
}