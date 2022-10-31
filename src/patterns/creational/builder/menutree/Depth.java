package patterns.creational.builder.menutree;

public class Depth {

    String name;
    String depth;

    public Depth(String depth) {
        this.name = String.valueOf(depth) + " 뎁스 메뉴";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
