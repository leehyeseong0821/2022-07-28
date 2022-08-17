package projectA06;

import java.util.Scanner;

public class projectA0615 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("첫번째 수 입력");
		int num1 = Integer.parseInt(in.nextLine());
		System.out.println("두번째 수 입력");
		int num2 = Integer.parseInt(in.nextLine());
		
		int i=0;
		i =num1;
		do {
			System.out.print(i+ "");
			i++;
		}while((i>=num1 && i<=num2));
		System.out.println();
//		두사이 홀수의합
		i=0;
		i=num1;
		int sum=0;
		do {
			if(i%2!=0) {
				sum= sum+i;
				
			}
			i++;
		}while((i>=num1&& i<=num2));
		System.out.println("홀수의 합:"+sum);
    
//        짝수의 합 
        i=0;
        i=num1;
        sum=0; 
        do {
        	if(i%2==0) {
        		sum = sum+i;
        	}
        	i++;
        }while((i>=num1&& i<=num2));
          
        System.out.println("짝수의 합:"+sum);
	}

}
