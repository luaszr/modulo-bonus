public class Gerente extends Funcionario{

    public Gerente(int id, double salario, int codigoDepartamento){
            super(id, salario, codigoDepartamento);
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

}
