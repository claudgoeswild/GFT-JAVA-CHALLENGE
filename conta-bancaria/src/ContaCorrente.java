public class ContaCorrente extends Conta{
    public double rendimentoCorrente(){
        double valor = 0;
        valor = this.getSaldo()*0.05;
        return valor;
    }
}
