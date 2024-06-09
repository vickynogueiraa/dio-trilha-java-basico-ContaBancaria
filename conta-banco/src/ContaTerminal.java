import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        //Solicitando e lendo o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int num = sc.nextInt();
        sc.nextLine();  

        //Solicitando e lendo  o número da agência
        System.out.println("Por favor, digite o Nº da Agência:");
        String agencia = sc.nextLine();

        //Solicitando e lendo  o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = sc.nextLine();

       //Solicitando e lendo  o saldo da conta
        System.out.println("Por favor, informe o saldo da Conta:");
        double saldo = sc.nextDouble();

        //Exibindo a mensagem final para o usuário
        System.out.println("Olá " + nomeCliente + ", conta criada com sucesso, sua agência é " + agencia + ", conta " 
                          + num + " e seu saldo " + saldo + " já está disponível para saque!");

        sc.close();
    }
}
