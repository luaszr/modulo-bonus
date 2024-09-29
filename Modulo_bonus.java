public class Modulo_bonus{
    public static void main(String[] args){
        try {
            Funcionario f1 = new Vendedor (1,120000, 1); //criando os funcionarios
            Funcionario f2 = new Gerente (2,16000, 1);

            Departamento departamento1 = new Departamento(101, 1000000); //criando os departamentos
            
            Departamento departamento2 = new Departamento(102, 1000000); 
            
            departamento1.adicionarFuncionario(f1); //adicionando os funcionarios a um departamento
            departamento2.adicionarFuncionario(f2);
            
            //teste para ver se estava atribuindo certo os funcionarios ao departamento
            /*System.out.println("Funcionários no Departamento " + departamento2.getCodigo() + ":");
            for (Funcionario funcionario : departamento2.getFuncionarios()) {
                System.out.println("ID: " + funcionario.getId());*/ 
            //Bonus.aplicarBonus(Departamento departamentoMaiorVenda);
            
            
            //encontrando o departamento de maior venda 
            Departamento maiorVenda = Bonus.encontrarMaiorVenda(Departamento.getListaDepartamentos());
            System.out.println("Código do departamento com maior venda: " + maiorVenda.getCodigo());
            
            //aplicando o bonus ao departamento de maior venda
            Bonus.aplicarBonus(maiorVenda);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
