public class Vendedor extends Funcionario{
    private double comissao;
    private double qntdVendas;
    public Vendedor(int id, double salario, int codigoDepartamento, double comissao, double qntdVendas){
        super(id, salario, codigoDepartamento);
        this.comissao = comissao;
        this.qntdVendas = qntdVendas;
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

    public double getComissao(){
        return this.comissao;
    }

    public double getQtndVendas(){
        return this.qntdVendas;
    }

}