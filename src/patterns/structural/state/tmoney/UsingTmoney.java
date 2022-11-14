package patterns.structural.state.tmoney;

public class UsingTmoney {

    public static void main(String[] args) {
        Tmoney tmoney = new Tmoney(2000); // 2번 사용가능

        tmoney.takeBus();
        tmoney.transferTo();
        tmoney.takeBus();
        tmoney.transferTo();
        tmoney.takeBus();
        tmoney.takeBus();

        tmoney.charging(1000);
        tmoney.takeBus();
    }
}
