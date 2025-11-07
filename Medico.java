public class Medico extends Pessoa {
    public String crm;

    public Medico(String nome, String cpf, String crm) {
        super(nome, cpf);
        this.crm = crm;
    }

    @Override
    public void agenda(Paciente p) {
        System.out.println("Médico %s do CRM %s possui agenda com o paciente %s", super.nome, this.crm, p.nome);
    }
}