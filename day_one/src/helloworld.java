
public class helloworld {
	public static void main(String []a) {
		System.out.println("Hello world ");
		System.out.println(6+5);
		System.out.println('A'+6);
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum+=Integer.parseInt(a[i]);
		System.out.println(sum);
	}
}
