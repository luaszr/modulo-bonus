import java.util.ArrayList;

public class Bonus{

    public static Departamento encontrarMaiorVenda(ArrayList<Departamento> listaDepartamentos) throws Exception{
        //ver se a lista de departamentos ta vazia
        if (listaDepartamentos.isEmpty()){
            throw new Exception("Código 1! Sem departamentos."); //codigo da exceção 
        }

        boolean temFuncionarios = false; //vamos ver se tem algum funcionario já registrado nos departamentos

        for(Departamento departamento : listaDepartamentos){
            if(!departamento.getFuncionarios().isEmpty()){
                temFuncionarios = true;
                break;
            }
        }

        if(!temFuncionarios){
            throw new Exception("Código 1! Sem funcionários."); //se não tiver é código 1 tbm
        }

         Departamento departamentoMaiorVenda = listaDepartamentos.get(0); //vou iniciar uma busca pelo departamento que mais vendeu, começando pelo primeiro índice

         for (Departamento departamento : listaDepartamentos) {
            if (departamento.getTotalVendas() > departamentoMaiorVenda.getTotalVendas()) {
                departamentoMaiorVenda = departamento; //armazenei o departamento de maior venda aqui!
            }
        }
        return departamentoMaiorVenda; 
        
        
    }

    public static int aplicarBonus(Departamento departamentoMaiorVenda) throws Exception{
        boolean funcionarioElegivel = false;

            for (Funcionario funcionario : departamentoMaiorVenda.getFuncionarios()){
                funcionarioElegivel = true;
                if (funcionario instanceof Gerente || funcionario.getSalario() >= 150000){
                    funcionario.aumentarSalario(1000);
                } else {
                    funcionario.aumentarSalario(2000);
                }
                System.out.println("Funcionário ID:" + funcionario.getId() + " - Novo salário:" + funcionario.getSalario());
            }
        
        if(!funcionarioElegivel){
            throw new Exception("Código 2.");
        }
        
        return 0;
    }

        
}