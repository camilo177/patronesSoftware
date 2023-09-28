public class BankAccountConverter {
    public BankAccountDTO convert(BankAccount bankAccount, Client client) {
        int accountNumber = bankAccount.getAccountNumber();
        String accountHolderName = bankAccount.getAccountHolder();
        String clientName = client.getName();
        String clientAddress = client.getAddress();
        String clientEmail = client.getEmail();
        double balance = bankAccount.getBalance();

        return new BankAccountDTO(accountNumber, accountHolderName, clientName, clientAddress, clientEmail, balance);
    }
}