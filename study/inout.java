package study;

import java.util.Scanner;





public class inout {

       public static void main(String[] args) {

 

           //1.배열생성           

           String[] names = new String[5];

           int size = names.length;

 

             //2.입력받기

           Scanner put = new Scanner(System.in);

          

             //3.입력된 이름을 배열에 순서에 맞게 저장

           for(int i=0; i<size; i++){
        	   
        System.out.print("이름을 입력하세요. ");

            names[i] = put.nextLine();            

           }

          

             for(int i=0; i<size; i++){

       //4.화면에 입력된 이름을 표시한다.

           System.out.println("이름: " +names[i]);

       }

       }

}