package patterns.structural.state.tmoney;


public class UnUsableTmoney implements State {
    Tmoney tmoney;

    public UnUsableTmoney(Tmoney tmoney) {
        this.tmoney = tmoney;
    }

    /**
     * 충전 후 잔액 0원 초과
     * 사용불가 -> 사용가능
     */
    @Override
    public void chargeTmoney(int balance, int charging) {
        int bal = balance + charging;
        System.out.println("================ 사용불가능한 카드 [충전중...] ================");
        System.out.println(String.valueOf(charging) + "원 충전합니다");
        System.out.println("잔액 : " + String.valueOf(bal));

        this.tmoney.setBalance(bal);
        this.tmoney.setState(bal > 0 ? tmoney.usable :  tmoney.unUsable);
    }

    /**
     * 잔액 0원 : 사용 불가능
     */
    @Override
    public void useTmoney(int balance) {
        System.out.println("================ 사용불가능한 카드 [사용시도] ================");
        System.out.println("잔액이 부족합니다.");
        this.tmoney.setBalance(balance);
        this.tmoney.setState(tmoney.unUsable);
    }

    /**
     * 잔액 무관 : 환승 가능
     * @param balance
     */
    @Override
    public void transfer(int balance) {
        int bal = balance;
        System.out.println("================ 환승 후 사용불가능 ================");
        System.out.println("환승입니다.");
        System.out.println("잔액 : " + String.valueOf(bal));
        this.tmoney.setBalance(bal);
        this.tmoney.setState(bal > 0 ? tmoney.usable : tmoney.unUsable);
    }

}
