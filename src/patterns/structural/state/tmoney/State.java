package patterns.structural.state.tmoney;

public interface State {

    void chargeTmoney(int balance, int charging);
    void useTmoney(int balance);
    void transfer(int balance);
}
