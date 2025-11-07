public class Paciente extends Pessoa {
    public String sintoma;

    public Peciente (String nome, String cpf, String sintoma){
        super(nome, cpf);
        this.sintoma = sintoma;
    }

    @Override
    public void agendar(){
        
    }
}