public class Vendedor extends Funcionario{

    public Vendedor(int id, double salario, int codigoDepartamento, int comissao, int qntdVendas){
        super(id, salario, codigoDepartamento);
        this.comissao = comissao;
        this.qntdVendas = qntdVendas;
    }

    public int getId(){
        return this.id;
    }

    public int getSalario(){
        return this.salario;
    }

    public int getCodigoDepartamento(){
        return this.codigoDepartamento;
    }

    public int getComissao(){
        return this.comissao;
    }

    public int getQtndVendas(){
        return this.qntdVendas;
    }

}