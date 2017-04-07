/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *     | _ SnackTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 *
 * @author 		: Administrator
 * @version		: 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a, b, c;
		// TODO Auto-generated method stub
		Snack snack = new Snack("새우깡", "농심", 1100, 2);
		System.out.println("이름 : "+snack.getName());
		System.out.println("제조사 : "+snack.getCompany());
		System.out.println("가격 : "+String.format("%,d",snack.getPrice())+"원");
		System.out.println("개수 : "+snack.getNumber()+"개");
		System.out.println();
		a=snack.calcPrice();
		
		
		snack = new Snack("콘칲", "크라운", 1200, 1);
		System.out.println("이름 : "+snack.getName());
		System.out.println("제조사 : "+snack.getCompany());
		System.out.println("가격 : "+String.format("%,d",snack.getPrice())+"원");
		System.out.println("개수 : "+snack.getNumber()+"개");
		System.out.println();
		b=snack.calcPrice();
		
		snack = new Snack("허니버터칩", "해태", 1500, 4);
		System.out.println("이름 : "+snack.getName());
		System.out.println("제조사 : "+snack.getCompany());
		System.out.println("가격 : "+String.format("%,d",snack.getPrice())+"원");
		System.out.println("개수 : "+snack.getNumber()+"개");
		System.out.println();
		c=snack.calcPrice();
		
		int sum=a+b+c;
		
		System.out.println("총 구매 금액 : " +String.format("%,d", sum)+"원");

	}

}
