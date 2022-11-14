package patterns.structural.state.tmoney;


public class UsableTmoney implements State {

    Tmoney tmoney;

    public UsableTmoney(Tmoney tmoney) {
        this.tmoney = tmoney;
    }

    /**
     * 사용가능 -> 사용가능
     */
    @Override
    public void chargeTmoney(int balance, int charging) {
        int bal = balance + charging;
        System.out.println("================ 사용가능한 카드 [충전중......] ================");
        System.out.println(charging + "원 충전합니다");
        System.out.println("잔액 : " + bal);
        this.tmoney = new Tmoney(bal);
        this.tmoney.setState(tmoney.usable);
    }

    /**
     * 사용 후 잔액 0원 : 사용불가
     */
    @Override
    public void useTmoney(int balance) {
        int bal = balance - 1000;
        System.out.println("================ 사용가능한 카드 [사용] ================");
        System.out.println("1000 원 사용합니다");
        System.out.println("잔액 : " + bal);

        this.tmoney.setBalance(bal);
        this.tmoney.setState(bal > 0 ? tmoney.usable : tmoney.unUsable);
    }

    /**
     * 잔액 무관, 환승가능
     * 환승 후 잔액 유지
     */
    @Override
    public void transfer(int balance) {
        System.out.println("================ 사용가능한 카드 [환승] ================");
        System.out.println("환승입니다.");
        System.out.println("잔액 : " + balance);
        this.tmoney.setBalance(balance);
    }

}
