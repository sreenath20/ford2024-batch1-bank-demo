public class BankServiceImpl implements BankService{
    @Override // annotation
    public Double addFundsToAccount(Account account, Double amount) throws AccountException{
        // check for null account
        // check for -ve amount

        if(account == null) {
            //System.out.println("Account cant be null.");
            //return null;
            throw new AccountException("Account null.");
        }
        if(amount <0) {
            //System.out.println("Amount cant be -ve.");//return null;
            //
            throw new AccountException("You cant add -ve Banalce.");
            }
        Double newBalance = account.getBalance();
        newBalance +=amount;
        account.setBalance(newBalance);
        return newBalance;

    }

    @Override
    public Double withdrawFunds(Account account, Double amount) {
        // handel null account and -ve balance
        // check for sufficent balance
        account.setBalance(account.getBalance()-amount);
        return account.getBalance();
    }

    @Override
    public Double displayBalance(Account account) {
        return account.getBalance();
    }

    @Override
    public Boolean fundTransfer(Account fromAccount, Account toAccount, Double amount) {
       // from & to account != null
        // amount should be +ve
        // check if fromAccount has sufficent balance return false;
//        fromAccount.setBalance(fromAccount.getBalance()-amount);
//        toAccount.setBalance(toAccount.getBalance()+amount);
        //withdrawFunds(fromAccount,amount);
        //addFundsToAccount(toAccount,amount);
        return true;
    }
}
