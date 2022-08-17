package projectA06;

import java.util.Scanner;

public class projectA0602 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("두수를 입력하시오");
		int int1=in.nextInt();
		int int2=in.nextInt();
//		입력된 2수 사이의 합:
		int sum =0;
		for(int i=1;i<=int2;i++) {
			sum = sum+i;
		}
		System.out.println("두수 사이의 합:"+sum);
//		입력된 2수 사이를 출력
		for(int i=1;i<=int2;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
//		입력된 2수 사이의 8배를 출력 
		System.out.println("8의 배수는:");
		for(int i=1;i<=int2;i++) {
			if(i%8==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("짝수는:");
	   for(int i=1;i<=int2;i++) {
		   if(i%2==0) {
			   System.out.print(i+" ");
		   }
	   }
         System.out.println();
         System.out.println("홀수합:");
         int sum2 =0;
         for(int i=1;i<=int2;i++) {
        	 if(i%2!=0) {
        		 sum2 = sum2 +i;
        	 }
        
         }
    	 System.out.println(sum2);
    	 System.out.println("4의배수합:");
//    	 입력된 2수 사이의 4의 배수를 출력하고 그합을구해
    	 int sum1=0;
    	 for(int i=1;i<=int2;i++) {
    		 if(i%4==0) {
    			 sum1 = sum1+i;
    		 }
    	 }
    	 System.out.println(sum1);
    	 
	}

}
