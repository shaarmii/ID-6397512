package builderPatternExample;

public class Computer {
	private String cpu;
	private String ram;
	private String storage;
	
	private Computer(ComputerBuilder builder) {
		this.cpu=builder.cpu;
		this.ram=builder.ram;
		this.storage=builder.storage;
		
	}
	
	public void display() {
		System.out.println("CPU : " + cpu);
		System.out.println("RAM : " + ram);
		System.out.println("Storage : " + storage);
	}
	
	
	public static class ComputerBuilder{
		private String cpu;
		private String ram;
		private String storage;

		public ComputerBuilder setCpu(String cpu) {
			this.cpu = cpu;
			return this;
		}
		public ComputerBuilder setRam(String ram) {
			this.ram = ram;
			return this;
		}
		public ComputerBuilder setStorage(String storage) {
			this.storage = storage;
			return this;
		}
		public Computer build() {
			return new Computer(this);
		}
	};
}
