public class Professor {
    // Atributos para Professor;
    private String nome;
    private String matricula;
    private String grau;
    private double salario;

    // Construtor;
    public Professor(String Nome, String Matricula, String Grau, double Salario) {
        this.nome = Nome;
        this.matricula = Matricula;
        this.grau = Grau;
        this.salario = Salario;
        System.out.println("Novo professor cadastrado!");
    }
    // Métodos de Getters;
    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getGrau() {
        return grau;
    }
    public double getSalario() {
        return salario;
    }
}
