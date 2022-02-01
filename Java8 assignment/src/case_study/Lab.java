package case_study;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Lab {

	public static void main(String[] args) {

		List<Book> allBooks = loadAllBooks();

		// 1. Find books with more then 400 pages
			List<Book> lengthyBooks=allBooks
					.stream()
					.filter(b -> b.getPages()>400)
					.collect(toList());
			
//			lengthyBooks.forEach(b -> System.out.println(b));
			
		// 2. Find all books that are java books and more then 400 pages
			List<Book> javaBooks=allBooks
					.stream()
					.filter(b -> b.getPages()>400 && b.getSubject()==Subject.JAVA)
					.collect(toList());
			
//			javaBooks.forEach(b -> System.out.println(b));
		
		// 3. We need the top three longest books
			
			List<Book> top3Books=allBooks
					.stream()
					.sorted((o1, o2) -> Integer.compare(o2.getPages(),o1.getPages()))
					.limit(3)
					.collect(toList());
			
//			top3Books.forEach(b -> System.out.println(b));

		// 4. We need from the fourth to the last longest books
			List<Book> skip3Books=allBooks
					.stream()
					.sorted((o1, o2) -> Integer.compare(o1.getPages(),o2.getPages()))
					.skip(3)
					.collect(toList());
			
//			skip3Books.forEach(b -> System.out.println(b));
		
		// 5. We need to get all the publishing years
//			
//			List<Book> publishingYears=allBooks
//					.stream()
//					.map(b -> b.getYear())
//					.collect(toList());
//			
//			skip3Books.forEach(b -> System.out.println(b));
			
		// 6. We need all the authors names who have written a book	

			
		// We want to know if all the books are written by more than one author? boolean
			
			
		//is all the elements of array are odd?
			
			
		// We want one of the books written by more than one author.? (findAny)
	
		// We want to know how many pages the longest book has.

	
		// We want the average number of pages of the books
			
		
		// We want all the titles of the books

		//all tiles print : java , adv c#, 
		
	
		// We want the book with the higher number of authors?

	
		// We want a Map of book per year.

		// We want a Map of book per year and then by subject
		
		// We want to count how many books are published per year.

	

	}

	private static List<Book> loadAllBooks() {
		List<Book> books = new ArrayList<Book>();
		List<Author> authors1 = Arrays.asList(
				new Author("raj", "gupta", "in"),
				new Author("ekta", "gupta", "in")
				);

		List<Author> authors2 = Arrays.asList(new Author("raj", "gupta", "in"));

		List<Author> authors3 = Arrays.asList(new Author("gunika", "gupta", "us"),
				new Author("keshav", "gupta", "us"));

		books.add(new Book("java", authors1, 450, Subject.JAVA, 2021, "1213"));
		books.add(new Book("adv java", authors1, 400, Subject.JAVA, 2021, "1213"));
		
		books.add(new Book("adv C#", authors2, 700, Subject.DOT_NET, 2022, "1218"));
		books.add(new Book("C# basics", authors3, 600, Subject.DOT_NET, 2019, "1293"));

		return books;
	}

}
