import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Foo {
	public static void main(String args[]) {
		List<String>list=Arrays.asList("java","is","fun");
		Stream<String> s=list.stream();
			
	
	s.forEach(e-> System.out.println(e));
	s.forEach(e-> System.out.println(e));
}
}
