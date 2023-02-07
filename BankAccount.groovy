import groovy.transform.Synchronized

class Account {
    private boolean isOpen = false
    private int balance = 0
    
    void open() {
        this.isOpen = true
        balance = 0
    }

    void close() {
        this.isOpen = false
    }

    @Synchronized
    void deposit(int amt) {
        if (isOpen && amt > 0)
            balance += amt

        else
            throw new Exception("ERROR")
    }    

    @Synchronized
    void withdraw(int amt) {
        if (isOpen && balance > 0 && balance >= amt)
            balance -= amt

        else
            throw new Exception("ERROR")

    }

    int getBalance() {
        if (isOpen)
            balance
        
        else
            throw new Exception("ERROR")
    }
}

def a = new Account()
println a.deposit(50_000)
println a.withdraw(23_000)
println a.getBalance()