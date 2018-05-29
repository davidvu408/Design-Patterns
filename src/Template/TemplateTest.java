package Template;

public class TemplateTest {
	public static void main(String[] args) {
		Template template = new Template();
		try {
			template.createShapes();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
