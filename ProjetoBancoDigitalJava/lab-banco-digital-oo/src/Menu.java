import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private Banco banco;

    public Menu(){
        banco =  new Banco();
    }

    public void executa() {

        Scanner sc = new Scanner(System.in);
        char opcao = ' ';
        System.out.println("Bem vindo ao banco DIO ");
        while (opcao != '0') {
            try {
                System.out.println("Opções: ");
                System.out.println("   [0] Sair.");
                System.out.println("   [1] Abrir conta.");
                System.out.println("   [2] Consultar conta(s).");
                System.out.println("   [3] Excluir conta(s).");
                System.out.println("   [4] Transferir valor entre contas");
                System.out.print("Digite a opcao desejada: ");
                opcao = sc.next().charAt(0);
                sc.nextLine();
                switch (opcao) {
                    case '1':
                        Cliente cliente = null;
                        Conta conta = null;
                        System.out.println("Digite o nome do cliente: ");
                        String nome = sc.nextLine();
                        System.out.println("Digite o endereço do cliente: ");
                        String endereco = sc.nextLine();
                        System.out.println("Digite o email do cliente: ");
                        String email = sc.nextLine();
                        sc.nextLine();
                        System.out.println("Digite o telefone do cliente(somente números): ");
                        int telefone = sc.nextInt();
                        //tipo de cliente
                        System.out.println("Digite 1 para cliente pessoa física ou 2 para jurídica: ");
                        int opcaoCliente = sc.nextInt();
                        if(opcaoCliente == 1){
                            System.out.println("Digite o cpf do cliente(somente números): ");
                            long cpf = sc.nextLong();
                            cliente = new ClientePessoaFisica(nome, endereco, email, telefone, cpf);
                        }
                        else if(opcaoCliente == 2){
                            System.out.println("Digite o cnpj(somente números)");
                            long cnpj = sc.nextLong();
                            sc.nextLine();
                            System.out.println("Digite o nome fantasia da empresa: ");
                            String nomeDaEmpresa = sc.nextLine();

                            cliente = new ClientePessoaJuridica(nome, endereco, email, telefone, cnpj, nomeDaEmpresa);
                        }
                        //tipo de conta
                        System.out.println("Digite 1 para conta corrente ou 2 para conta poupança: ");
                        int opcaoConta = sc.nextInt();
                        sc.nextLine();
                        if(opcaoConta == 1){
                            conta =  new ContaCorrente(cliente);
                            System.out.println("Digite o valor para iniciar a conta: ");
                            double deposito = sc.nextDouble();
                            conta.depositar(deposito);
                            sc.nextLine();
                        }
                        else if(opcaoConta == 2){
                            conta = new ContaPoupanca(cliente);
                            System.out.println("Digite o valor para iniciar a conta: ");
                            double deposito = sc.nextDouble();
                            conta.depositar(deposito);
                            sc.nextLine();
                        }
                        if(banco.addConta(conta)){
                            System.out.println("Conta criada com sucesso!");
                        }
                        else{
                            System.out.println("A conta não pode ser criada.");
                        }
                        break;
                    case '2':
                        if(banco.getContas().isEmpty()){
                            System.out.println("Não há contas cadastradas. ");
                        }
                        else{
                            for(Conta c : banco.getContas()){
                                c.imprimirInfosComuns();
                            }
                        }
                        break;
                    case '3':
                        if(!banco.getContas().isEmpty()) {
                            System.out.println("Digite o nome da conta a ser removida: ");
                            String nomeDaConta = sc.nextLine();
                            sc.nextLine();
                            for(int i = 0; i < banco.getContas().size(); i++){
                                if(banco.getContas().get(i).getCliente().getNome().toLowerCase().equals(nomeDaConta.toLowerCase())){
                                    banco.getContas().remove(banco.getContas().get(i));
                                    System.out.println("Conta removida");
                                    break;
                                }
                            }
                        }
                        else{
                            System.out.println("Não há contas cadastradas.");
                        }
                        break;
                    case '4':
                        int indiceContaRemetente = 0;
                        int indiceContaDestino = 0;
                        if(banco.getContas().isEmpty() || banco.getContas().size() < 2){
                            System.out.println("Não há contas cadastradas ou número insuficiente de contas para transferir.");
                        }
                        else{
                            System.out.println("Digite o nome da conta que vai transferir o dinheiro: ");
                            String contaRemetente = sc.nextLine();
                            sc.nextLine();
                            System.out.println("Digite o nome da conta de destino do dinheiro: ");
                            String contaDestino = sc.nextLine();
                            sc.nextLine();
                            for(int i = 0; i < banco.getContas().size(); i++){
                                if(banco.getContas().get(i).getCliente().getNome().toLowerCase().equals(contaRemetente.toLowerCase())){
                                    indiceContaRemetente = banco.getContas().indexOf(banco.getContas().get(i));
                                }
                                else if(banco.getContas().get(i).getCliente().getNome().toLowerCase().equals(contaDestino.toLowerCase())){
                                    indiceContaDestino = banco.getContas().indexOf(banco.getContas().get(i));
                                }
                            }
                            System.out.println("Digite o valor a ser transferido: ");
                            double valorDaTransferencia = sc.nextDouble();
                            banco.getContas().get(indiceContaRemetente).transferir(valorDaTransferencia, banco.getContas().get(indiceContaDestino));
                            System.out.println("Transferência realizada. ");
                            }
                        break;
                    case '0':
                        break;
                    default:
                        System.out.println("Opcao invalida! Redigite.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: Insira apenas números inteiros. ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Até breve.");
    }
}