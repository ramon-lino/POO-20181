public class Aluno {
    // Atributos para Alunos
    private String nome;
    private String matricula;
    private String nomeMae;
    private String dataNasc;

    // Construtor
    public Aluno(String Nome, String Matricula, String NomeMae, String DataNasc) {
        this.nome = Nome;
        this.matricula = Matricula;
        this.nomeMae = NomeMae;
        this.dataNasc = DataNasc;
        System.out.println("Novo aluno cadastrado!");
    }
    // Metodos de Getters
    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getNomeMae() {
        return nomeMae;
    }
    public String getDataNasc() {
        return dataNasc;
    }
}
