package a07_����;

import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��� �ּ���(0 ~ 100): ");
		int score = input.nextInt();
		
		if(score > 100 || score < 0) {
			System.out.println("�߸��� ���� �Դϴ�.");	
		}else if(89 < score) {
			System.out.println("A");
		}else if(79 < score) {
			System.out.println("B");
		}else if(69 < score) {
			System.out.println("C");
		}else if(59 < score) {
			System.out.println("D");
		}else {
			System.out.println("F");	
		}

	}	
	}
