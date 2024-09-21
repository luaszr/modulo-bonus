public class Bonus{
    
    public static int validarDados(ArrayList<Departamento> listaDepartamentos) throws Exception{
        if (listaDepartamentos.isEmpty()){
            throw new Exception("Código 1! Sem departamentos.");
        }
    }

        boolean temFuncionarios = false;

        for(Departamento departamento : listaDepartamentos){
            if(!departamento.getFuncionarios().isEmpty()){
                temFuncionarios = true;
                break;
            }
        }

        if(!temFuncionarios){
            throw new Exception("Código 1! Sem funcionários.")
        }

}