import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();
        int accountNumber = 1001; // Starting account number

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Crear Cuenta");
            System.out.println("2. Depositar Fondos");
            System.out.println("3. Retirar Fondos");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Salir");
            System.out.print("Ingrese su elección: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Ingrese el nombre del titular de la cuenta: ");
                    String accountHolder = scanner.nextLine();
                    BankAccount account = new BankAccount(accountNumber++, accountHolder);
                    accounts.add(account);
                    System.out.println("Account created successfully. Account number: " + account.getAccountNumber());
                    break;

                case 2:
                    System.out.print("Ingrese el numero de cuenta: ");
                    int depositAccountNumber = scanner.nextInt();
                    System.out.print("Ingrese la cantidad para el depósito: ");
                    double depositAmount = scanner.nextDouble();

                    // Find the account by account number
                    BankAccount depositAccount = findAccount(accounts, depositAccountNumber);
                    if (depositAccount != null) {
                        depositAccount.deposit(depositAmount);
                    } else {
                        System.out.println("Cuenta no encontrada.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el numero de cuenta: ");
                    int withdrawAccountNumber = scanner.nextInt();
                    System.out.print("Ingrese la cantidad para el retiro: ");
                    double withdrawAmount = scanner.nextDouble();

                    // Find the account by account number
                    BankAccount withdrawAccount = findAccount(accounts, withdrawAccountNumber);
                    if (withdrawAccount != null) {
                        withdrawAccount.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Cuenta no econtrada.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el numero de cuenta: ");
                    int checkBalanceAccountNumber = scanner.nextInt();

                    // Find the account by account number
                    BankAccount checkBalanceAccount = findAccount(accounts, checkBalanceAccountNumber);
                    if (checkBalanceAccount != null) {
                        System.out.println("Titular de cuenta: " + checkBalanceAccount.getAccountHolder());
                        System.out.println("Balance: " + checkBalanceAccount.getBalance());
                    } else {
                        System.out.println("Cuenta no econtrada.");
                    }
                    break;

                case 5:
                    System.out.println("Gracias por usar la app!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Selección inválida.");
            }
        }
    }

    // Helper method to find an account by account number
    private static BankAccount findAccount(List<BankAccount> accounts, int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}


