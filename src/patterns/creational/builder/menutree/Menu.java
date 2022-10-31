package patterns.creational.builder.menutree;

public class Menu {

    String name;
    Depth depth;
    MenuBuilder.MenuType menuType;
    Bold bold;
    public Menu setMenuType(MenuBuilder.MenuType menuType) {
        this.menuType = menuType;
        switch (menuType) {
            case ROOT: this.name = "대메뉴";
                break;

            case MIDDLE: this.name = "중메뉴";
                break;

            case TAIL: this.name = "소메뉴";
                break;

            default: this.name = "nothing";
        }
        return this;
    }


    Menu addBold(Bold bold){
        this.bold = bold;
        return this;
    }
    Menu addDepth(Depth depth){
        this.depth = depth;
        return this;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---- 메뉴명 : " + this.name + " ----\n");
        display.append("---- 뎁스 : " + depth.name + " ----\n");
        display.append("---- 폰트굵기 : " + String.valueOf(this.bold) + " ----\n");
        return display.toString();
    }
}
