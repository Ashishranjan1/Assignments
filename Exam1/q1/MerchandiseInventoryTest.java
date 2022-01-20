package q1;


import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class MerchandiseInventoryTest {
	public static void main(String[] args) {
	 List<Merchandise> merchandiseList=new ArrayList<Merchandise>();
		
	 try(BufferedReader reader = new BufferedReader(new FileReader(("C:\\Users\\ve00ym333\\Desktop\\input.dat")))){
			String line = null;
			while((line=reader.readLine())!=null) {
				String arr[]=line.split(" ");
				String tempItemCode=arr[0];
				int tempQuantity=(int) Integer.parseInt(arr[1]);
				double tempunitPrice=(double) Double.parseDouble(arr[2]);
				Merchandise merchandise=new Merchandise(tempItemCode,tempQuantity,tempunitPrice);
				merchandiseList.add(merchandise);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
	}
	
	 
	 printAllmerchandise(merchandiseList);
	 
	 Collections.sort(merchandiseList, new SortAsPerItemCode());
	 System.out.println("--------All merchandise as per Item Code ------------");
	 printAllmerchandise(merchandiseList);
	 
	 Collections.sort(merchandiseList, new SortAsPerUnitPrice());
	 System.out.println("--------all merchandise as per  (decending)------------");
	 printAllmerchandise(merchandiseList);
		
	}

	private static void printAllmerchandise(List<Merchandise> merchandise) {
		Iterator<Merchandise> it=merchandise.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
	}
}