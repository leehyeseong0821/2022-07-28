package projectA06;

public class projectA0604 {

	public static void main(String[] args) {
//		1~100까지의합
		int i=0;
		int sum= 0;
		while(i<=100) {
			sum= sum+i;
			i++;
		}
		System.out.println(sum);
//		1~50까지의 합
		i=1;
		sum=0;
		while(i<=50) {
			sum=sum+i;
			i++;
		}
		System.out.print(sum);
		System.out.println();
//		1~100까지의 홀수의합
		i=1;
		sum=0;
		while(i<=100) {
			if(i%2!=0) {
				sum=sum+i;
			}
			i++;
			
		}
		System.out.println(sum);
		i=1;
		sum=0;
		while(i<=100) {
			sum = sum+i;
			i= i+2;
		}
		System.out.println(sum);
//		1~100까지의 짝수의합
		i=1;
		sum=0;
		while(i<=100) {
			if(i%2==0) {
				sum= sum+i;
			}
			i++;
		}
		System.out.println(sum);
		i=0;
		sum=0;
		while(i<=100) {
			sum= sum+i;
			i = i+2;
		}
		System.out.println(sum);
	}

}
