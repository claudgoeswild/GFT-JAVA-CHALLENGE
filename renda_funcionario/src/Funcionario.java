public class Funcionario {
    private String nome;
    private String matricula;
    private double salario;
    private String admissao;
    private String cpf;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getAdmissao() {
        return admissao;
    }
    public void setAdmissao(String admissao) {
        this.admissao = admissao;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void receberAumento(double valor){
        this.setSalario(salario += valor);
    }

    public double calcularGanhoBrutoAnual(){
        double valor;

        valor = this.getSalario()*12;

        return valor;
    }

    public double calcularImposto(){
        double imposto;
        imposto = calcularGanhoBrutoAnual() - calcularGanhoLiquidoMensal();

        return imposto;
    }

    public double calcularGanhoLiquidoMensal(){
        double valor = 0;
        if(this.getSalario() > 2500){
            double aux = 0;
            aux = this.getSalario()-2500;
            aux = aux*0.825;
            valor = this.getSalario();
            valor = (valor*0.89)+aux;
        }else{
            valor = this.getSalario();
            valor = valor*0.89; 
        }
        return valor;
    }

    public double calcularGanhoLiquidoAnual(){
        double valor = 0;
        valor = calcularGanhoLiquidoMensal()*12;

        return valor;
    }


}
