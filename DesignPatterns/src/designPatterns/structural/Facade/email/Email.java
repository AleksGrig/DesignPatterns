package designPatterns.structural.Facade.email;

public class Email {

	public static EmailBuilder getBuilder() {
		return new EmailBuilder();
	}
}
