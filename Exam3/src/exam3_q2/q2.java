package exam3_q2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Student {
	
	private int id;
	private String name;
	private int marks;
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + marks;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (marks != other.marks)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	

	
 }
public class q2 {
	
 public static void main(String args[])
 {
	 	Map<Student, Integer> map=new HashMap<>();
			map.put(new Student(109, "raj", 95), 95);
			map.put(new Student(61, "keta", 78), 78);
			map.put(new Student(11, "gunika", 98), 98);
			map.put(new Student(19, "keshav", 97), 97);
			
			//q1
			
			System.out.println(" Print all records sorted as per name of the student");
			map.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getName)))
			.forEach(e-> System.out.println(e) );
			
			//q2
			
			System.out.println(" Print all records sorted as per id of the student");
			map.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getId)))
			.forEach(e-> System.out.println(e) );
			
			
 }
}
