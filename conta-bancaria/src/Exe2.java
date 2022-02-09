public class Exe2 {
    public static void print(ContaCorrente contaCorrente, ContaPoupanca contaPoupanca){
        System.out.println("Conta corrente: ");
        System.out.println("Titular: "+contaCorrente.getTitular());
        System.out.println("Numero: "+contaCorrente.getNumero());
        System.out.println("Saldo: "+contaCorrente.getSaldo());
        System.out.println("Rendimento: "+contaCorrente.rendimentoCorrente());

        System.out.println("");
        System.out.println("Conta poupanca: ");
        System.out.println("Titular: "+contaPoupanca.getTitular());
        System.out.println("Numero: "+contaPoupanca.getNumero());
        System.out.println("Saldo: "+contaPoupanca.getSaldo());
        System.out.println("Rendimento: "+contaPoupanca.rendimentoPoupanca());

    }
    public static void main(String[] args) throws Exception {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaCorrente.setTitular("Claudio");
        contaCorrente.setSaldo(200.00);
        contaCorrente.setNumero(121212);

        contaPoupanca.setTitular("Henrique");
        contaPoupanca.setNumero(121212);
        contaPoupanca.setSaldo(200.00);

        print(contaCorrente, contaPoupanca);


    }
}
