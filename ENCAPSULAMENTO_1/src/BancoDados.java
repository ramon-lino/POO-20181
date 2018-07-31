public class BancoDados {
    private Aluno[] alunos = new Aluno[800];
    private Professor[] professores = new Professor[50];
    private Turma[] turmas = new Turma[45];
    private int quantAlunos = 0;
    private int quantProf = 0;
    private int quantTurmas = 0;

    // Métodos de setters
    public void setAlunos(Aluno aluno) {
        this.alunos[quantAlunos] = aluno;
        this.quantAlunos += 1;
    }
    public void setProfessores(Professor professores) {
        this.professores[quantProf] = professores;
        this.quantProf += 1;
    }
    public void setTurmas(Turma turmas) {
        this.turmas[quantTurmas] = turmas;
        this.quantTurmas += 1;
    }

    // Métodos de Getters;
    public Aluno getAlunos(String matricula) {
        for (int i = 0; i < quantAlunos; i++) {
            if (alunos[i].getMatricula().equals(matricula)) {
                return alunos[i];
            }
        }
        return null;
    }
    public Professor getProfessor(String matricula) {
        for (int i = 0; i < quantProf; i++) {
            if (professores[i].getMatricula().equals(matricula)) {
                return professores[i];
            }
        }
        return null;
    }
    public Turma getTurma(String codigo) {
        for (int i = 0; i < quantTurmas; i++) {
            if ( turmas[i].getCodigo().equals(codigo) ) {
                return turmas[i];
            }
        }
        return null;
    }
    public Aluno[] getArrayAluno(){
        return alunos;
    }
    public Professor[] getArrayProfessor(){
        return professores;
    }
    public Turma[] getArrayTurma(){
        return turmas;
    }
    public int getQuantAlunos() {
        return quantAlunos;
    }
    public int getQuantProf() {
        return quantProf;
    }
    public int getQuantTurmas() {
        return quantTurmas;
    }
}