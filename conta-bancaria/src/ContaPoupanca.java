public class ContaPoupanca extends Conta{
    public double rendimentoPoupanca(){
        double valor = 0;
        valor = this.getSaldo()*0.07;
        return valor;
    } 
}
