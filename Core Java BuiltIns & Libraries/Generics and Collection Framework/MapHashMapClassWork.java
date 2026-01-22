// 17-1-26
// Map            
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SeventeenJanuary {
	public static void main(String[] args) {
		
		
		Map hm = new HashMap();
		System.out.println(hm.put(1, "Kabir")); //null
		System.out.println(hm.put(12.2, 12.5)); //null
		System.out.println(hm.put(1, "Mohit")); //Kabir
		System.out.println(hm);
		System.out.println(hm.put(null, null));
		System.out.println(hm.put(true, 10));
		System.out.println(hm.put('a', 'a'));
		System.out.println(hm.put("LPU", 100));
		System.out.println(hm);
		
		System.out.println(hm.remove(true));
		System.out.println(hm.remove("Jalandhar"));
		
		System.out.println(hm.containsKey(true));
		System.out.println(hm.containsKey("LPU"));
		
		System.out.println(hm.containsValue("Kabir"));
		System.out.println(hm.containsValue(10));
		
		System.out.println(hm.get('a'));
		
		Set entries = hm.entrySet();
		System.out.println("Set: "+entries);
		
		for(Object obj : entries) {
			System.out.println(obj);
		}
		Set keys = hm.keySet();
		System.out.println("Keys: "+keys);
		
		Iterator itr = keys.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collection values = hm.values();
		System.out.println("Values: "+values);
		
		Iterator itr2 = values.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		Map<String, Double> map = new HashMap<>();
		
		map.put("ABC", 70000.0);
		map.put("DEF", 50000.0);
		map.put("GHI", 60000.0);
		map.put("JKL", 30000.0);
		map.put("MNO", 50000.0);
		map.put("PQR", 20000.0);
		
		for(Map.Entry<String,Double> mapElement : map.entrySet()) {
			
			if(mapElement.getValue() > 50000) {
				System.out.println(mapElement.getKey()+" has salary above 50000.0");
			}
		}
		
		
	}
}
