import java.util.*;
public class MapDemo{
	public static void main(String args[]){
	  HashMap<Integer,String> mapObj=new HashMap<>();

	  mapObj.put(1,"abc");
	  mapObj.put(2,"def");
	  mapObj.put(3,"fdsc");
	  mapObj.put(4,"fsdg");

	  Collection<String> values=mapObj.values();
	  
	  System.out.println(values);

	  Set<Integer> keySets=mapObj.keySet();
//	  System.out.println(keySets);
	  Iterator<Integer> iter=keySets.iterator();
	  
	  while(iter.hasNext()){
	  	Integer key=iter.next();

	  	String value=mapObj.get(key);

	  	System.out.println(key+"->"+value);
	  	iter.remove();		// causes removal of all values
	  }
	  mapObj.remove(1);				// removal in map also removes in set.
	  System.out.println(keySets);

	}
}