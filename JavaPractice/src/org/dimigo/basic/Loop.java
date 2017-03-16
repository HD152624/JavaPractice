/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *     | _ Loop
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 *
 * @author 		: Administrator
 * @version		: 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int exp=100;
		while(true)
		{
		int num = new Random().nextInt(4);
		System.out.println("--------------------");
		System.out.println("<<게임 메뉴>>");
		System.out.println("1. 공격력 증가");
		System.out.println("2. 공격력 감소");
		System.out.println("3. 캐릭터 설정");
		System.out.println("9. 종료");
		System.out.println("--------------------");
		System.out.printf("메뉴 입력 => ");
		Scanner scanner = new Scanner(System.in);
		int choice;
		choice = scanner.nextInt();
		switch(choice)
		{
		case 1: System.out.printf("공격력이 증가되었습니다. 현재 공격력 : %d\n", exp+10); break;
		case 2: System.out.printf("공격력이 감소되었습니다. 현재 공격력 : %d\n", exp-10); break;
		case 3:
			if(num==1) System.out.printf("마법사");
			else if(num==2) System.out.printf("영주");
			else if(num==3) System.out.printf("기사");
			else System.out.printf("농민");
			System.out.println("(으)로 설정되었습니다."); break;
		case 9: System.out.println("이제 공부하세요!"); break;
		default: System.out.println("없는 메뉴입니다!!");
		}
	}

}
}
