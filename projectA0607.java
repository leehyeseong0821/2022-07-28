package projectA06;

import java.util.Scanner;

public class projectA0607 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		String input ="";
		boolean tag = true;
		
		while(tag) {
			System.out.println("명령문을 입력:");
			input =in.nextLine();
			switch(input) {
			case "exit":
				System.out.println("종료합니다.");
				tag=false; //while 탈출 입력시 멈춤 
				break;
			case "copy":
				System.out.println("프로그램을 복사합니다.");
				break;
			case "comp":
				System.out.println("프로그램을 비교합니다.");
				break;
			case "cat":
				System.out.println("문자열을 출력합니다.");
				break;
				default:
					System.out.println("틀렸습니다.");
				break;
			}
			System.out.println("기타프로그램 설정작업");
		}
	}

}
