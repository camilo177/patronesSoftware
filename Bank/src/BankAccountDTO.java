    public class BankAccountDTO {
        private int accountNumber;
        private String accountHolderName;
        private String clientName;
        private String clientAddress;
        private String clientEmail;
        private double balance;

        public BankAccountDTO(int accountNumber, String accountHolderName, String clientName, String clientAddress, String clientEmail, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.clientName = clientName;
            this.clientAddress = clientAddress;
            this.clientEmail = clientEmail;
            this.balance = balance;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public String getAccountHolderName() {
            return accountHolderName;
        }

        public String getClientName() {
            return clientName;
        }

        public String getClientAddress() {
            return clientAddress;
        }

        public String getClientEmail() {
            return clientEmail;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }
    }
