package patterns.structural.state.tmoney;

public class Tmoney {

    UsableTmoney usable;
    UnUsableTmoney unUsable;

    State state;

    int balance = 0;

    public Tmoney(int balance) {
        this.balance = balance;
        this.usable = new UsableTmoney(this);
        this.unUsable = new UnUsableTmoney(this);
        this.state = this.balance > 0 ? this.usable : this.unUsable;
        System.out.println("현재 잔액 : " + this.balance);
    }

    /**
     * 상태를 바꾼다.
     * State의 구현체면 상태객체로 사용가능
     */
    void setState(State state) {
        this.state = state;
    }

    public void setBalance(int bal) {
        this.balance = bal;
    }

    /**
     * 버스를 탄다
     * 잔액이 있으면 : 사용가능, 잔액차감
     * 잔액이 없으면 : 사용불가, 충전필요
     */
    public void takeBus() {
        if(this.balance > 0) {
            this.usable.useTmoney(this.balance);
        } else {
            this.unUsable.useTmoney(this.balance);
        }
    }

    /**
     * 충전을 한다
     * 충전 후 잔액에 따라 상태변경
     * todo. 어떤걸 호출하던, 충전 후 잔액 > 0 이어야만 useable
     */
    public void charging(int charging) {
        if(this.balance > 0) {
            usable.chargeTmoney(this.balance,charging);
        } else {
            unUsable.chargeTmoney(this.balance,charging);
        }
    }


    /**
     * 환승을 한다
     */
    public void transferTo(){
        state.transfer(this.balance);
        this.state = this.balance > 0 ? usable : unUsable;
    }
}
