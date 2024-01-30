public class Client {
    public static void main(String[] args)  {
        BankService bankService = new BankServiceImpl();

        Account account = new Account(1,"Ford",500.0);
        Account accountTwo = new Account(2,"India",100.0);
        System.out.println(account.toString());

        try {
            bankService.addFundsToAccount(null,250.0);
        } catch (AccountException e) {
            e.printStackTrace();
        }

        try {
            bankService.addFundsToAccount(null,250.0);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }
        try {
            bankService.addFundsToAccount(account,-1250.0);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(account);
        bankService.withdrawFunds(account,450.0);
        System.out.println(account);
        System.out.println("Balance:"+bankService.displayBalance(account));

        bankService.fundTransfer(account,accountTwo,50.0);

    }
}
