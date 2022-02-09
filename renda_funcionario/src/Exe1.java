public class Exe1 {

    public static void print(Funcionario funcionario){
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Matricula: "+funcionario.getMatricula());
        System.out.println("Salario: "+funcionario.getSalario());
        System.out.println("Admissao: "+funcionario.getAdmissao());
        System.out.println("CPF: "+funcionario.getCpf());
    }
    public static void main(String[] args) throws Exception {
        Funcionario funcionario = new Funcionario();
        double aux;

        funcionario.setNome("Claudio");
        funcionario.setMatricula("333333");
        funcionario.setSalario(2500.00);
        funcionario.setAdmissao("12/12/12");
        funcionario.setCpf("444.444.444-44");

        print(funcionario);
        System.out.println("");
        funcionario.receberAumento(100.00);
        
        print(funcionario);
        System.out.println("");

        aux = funcionario.calcularGanhoBrutoAnual();
        System.out.println(aux);

        aux = funcionario.calcularImposto();
        System.out.println(aux);

        aux = funcionario.calcularGanhoLiquidoMensal();
        System.out.println(aux);

        aux = funcionario.calcularGanhoLiquidoAnual();
        System.out.println(aux);

    }
}
