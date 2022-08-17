package projectA06;

public class projectA0613 {

	public static void main(String[] args) {
		int i=0;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=9);
       System.out.println();
		i=0;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=100);
		System.out.println();
		i=0;
		int sum=0;
		do {
			
			if(i%2!=0) {
				sum = sum+i;
			}
			 i++;
		}while(i<=100);
		System.out.println("홀수의 합:"+sum);
		
		
	}

}
