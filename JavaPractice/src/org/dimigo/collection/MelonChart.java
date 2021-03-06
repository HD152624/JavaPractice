/**
 * 
 */
package org.dimigo.collection;
import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 *     | _ MelonChart
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 12.
 * </pre>
 *
 * @author 		: Administrator
 * @version		: 1.0
 */
public class MelonChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Music> list = new ArrayList<Music>();
		list.add(new Music("I LUV IT", "PSY"));
		list.add(new Music("맞지?", "언니쓰"));
		
		System.out.println("-- << 멜론 챠트 >> -- ");
		printList(list);
		
		System.out.println("-- << 2위 곡 추가 >> --");
		list.add(1, new Music("SIGNAL", "트와이스"));
		printList(list);
		
		System.out.println("-- << 3위 곡 변경 >> --");
		list.set(2, new Music("팔레트", "아이유"));
		printList(list);
		
		System.out.println("-- << 2위 곡 삭제 >> --");
		list.remove(1);
		printList(list);
		
		System.out.println("-- << 전체 리스트 삭제 >> --");
		list.clear();
		printList(list);

	}

	/**
	 * @param list
	 */
	private static void printList(List<Music> list) {
		// TODO Auto-generated method stub
		int n = 1;
		for(Music music : list)
		{
			System.out.printf(n + ". ");
			System.out.println(music.toString());
			n++;
		}
		System.out.println();
	}

}


