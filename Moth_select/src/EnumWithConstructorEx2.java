
public class EnumWithConstructorEx2 {
	public static void main(String args[]) {
		
		Books []books=Books.values();
		for(Books book :books  ) {
			System.out.println("Book Name: "+ book.getRepresentations()+" "+" Number of pages: "+
		    book.getPages()+" Price: "+book.getPrice());
		}
	}
}
