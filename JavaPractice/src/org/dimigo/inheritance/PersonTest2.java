/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *     | _ PersonTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author 		: Administrator
 * @version		: 1.0
 */
public class PersonTest2 {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Person[] p2 = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍")
		};
		
		greeting(p2);
	}
	private static void greeting(Person[] p2) {
	for(Person p1 : p2) {
		System.out.println(p1);
		p1.sayHello();
		p1.sayBye();
		System.out.println();
	}
	}
}
