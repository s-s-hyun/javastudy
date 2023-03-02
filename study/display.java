package study;
import java.util.Scanner;
import java.util.*;

public class display {

      public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           int number = scanner.nextInt();
           for(int i=1; i<=number; i++ ) {
       	    if(i % 2 == 0) {
       		System.out.println(i);
       	   }
          }
      }
}