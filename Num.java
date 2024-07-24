import java.util.Scanner;
import java.math.*;
public class Num {
// Sum of digits of a number using recursion
   public static int digitSum(int num) {
      if (num == 0) {
         return 0;
      }
      int l = (num % 10);
      return l + digitSum(num / 10);
   }
// to find the reverse of a number
   public static int reverse(int num) {
      int n = num;
      int rev = 0;
      while (n > 0) {
         int l = n % 10;
         rev = rev*10 + l;
         n /= 10;
      }
      return rev;
   }

// palandrom: if the reverse of the number is same as the original number.
// Print and count Palendrom Number between rance m & n.
   public static int palandrom(int n) {
      if (n == reverse(n)) {
         return n;
      }
      return 0;
   }

   public static void palandrom(int m, int n) {
      while (m < n) {
         if (palandrom(m) > 0)
            System.out.println(m);
         m++;
      }
   }

// factorial
   public static int factorial(int n) {
      if (n == 0) {
         return 1;
      }
      return n * factorial(n - 1);
   }

// factorial between range m & n
   public static void rangeFact(int m, int n) {
      while (m < n) {
         System.out.println(factorial(m));
         m++;
      }
   }

// Spy-number: If the sum of the digits and the product of digits of a given number is equal.
   public static boolean spyNum(int num) {
      int n = num;
      int sum = 0;
      int p = 1;
      while (n > 0) {
         int l = n % 10;
         sum += l;
         p *= l;
         n /= 10;
      }
      return (sum == p);
   }

// Strong Number: If the sum of factorial of digits is equal to the the number.
   public static boolean strong(int num) {
      int n = num;
      int sum = 0;
      while (n > 0) {
         int l = n % 10;
         sum += factorial(l);
         n /= 10;
      }
      return(sum == num);
   }

   public static void strong(int m, int n) {
      while (m < n) {
         if (strong(m) == true) {
            System.out.println(m);
         }
         m++;
      }
   }
//factors of a number= lies from 1 to num/2 and number it self;
   public static void factor(int num){
      if(num>=1){
         System.out.print(1+" ");
         for(int i = 2;  i<= num/2; i++){
            if(num%i == 0)
            System.out.print(i+" ");
         }
         System.out.print(num+" ");
      }
   }
//Perfect Number = sum of the factors of a number (except the number itself) equals the number.
   public static boolean perfect(int num){
      int sum=0;
      for(int i = 1;  i<= num/2; i++){
         if(num%i == 0)
          sum = sum + i;
      }
      return (sum==num);
   }
//Prime= lies between 2 to sqar root of num;
  public static void prime(int m, int n){
   while(m<=n){
      boolean flag = true;
   if(m>1){
      //System.out.println(m);
      for(int i = 2; i*i<= m; i++){
         if(m%i == 0){
            flag = false;
            break;}
         }
         if(flag) System.out.print(m+" ");
      }
      m++;
      }
   }
      
// Neon Number: num^2 digits sum == num; (only 1 and 9 are neon no between 1 to 500)
public static void neon(int m, int n){
   while(m<=n){
      if(digitSum(m*m) == m){
         System.out.println(m+" ");
      }
      m++; 
   }
}

//Duck number: number having zero in there digit
public static boolean duck(int n){
   int num=n;
   boolean flag= false;
   while (num>0){
      if(num%10==0){
         flag = true;
      } 
      num/=10; 
   }
   return flag;
}

//Armstrong: if the sum of squares or cube of digits sum is equal to given number;
public static boolean armstrong(int num){
   int n = num;
   int arm=0;
   if(n>0 && n<10){
      arm = n;
   }
   else if(n>=10 && n<100){
      while(n>0){
         int l=n%10;
         arm= arm+ l*l;
         n/=10;
      }
   }
   else if(n>=100 && n<1000){
      while(n>0){
         int l = n%10;
         arm= arm+ l*l*l;
         n/=10;
      }
   }
   return (arm == num);
}

// Automorphic: if num^2 last set of digits resembles number itself, 25^2 = 625 last is 25 only
public static boolean automorphic(int num){
   int n = num;
   int n2 = num;
   int sqar= num*num;
   int count=0;
   boolean flag = false;
   while(n>0){
      count++;
      n/=10;
   }
  while(n2>0){
    if(n2%10 == sqar%10){
      flag = true;
    }
    else{
      flag = false;
      break;
    }
    sqar/=10;
    n2/=10;
  }
  return flag;
}

// Tech Number: if the digit count id even then split the number into two and sqar it, if the num is == original number
// 2025 = 20    25  : 20+25= 45^2= 2025
public static void techNum(int num){
   int temp1= num;
   int temp2 = num;
   int count= 0;
   while(temp1>0){
      count++;
      temp1/=10;
   }
   if((count & 1) ==0){
      int d=1;
      for(int i =1; i<=count/2; i++){
         d = d*10;
      }
      System.out.println(d);
      int n1=temp2 % d;
      int n2=temp2 / d;
      //n1= temp2 %(int) Math.pow(10, count/2);
      //n2 = temp2 / (int) Math.pow(10, count/2);
      System.out.println(n1 +" "+ n2);
      if(Math.pow((n1+n2), 2) == num){
         System.out.println("Tech num");
      }
      else{
         System.out.println("Not a tech num");
      }
   }
   else{
      System.out.println("Not a tech num");
   }

}

static void fibo(int n){
   int a=0;
   int b= 1;
   System.out.print(a + " ");
   while(n>0){
      System.out.print(b+ " ");
      int temp = a+b;
      a= b;
      b= temp;
      n--;
   }
}
   public static void main(String[] args) {
      // Scanner sc = new Scanner(System.in);
      // System.out.println("Math program");
      // System.out.print("Enter a Number: ");
      // int n = sc.nextInt();
      // System.out.println(n + "Reverse: "reverse(n));
      // System.out.println("Is Palandrom: "+palandrom(323));
      // palanRange(9, 16);
      // System.out.println("121 Is Palandrom: "palandrom(121));
      // System.out.println("Factorial: " + factorial(5));
      // rangeFact(2, 5);
      // System.out.println(spyNum(123));
      // System.out.println(spyNum(131));
      // System.out.println(strong(145));
      // System.out.println(strong(165));
      // strong(135, 150);
      // System.out.println(reverse(234));
      // factor(12);
      // prime(0, 12);
      // System.out.println(perfect(6));
      // System.out.println(perfect(8));
      // neon(0, 10);
      // System.out.println(duck(2506));
      // System.out.println(armstrong(153));
      // System.out.println(armstrong(3));
      // System.out.println(armstrong(25));
      // System.out.println(automorphic(25));
      // System.out.println(automorphic(625));
      // System.out.println(automorphic(5));
      // System.out.println(automorphic(312));
      // techNum(2025);
      // techNum(6543);
      // techNum(431);
      //fibo(6);
   }
}
