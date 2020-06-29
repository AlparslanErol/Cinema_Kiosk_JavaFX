package GUI;

import java.util.List;

public class Accounts {
    private List<UserAccount> accounts;

    public Accounts() {}

    public Accounts(List<UserAccount> accounts) {
        this.accounts = accounts;
    }

    public List<UserAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<UserAccount> accounts) {
        this.accounts = accounts;
    }
}