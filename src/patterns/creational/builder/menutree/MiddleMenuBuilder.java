package patterns.creational.builder.menutree;

public class MiddleMenuBuilder extends MenuBuilder {
	String bold = "300";
	String depth = "1";

	public MiddleMenuBuilder() {
		this.builderName = "Middle Menu Builder";
		setMenuType(MenuType.MIDDLE); // TAIL 메뉴
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