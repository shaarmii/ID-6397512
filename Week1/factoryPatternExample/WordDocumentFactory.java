package Week1.factoryPatternExample;

public class WordDocumentFactory extends DocumentFactory{

	@Override
	public Document createDocument() {
		// TODO Auto-generated method stub
		return new WordDocument(); 
		
	}
	
}
