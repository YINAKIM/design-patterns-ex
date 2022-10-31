package patterns.creational.builder.menutree;

public class Bold {

    String css;
    int number;

    public Bold(String number) {
        this.css = "style=bold:" + String.valueOf(number) + "px;";
    }
    public void setCss(String css) {
        this.css = css;
    }
    public String toString() {
        return this.css;
    }
}
