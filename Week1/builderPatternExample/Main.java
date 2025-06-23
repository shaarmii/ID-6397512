package Week1.builderPatternExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = new Computer.ComputerBuilder()
				.setCpu("Intel i3")
				.setRam("16GB").setStorage("234SSD")
				.build();
		c.display();
	}

}
