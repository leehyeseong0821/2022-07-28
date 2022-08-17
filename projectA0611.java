package projectA06;

import java.util.Scanner;

public class projectA0611 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("점수를 입력하세요:");
			int score =in.nextInt();
			if(score<0 || score>100) {
			System.out.println("정할수 없는 점수입니다.");
			break;
			}else if(score>=80) {
				System.out.println("축하합니다.");
			}else if(score>=60) {
				System.out.println("합격입니다.");
			}else if(score>=40) {
				System.out.println("연습하세요");
			}else {
				System.out.println("불합격입니다.");
			}
		}

	}

}
