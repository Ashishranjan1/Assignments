package exam3_q1;

import java.util.HashMap;
import java.util.Map;

public class q1 {
		public static void main(String args[])
	{
			Map<String, Integer> map=new HashMap<String, Integer>();
			map.put("raj", 95);
			map.put("ekta", 75);
			map.put("rajiv", 85);
			map.put("sunita", 66);
			map.put("gunika", 99);
			System.out.println("------printing map using stream------");
			//q1 
			
			map.entrySet().stream().forEach(e->System.out.println("key :" +e.getKey()+", value : "+e.getValue()));
			
			//q2
			System.out.println();
			System.out.println("print only that records that contain key contains raj");
			map.entrySet()
			.stream()
			.filter(m->m.getKey().contains("raj"))
			.forEach(e->System.out.println("key :" +e.getKey()+", value : "+e.getValue()));
			
			//q3
			System.out.println();
			System.out.println(" print map sorted by key");
			
			map.entrySet()
			.stream()
			.sorted((a,b)->a.getKey().compareTo(b.getKey()))
			.forEach(e->System.out.println("key :" +e.getKey()+", value : "+e.getValue()));
			
			//q4
			System.out.println();
			System.out.println(" print map sorted by values");
			
			map.entrySet()
			.stream()
			.sorted((a,b)->a.getValue().compareTo(b.getValue()))
			.forEach(e->System.out.println("key :" +e.getKey()+", value : "+e.getValue()));
			
			//q5
			System.out.println();
			System.out.println(" print map reverse sorted by key");
			
			map.entrySet()
			.stream()
			.sorted((a,b)->b.getKey().compareTo(a.getKey()))
			.forEach(e->System.out.println("key :" +e.getKey()+", value : "+e.getValue()));
			
	}
}
