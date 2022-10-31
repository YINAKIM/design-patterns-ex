package patterns.creational.builder.menutree;

public class TailMenuBuilder extends MenuBuilder {
	String bold = "100";
	String depth = "2";

	public TailMenuBuilder() {
		this.builderName = "Tail Menu Builder";
		setMenuType(MenuType.TAIL); // TAIL 메뉴
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