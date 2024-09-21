private class Departamento {
    private int codigo;
    private double totalVendas;
    private ArrayList<Funcionario> funcionarios;
    private static ArrayList<Departamento> listaDepartamentos;

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