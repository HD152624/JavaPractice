/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *     | _ CarTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author 		: Administrator
 * @version		: 1.0
 */
public class CarTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car3 car3 = new Car3();
		System.out.println("제조사명 : "+car3.getCompany());
		System.out.println("모델명 : "+car3.getModel());
		System.out.println("색상 : "+car3.getColor());
		System.out.println("최대속도 : "+car3.getmaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d",car3.getPrice())+"원");
		System.out.println();
		
		car3=new Car3("기아자동차", "K7", "흰색", 246);
		System.out.println("제조사명 : "+car3.getCompany());
		System.out.println("모델명 : "+car3.getModel());
		System.out.println("색상 : "+car3.getColor());
		System.out.println("최대속도 : "+car3.getmaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d",car3.getPrice())+"원");
		System.out.println();
		
		car3=new Car3("삼성자동차", "SM7", "회색");
		System.out.println("제조사명 : "+car3.getCompany());
		System.out.println("모델명 : "+car3.getModel());
		System.out.println("색상 : "+car3.getColor());
		System.out.println("최대속도 : "+car3.getmaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d",car3.getPrice())+"원");
	}

}
