package patterns.creational.builder.menutree;

public class RootMenuBuilder extends MenuBuilder {
	String bold = "600";
	String depth = "0";

	public RootMenuBuilder() {
		this.builderName = "Root Menu Builder";
		setMenuType(MenuType.ROOT); // ROOT 메뉴
	}

	// MenuBuilder 의 abstract메서드 구현
	@Override
	public MenuBuilder addBold() {
		menu.addBold(new Bold(bold));
		return this;
	}

	@Override
	public MenuBuilder addDepth() {
		menu.addDepth(new Depth(depth));
		return this;
	}


}