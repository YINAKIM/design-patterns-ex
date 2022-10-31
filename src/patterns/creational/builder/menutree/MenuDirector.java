package patterns.creational.builder.menutree;

public class MenuDirector {
 
	public static void main(String[] args) {

		MenuBuilder rootMenuBuilder = new RootMenuBuilder();
		Menu rootMenu = rootMenuBuilder.addBold().addDepth().build();
		System.out.println(rootMenu);

		MenuBuilder middleMenuBuilder = new MiddleMenuBuilder();
		Menu middleMenu = middleMenuBuilder.addBold().addDepth().build();
		System.out.println(middleMenu);

		MenuBuilder tailMenuBuilder = new TailMenuBuilder();
		Menu tailMenu = tailMenuBuilder.addBold().addDepth().build();
		System.out.println(tailMenu);
	}
}
