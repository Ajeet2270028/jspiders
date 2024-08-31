package compareble;

import java.util.TreeSet;
import java.util.function.Consumer;

public class ConsumerInterfaceTreeSet {
	public static void main(String[] args) {
		//NameComparision nc=new NameComparision();
		TreeSet<String> l=new TreeSet<String>();
		l.add("Rakesh");
		l.add("Ramesh");
		l.add("Ajeet");
		l.add("Kamesh");
		l.add("Suresh");
		l.add("Rahul");
//		for(String st:l) {
//			System.out.println(st);
//		}
		
		Consumer<String> consumer=new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t+"->"+t.length());
			}
		};
		
		Consumer<String> consumer1=t->System.out.println(t+" ->"+t.length());
		Consumer<String> consumer2=System.out::println;
		l.forEach(consumer2);
	}
}
