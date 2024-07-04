package practice4;

public class HCFExample {
    // Function to find HCF
    public static void findHCF(int a, int b) {
        int hcf = 1;
        int smaller = (a < b) ? a : b;
        
        for (int i = 1; i <= smaller; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        
        System.out.println("HCF of " + a + " and " + b + " is: " + hcf);
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 8;

        // Finding HCF
        findHCF(num1, num2);
        
        
        
        String a="ramesh";
        String b="marwade";
        
        a=a+b;
        b=a.substring(0, (a.length()-b.length())); //rameshmarwade
        System.out.println(b); 
        a=a.substring((a.length()-b.length())-1);  //13-6=7   //6
        System.out.println(a);
        
        String temp=a ;//ramesh
        a=b;//marwade
        b=temp;
        
        
        
        
    }
}