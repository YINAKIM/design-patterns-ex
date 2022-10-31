package patterns.creational.builder.menutree;

public abstract class MenuBuilder {

    String builderName;
    enum MenuType {
        ROOT, MIDDLE, TAIL
    }

    MenuType menuType;

    Menu menu = new Menu();

    public void setMenuType(MenuType menuType) {
        this.menuType = menuType;
        menu.setMenuType(menuType);
    }

    public abstract MenuBuilder addBold();
    public abstract MenuBuilder addDepth();

    public Menu build(){
        System.out.println("########## 메뉴 속성 세팅 ##########");
        return menu;
    }

}
