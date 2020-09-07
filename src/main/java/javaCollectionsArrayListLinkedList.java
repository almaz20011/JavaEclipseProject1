import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class javaCollectionsArrayListLinkedList {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("java");
		a.add("java");
		a.add("she");
		System.out.println(a);
		a.add(0,"student");
		System.out.println(a);
		
//		a.remove(1);
//		System.out.println(a);
//		a.remove("java");
		System.out.println(a.get(2));
		System.out.println(a.contains("testing"));
		
		System.out.println(a.contains("java"));
		System.out.println(a.indexOf("rahul"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("INDIA");
		hs.add("she");
		hs.add("he");
		
		System.out.println(hs);
		System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		Iterator<String>i=hs.iterator();
//		System.out.println(i.next());  
//		System.out.println(i.next());  
//		System.out.println(i.next()); 
//		System.out.println(i.next()); 
//		System.out.println(i.next()); 
//		System.out.println(i.next()); 
//		System.out.println(i.next()); 
//		
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0,"hello");
		hm.put(1,"Gudbye");
		hm.put(42,"morning");
		hm.put(3,"evening");
		System.out.println(hm);
		
		System.out.println(hm.get(42));
		Set sn = hm.entrySet();
		System.out.println(sn);
		Iterator it = sn.iterator();
	
		while(it.hasNext()) {
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
