package factoryPatternExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentFactory df1 = new WordDocumentFactory();
		df1.createDocument().open();
		
		DocumentFactory df2 = new ExcelDocumentFactory();
		df2.createDocument().open();
		
		DocumentFactory df3 = new PdfDocumentFactory();
		df3.createDocument().open();

	}

}
