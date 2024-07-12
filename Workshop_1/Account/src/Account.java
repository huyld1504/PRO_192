public class Account {
    private String id;
    private String fullName;
    private double balance;
    
    public Account (String id, String name, double balance) {
        this.id = id;
        this.fullName = name;
        this.balance = balance;
    }
    
    public void showInfo (){
        System.out.println(this.id + " - " + this.fullName + " - " + this.balance);
    }
    
    public String withDraw (double amount) {
        String str = null;
        
        if (amount < this.balance) {
            this.balance = this.balance - amount;
            str = "Success";
        } else {
            str = "Fail";
        }
        
        return str;
    }
}
