import java.util.ArrayList;
public class ArrayLists{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("woam");
		list.add("john");
		list.add("emma");
		list.add("ejow");
		list.add("kow");
		//list.clear(); 
		
		//list.add(2,"ifeanyi");
		//list.remove("john");
		//list.remove("3");
		
		list.add( 2,"yiou");
		list.set(3,"peter");
		
		//System.out.println(list.get(3));
		
		for (String name:list){
			System.out.printf("%s%n",name);
		}
	}
}

