package week1.day2;
import java.util.Scanner;
public class Palindrome {
	
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        
	        int num = scanner.nextInt(), rev = 0, temp = num;
	        
	        while (temp != 0) { rev = rev * 10 + temp % 10; temp /= 10; }
	        if (num == rev) {
	            System.out.println("It is a Palindrome");
	        } else {
	            System.out.println("It is not a Palindrome");
	        }
	        scanner.close();
	    }
	}
