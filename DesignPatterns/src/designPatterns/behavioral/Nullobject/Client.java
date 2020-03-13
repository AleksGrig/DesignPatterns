package designPatterns.behavioral.Nullobject;

public class Client {

	public static void main(String[] args) {
		var service = new ComplexService("Simple report 2", new NullStorageService());
		service.generateReport();
	}
}
