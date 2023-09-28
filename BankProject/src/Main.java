import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<BankAccountDTO> accounts = new ArrayList<>();
        int accountNumber = 1001; // Iniciar numero de cuenta

        BankAccountConverter converter = new BankAccountConverter(); // Crear instancia de converter

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Crear Cuenta");
            System.out.println("2. Depositar Fondos");
            System.out.println("3. Retirar Fondos");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Salir");
            System.out.print("Ingrese su elección: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 : {
                    System.out.print("Ingrese el nombre del titular de la cuenta: ");
                    String accountHolderName = scanner.nextLine();

                    System.out.print("Ingrese el nombre del cliente: ");
                    String clientName = scanner.nextLine();

                    System.out.print("Ingrese la dirección del cliente: ");
                    String clientAddress = scanner.nextLine();

                    System.out.print("Ingrese el correo electrónico del cliente: ");
                    String clientEmail = scanner.nextLine();

                    Client client = new Client(clientName, clientAddress, clientEmail);
                    BankAccountDTO accountDTO = converter.convert(new BankAccount(accountNumber++, accountHolderName), client); // Usar converter
                    accounts.add(accountDTO);
                    System.out.println("Cuenta creada con éxito. Número de cuenta: " + accountDTO.getAccountNumber());
                }
                case 2 : {
                    System.out.print("Ingrese el número de cuenta: ");
                    int depositAccountNumber = scanner.nextInt();
                    System.out.print("Ingrese la cantidad para el depósito: ");
                    double depositAmount = scanner.nextDouble();

                    // Encuentra la cuenta por número de cuenta
                    BankAccountDTO depositAccountDTO = findAccount(accounts, depositAccountNumber);
                    if (depositAccountDTO != null) {
                        depositAccountDTO.deposit(depositAmount);
                        System.out.println("Nuevo balance: " + depositAccountDTO.getBalance());
                    } else {
                        System.out.println("Cuenta no encontrada.");
                    }
                }
                case 3 : {
                    System.out.print("Ingrese el número de cuenta: ");
                    int withdrawAccountNumber = scanner.nextInt();
                    System.out.print("Ingrese la cantidad para el retiro: ");
                    double withdrawAmount = scanner.nextDouble();

                    // Encuentra la cuenta por número de cuenta
                    BankAccountDTO withdrawAccountDTO = findAccount(accounts, withdrawAccountNumber);
                    if (withdrawAccountDTO != null) {
                        withdrawAccountDTO.withdraw(withdrawAmount);
                        System.out.println("Nuevo balance: " + withdrawAccountDTO.getBalance());
                    } else {
                        System.out.println("Cuenta no encontrada.");
                    }
                }
                case 4 : {
                    System.out.print("Ingrese el número de cuenta: ");
                    int checkBalanceAccountNumber = scanner.nextInt();

                    // Encuentra la cuenta por número de cuenta
                    BankAccountDTO checkBalanceAccountDTO = findAccount(accounts, checkBalanceAccountNumber);
                    if (checkBalanceAccountDTO != null) {
                        System.out.println("Titular de cuenta: " + checkBalanceAccountDTO.getAccountHolderName());
                        System.out.println("Nombre del cliente: " + checkBalanceAccountDTO.getClientName());
                        System.out.println("Dirección del cliente: " + checkBalanceAccountDTO.getClientAddress());
                        System.out.println("Correo electrónico del cliente: " + checkBalanceAccountDTO.getClientEmail());
                        System.out.println("Balance: " + checkBalanceAccountDTO.getBalance());
                    } else {
                        System.out.println("Cuenta no encontrada.");
                    }
                }
                case 5 : {
                    System.out.println("¡Gracias por usar la aplicación bancaria!");
                    scanner.close();
                    System.exit(0);
                }
                default : System.out.println("Selección inválida. Por favor, intente de nuevo.");
            }
        }
    }

    // Encontrar cuenta por númerop
    private static BankAccountDTO findAccount(List<BankAccountDTO> accounts, int accountNumber) {
        for (BankAccountDTO accountDTO : accounts) {
            if (accountDTO.getAccountNumber() == accountNumber) {
                return accountDTO;
            }
        }
        return null;
    }
}
