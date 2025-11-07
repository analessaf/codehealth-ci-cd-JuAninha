public class Funcionario extends Pessoa {
    public String cod_func;

    public Funcionario(String nome, String cpf, String cod_func){
        super(nome, cpf);
        this.cod_func = cod_func;
    }

    @Override 
    public void agenda(Paciente p) {
        System.out.println("Nome: %s | Sintoma: %s", p.nome, p.sintoma);
    }
}