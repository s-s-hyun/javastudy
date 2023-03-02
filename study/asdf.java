package study;
import java.util.Scanner;
import java.util.*;

public class asdf {

      public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           List<String> names = new ArrayList<String>();
           
           while(true) {
              System.out.print("이름을 입력해주세요:");
              String inputValue = scanner.nextLine();
              
              if (inputValue.equals("")) { 
                 break;
                 }
              
              names.add(inputValue);
           }
           System.out.println(names);
      }
}