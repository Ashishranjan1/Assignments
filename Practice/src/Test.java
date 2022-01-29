import java.util.PriorityQueue;
import java.util.Stack;

	public class DemoStack {

		public static void main(String[] args) {
			
			Stack<Student> stack=new Stack<Student>(Student.class);
			stack.push(new Student(12, "raj", 67));
			System.out.println(stack.pop());
		}
	
}