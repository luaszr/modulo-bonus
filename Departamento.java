import java.util.ArrayList;
public class Departamento {
    private int codigo;
    private double totalVendas;
    private ArrayList<Funcionario> funcionarios;
    private static ArrayList<Departamento> listaDepartamentos = new ArrayList<>();

    public static ArrayList<Departamento> getListaDepartamentos() {
        return listaDepartamentos;
    }

    public Departamento(int codigo, double totalVendas){
        this.codigo = codigo;
        this.totalVendas = totalVendas;
        this.funcionarios = new ArrayList<>();
        listaDepartamentos.add(this);

    }

    public int getCodigo(){
        return this.codigo;
    }

    public double getTotalVendas(){
        return this.totalVendas;
    }

    public void adicionarFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public ArrayList<Funcionario> getFuncionarios() {
    return this.funcionarios;
    
}
}