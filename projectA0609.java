package projectA06;

import java.util.Scanner;

public class projectA0609 {

	public static void main(String[] args) {
		  
		Scanner in= new Scanner(System.in);
//		label: 적혀진 구간 사이 break뒤에 label을 지정하면 그라인은 멈춤 while문 앞에 지정해야함
       label:while(true) {
    	   System.out.println("명령문을 입력하세요:");
    	   String input =in.nextLine();
    	   switch(input) {
    	   case "1count":
    		   for(int i=1;i<=100;i++) {
    			   System.out.println(i+" ");
    		   }
    		   System.out.println();
    		   break;
    	   case "exit":
    		   System.out.println("프로그램 종료");
    		   break label;
    	   case "2count":
    		   int sum=0;
    		   for(int i=0;i<=300;i++) {
    			   sum = sum +i;
    		   }
    		   System.out.println("0에서 300까지의 합:"+sum);
    		   break;
    	   case "3count":
    		   continue; //멈춘다 새로운 for식을 
    	   }
    	   int sum=0;
    	   for(int i=0;i<=100;i++) {
    		   if(i%1==0) {
    		   sum = sum+i;
    	   }
       }
       System.out.println("0에서 100까지 합"+sum);
	}
	}

}
