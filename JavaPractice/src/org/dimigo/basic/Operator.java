/**
 * 
 */
package org.dimigo.basic;

import javax.net.ServerSocketFactory;
import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * <pre>
 * org.dimigo.basic
 *     | _ Operator
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 *
 * @author 		: Administrator
 * @version		: 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long money=1700000L, human =3, shop = 1500;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : "+String.format("%,d", money));
		System.out.println("점포 내 직원 수 : "+String.format("%,d", human));
		System.out.println("점포 수 : "+String.format("%,d", shop));
		System.out.printf("\n\n");
		System.out.println("연간 인건비 : "+String.format("%,d",  money*12*human*shop));
		

	}

}
