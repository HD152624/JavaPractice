/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * <pre>
 * org.dimigo.collection
 *     | _ MelonGenreChart
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 13.
 * </pre>
 *
 * @author 		: Administrator
 * @version		: 1.0
 */
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Music> ballade = new ArrayList<>();
		List<Music> dance = new ArrayList<>();
		Map<String, List<Music>> map = new HashMap<>();
		map.put("[발라드]",  ballade);
		map.put("[댄스]",  dance);
		
		dance.add(new Music("I LUV IT", "PSY"));
		dance.add(new Music("맞지?", "언니쓰"));
		ballade.add(new Music("팔레트", "아이유"));
		
		System.out.println("-- << 멜론 장르별 챠트 >> -- ");
		printMap(map);
		
		System.out.println("-- << 댄스 2위 곡 변경 >> -- ");
		dance.set(1, new Music("SIGNAL", "트와이스"));
		printMap(map);
		
		System.out.println("-- << 댄스 1위 곡 삭제 >> --");
		dance.remove(0);
		printMap(map);
		
		System.out.println("-- << 전체 리스트 삭제 >> --");
		map.clear();
		printMap(map);
		

	}

	private static void printMap(Map<String, List<Music>> map) {
		for(String key : map.keySet())
		{
			System.out.println(key);
			
			for(int n=1; n<=map.get(key).size(); n++)
			{
				System.out.println(n + "." + map.get(key).get(n-1));
			}
			
		}
		System.out.println();
	}
}
