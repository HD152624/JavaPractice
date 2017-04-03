/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *     | _ Question
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 3.
 * </pre>
 *
 * @author 		: Administrator
 * @version		: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] questions = {"1.가장 좋아하는 가수는?", "2.가장 좋아하는 배우는?", "3.가장 좋아하는 과목은?"};
		String[] answers={"빅뱅", "조인성", "응용 프로그래밍"};
		int i;
		for(i=0; i<3; i++) {
		System.out.println(questions[i]);
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		if(answer.equals(answers[i])) System.out.println("정답입니다!");
		else System.out.println("틀렸습니다!");
		}
		String[] questions2 = {"가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목은?"};
		System.out.println("<<결과 출력>>");
		
		for(i=0; i<3; i++)
			{
			StringBuilder a = new StringBuilder(questions2[i]+" "+answers[i]);
			System.out.println(a.append("입니다."));
			}
		

	}

}
