public class Account { // POJO / DTO
    private String name;
    private Integer id;
    private Double balance;
    // add other attributes
    public Account() {
    }

    public Account( Integer id,String name, Double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "id: "+id+"Name: "+name+" Balance: "+balance;
    }
}
