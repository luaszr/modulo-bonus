public class Funcionario{
    private int id;
    private double salario;
    private int codigoDepartamento;

    public Funcionario(int id, double salario, int codigoDepartamento){
        this.id = id;
        this.salario = salario;
        this.codigoDepartamento = codigoDepartamento;
    }

    public int getId(){
        return this.id;
    }

    public double getSalario(){
        return this.salario;
    }

    public int getCodigoDepartamento(){
        return this.codigoDepartamento;
    }

    public void aumentarSalario(double valor){
        this.salario = salario + valor;
    }
}