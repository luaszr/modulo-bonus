private class Departamento {
    private int codigo;
    private double totalVendas;
    private ArrayList<Funcionario> funcionarios;

    public Departamento(int codigo, double totalVendas){
        this.codigo = codigo;
        this.totalVendas = totalVendas;
        this.funcionarios = new ArrayList<>();
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


}