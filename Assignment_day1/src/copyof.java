
public class copyof {

	public static void main(String[] args) {
		
		int arr[]= {1,2,6,4,8,9};
		int result[];
		result=copyOf(arr);
		for(int i:result)
			System.out.println(i);

	}
	public static int[] copyOf(int [] array)
	{
		return array;
	}

}
