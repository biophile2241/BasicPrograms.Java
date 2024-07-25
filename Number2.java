import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Number2 {

    /// ----conditional operator----//
    public static int greater(int a, int b, int c) {
        return a > b ? (a > c ? a : c) : (b > c ? b : c);
    }

    public static int greater(int a, int b) {
        return a > b ? a : b;
    }
    // recursion
    public static int factorialResursion(int n) {
        if (n == 0)
            return 1;
        else {
            return (n * factorialResursion(n - 1));
        }
    }

    public static int factorial(int n) {
        int f = 1;
        while (n > 0) {
            f = f * n;
            n--;
        }
        return f;
    }
    /// -------- Fibonacci --------///
    static void Fibonacci(int a) {
        int t1 = 0;
        int t2 = 1;
        int num;

        for (int i = 0; i < a; i++) {
            if (i == 1) {
                System.out.print(t1 + " ");
                System.out.print(t2 + " ");
            } else {
                num = t1 + t2;
                t1 = t2;
                t2 = num;
                System.out.print(num + " ");
            }
        }
    }


    // trailing zeroes in factorial -> no of zeros in the end of a factorial of
    // number
    // logic= 0 = 5*2 or 10 but 2s > 5s therefore we count only no of 5s,
    // we also need to consider 5^2, 5^3 so on have hidden extra fives.

    static int trailingZero(int n) {
        int res = 0;
        int i = 5;
        while (n > i) {
            res = res + n / i;
            i *= 5;
        }
        return res;
    }

    // panandrom 242, 2332, racecar ulta seesdha ek saman
    static boolean panandrom(int n) {
        int num1 = n;
        int num2 = 0;
        while (num1 > 0) {
            int l = num1 % 10;
            num1 /= 10;
            num2 = (10 * num2) + l;
        }
        if (n == num2)
            return true;
        else
            return false;
    }
    
    /// HCF or GCD(greatest comman divisible) of two number
    // GCD(a, b) where a>b, GCD(a,b)== GCD(a-b, b)
    // GCD(a,b)=GCD(b, a%b)
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static void series(int n, int a, int b) {
        // s1= a+ 2^0.b, sn= a+ 2^0.b + 2^1.b+....+2^(n-1).b;
        int res = a + b;
        System.out.print(res + " ");
        for (int j = 1; j < n; j++) {

            res = res + ((int) Math.pow(2, j) * b);
            System.out.print(res + " ");

        }
        System.out.println();

    }

    static int fastPower(int num, int index) {
        int res = 1;
        // linear time complexity
        // for (int i = 0; i < index; i++) {
        // res = res * num;
        // }
        // return res;
        while (index > 0) {
            // (index&1)== index%2 == 0 : even "even last bit 0, odd last bit 1 check"
            // and operation with one give last bit in output
            if ((index & 1) != 0) {
                res = res * num;
            }
            num = num * num;
            // index/2 == index>>1 and num*2 == num<<1
            index = index >> 1;
        }
        return res;
}

    public static void main(String[] aargs) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        // System.out.println(trailingZero(30));
        // System.out.println(panandrom(232));
        // System.out.println(gcd(24, 60));
        System.out.println(fastPower(2, 6));

    }

}
