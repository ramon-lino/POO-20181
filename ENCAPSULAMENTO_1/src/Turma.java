public class Turma {
    // Atributos para Turma;
    private String codigo;
    private int sala;
    private char tipo;
    private String nome;
    private Horario horario;

    // Construtor;
    public Turma(String codigo, int sala, char tipo, String nome, Horario horario) {
        this.codigo = codigo;
        this.sala = sala;
        this.tipo = tipo;
        this. nome = nome;
        this.horario = horario;
        System.out.println("Nova turma cadastrada!");
    }
    // Métodos de Getters;
    public String getCodigo() {
        return codigo;
    }
    public int getSala() {
        return sala;
    }
    public char getTipo() {
        return tipo;
    }
    public String getNome() {
        return nome;
    }
    public int[][] getHorario() {
        return horario.getDiaSemana();
    }
}
