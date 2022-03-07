import java.util.*;
import java.util.Map.Entry;
class Mapping
{
	public static void main( String []args)
	{
		HashMap<String, String> map = new HashMap<>();
		
		map.put("Abc@gmail.com", "Abc@123");
		map.put("Xyz@gmail.com", "Xyz@213");
		map.put("Bbc@yahoo.com", "Bbc@456");
		map.put("Name@rediff.com", "Name@1234");
		
		Set <Entry<String, String>> eset = map.entrySet(); 
		// returns all the entries (key value pairs) of the map in form of a Set 
		
		for(Entry<String, String> e : eset)
			System.out.println(e.getKey()+"  "+e.getValue());
	}
}
