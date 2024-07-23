package course4.homework;

public class Palindrome {
    public static void main(String[] args) {
       // palindrome("abc");
        palindrome(1221);
    }

    private static void palindrome(int a) {
        //if (str.length() < 2) {
        //    System.out.println("The number is too small");
        //} else if (str==) {
        //ex: 1221
        //1221%10 => 122 rest 1 => b=1
        //1221/1000 => 1 r 221 => c=1
        //1221/100 =>12 r 21 => 1+2 == 2+1
        //1221



       for (int i = 0; i < a; i++) {
           int b = a%10;
           int c = a/10;
           int d=a/100;
           int e=a%100;
           int f=d/10;
           int g=d%10;
           int s1=f+g;
           int h=e/10;
           int j=e%10;
           int s2=h+j;
           if(b==0){
               System.out.println("The number is too short");
           } else if (b==c && s1==s2 ) {
               System.out.println("The number is a palindrome");
           }
           else {
               System.out.println("The number is not a palindrome");
           }
       }




    }
}
