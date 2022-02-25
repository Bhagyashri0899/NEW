package day15;

import java.util.Set;
import java.util.EnumMap;
import java.util.Map.Entry;

public class EnumMapTest {

	public static void main(String[] args) {
		EnumMap<Numbers, String> map = new EnumMap<Numbers, String>(Numbers.class);
		
		//Associate values in map
		map.put(Numbers.ONE, "1");
		map.put(Numbers.TWO, "2");
		map.put(Numbers.THREE, "3");
		map.put(Numbers.FOUR, "4");
		map.put(Numbers.FIVE, "5");
		map.put(Numbers.SIX, "6");
		
		Set<Entry<Numbers, String>> entrySet = map.entrySet();
		for (Entry<Numbers, String> entry : entrySet) {
			System.out.println(entry.getKey()+"\t"+ entry.getValue());
		}
		
	}

}
