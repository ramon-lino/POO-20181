import java.util.Scanner;
public class main {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private Scanner input = new Scanner(System.in);
    private BancoDados armazenamento = new BancoDados();
    ////============================================================================================================////
    private boolean verificaMatricula(String matricula) {

        return (armazenamento.getAlunos(matricula) != null || armazenamento.getProfessor(matricula) != null);
    }
    private boolean verificaCodigo(String codigo) {

        return armazenamento.getTurma(codigo) != null;
    }
    ////============================================================================================================////
    private String formatoMatricula() {
        System.out.println("Crie uma matricula com 4 (quatro) caracteres!");
        System.out.print("Nova Matricula:  ");
        String matricula = input.next();
        while (matricula.length() != 4 || verificaMatricula(matricula)) {

            if (matricula.length() == 4) {
                System.out.println("Matricula existente! Tente outra matricula");
            } else {
                System.out.println("Matricula inválida! Crie uma matricula com 4 (quatro) caracteres!");
            }
            System.out.print("Nova Matricula:  ");
            matricula = input.next();
        }
        return matricula;
    }
    ////============================================================================================================////
    private void cadastraAluno(){
        System.out.print("Informe o nome:  ");
        String nome = input.nextLine();
    //============================================================================//
        String matricula = formatoMatricula();
    //============================================================================//
        System.out.print("Informe o nome da Mãe:  ");
        input.nextLine();
        String nomeMae = input.nextLine();
    //============================================================================//
        System.out.println("Informe a data de nascimento no formato ( DD/MM/AAAA )");
        System.out.print("Data de Nascimento:  ");
        String dataNasc = input.nextLine();
    //=========================================================================-==//
        Aluno al = new Aluno(nome, matricula, nomeMae, dataNasc);
        this.armazenamento.setAlunos(al);
    }
    ////============================================================================================================////
    private void cadastraProfessor() {
        System.out.print("Informe o nome:  ");
        //input.nextLine();
        String nome = input.nextLine();
    //============================================================================//
        String matricula = formatoMatricula();
    //============================================================================//
        System.out.print("Informe o grau de instrução:  ");
        input.nextLine();
        String grau = input.nextLine();
    //============================================================================//
        System.out.print("Salario Base:  ");
        double salario = input.nextDouble();
    //============================================================================//
        Professor pf = new Professor(nome, matricula, grau, salario);
        this.armazenamento.setProfessores(pf);
    }
    ////============================================================================================================////
    private Horario cadastraHorario() {
        String[] dia = {"Seg","Ter","Qua","Qui","Sex","Sab"};
        String[] hora = {"07:00","08:00","09:00","10:00","11:00"};
        int [][] auxiliarH = {{8,9,9},{8,9,9},{8,9,9}};
        Horario horario = new Horario();
    //=============================================================================//
        System.out.println("Informe os dias de aula!");
        for (int i = 0; i < 6; i++) {
            System.out.print(i+ ") " + dia[i]+ " || ");
        }
        System.out.println();
        System.out.print("Quantidade de Dias:  ");
        int quantDia = input.nextInt();
    //=============================================================================//
        for (int i = 0; i < quantDia; i++) {
            System.out.print( i+1 +"º dia:  ");
            int d = input.nextInt();
            auxiliarH[i][0] = d;
            System.out.print("Dia: ");
            System.out.println(dia[d]);
            System.out.print("Aulas:  ");

            for (int j = 0; j < 5; j++) {
                System.out.print(j + ") " + hora[j] + " || ");
            }
            System.out.println();
            System.out.print("Quantidade de Aulas:  ");
            int quantAula = input.nextInt();

            for (int j = 1; j <= quantAula; j++) {
                System.out.print(j + "º Aula >>> ");
                int a = input.nextInt();
                auxiliarH[i][j] = a;
            }
            System.out.println();
        }
    //=============================================================================//
        horario.setDiaSemana(auxiliarH);
        horario.setQuantDias(quantDia);
        return horario;
     }
    ////============================================================================================================////
    private void cadastraTurma() {
        System.out.println("Crie um codigo com 3 (três) digitos!");
        System.out.print("Digite um código:  ");
        String codigo = input.next();
        while (codigo.length() != 3 || verificaCodigo(codigo)) {

            if (codigo.length() != 3) {
                System.out.println("Código inválido! O código só pode ter 3 (três) digitos!");
                System.out.print("Digite um código:  ");
                codigo = input.next();
            } else {
                System.out.println("Código existente! Tente outro código!");
                System.out.print("Digite um código:  ");
            }
        }
        System.out.println("Informe o numero da sala!");
        System.out.println("Quantidade de Salas disponiveis: " + (45 - armazenamento.getQuantTurmas()));
        System.out.print("Sala:  ");
        int sala = input.nextInt();

        System.out.println("Informe o tipo da sala ( \"A\", \"B\" ou \"C\"");
        char tipo = input.next().charAt(0);

        System.out.println("Digite um nome para a Sala!");
        input.nextLine();
        String nome = input.nextLine();
        // cadastrando horario;
        Horario horario = cadastraHorario();
        Turma turma = new Turma(codigo, sala, tipo, nome, horario);
        this.armazenamento.setTurmas(turma);
    }
    ////============================================================================================================////
    private void imprimeAlunos() {
        if (armazenamento.getQuantAlunos() == 0) {
            System.out.println("Não há alunos cadastrados! ");
            return;
        }
        System.out.println("Matricula   Data Nasc           Nome");
        for (int i = 0; i < armazenamento.getQuantAlunos(); i++)  {
            System.out.print(armazenamento.getArrayAluno()[i].getMatricula() + "       ");
            System.out.print(armazenamento.getArrayAluno()[i].getDataNasc() + "       ");
            System.out.println(armazenamento.getArrayAluno()[i].getNome());
        }
    }
    ////============================================================================================================////
    private void imprimeProfessor() {
        System.out.println(armazenamento.getQuantProf());
        if (armazenamento.getQuantProf() == 0) {
            System.out.println("Não há professores cadastrados! ");
            return;
        }
        System.out.println("Matricula        Grau           Nome");
        for (int i = 0; i < armazenamento.getQuantProf(); i++) {
            System.out.print(armazenamento.getArrayProfessor()[i].getMatricula() + "          ");
            System.out.print(armazenamento.getArrayProfessor()[i].getGrau() + "       ");
            System.out.println(armazenamento.getArrayProfessor()[i].getNome());
        }
    }
    ////============================================================================================================////
    private void imprimeTurma() {
        if (armazenamento.getQuantTurmas() == 0) {
            System.out.println("Não há Turmas cadastradas! ");
            return;
        }
        for (int i = 0; i < armazenamento.getQuantTurmas(); i++) {
            System.out.print(armazenamento.getArrayTurma()[i].getCodigo() + "   ");
            System.out.print(armazenamento.getArrayTurma()[i].getTipo() + "   ");
            System.out.print(armazenamento.getArrayTurma()[i].getSala() + "   ");
            System.out.println(armazenamento.getArrayTurma()[i].getNome());
        }
    }
    ////============================================================================================================////
    private void selecionaOpicao(int opc) {
        switch (opc){
            case 1:
                cadastraAluno();
                break;
            case 2:
                cadastraProfessor();
                break;
            case 3:
                cadastraTurma();
                break;
            case 4:
                imprimeAlunos();
                break;
            case 5:
                imprimeProfessor();
                break;
            case 6:
                imprimeTurma();
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
    public static void main(String[] args) {
        main gerenciador = new main();
        int opc = 99;

        System.out.println("Bem Vindo ao sistema da Escola infantil Lino Souza");
        while (opc != 0) {
            System.out.println("Digite a opção desejada!");
            System.out.println();
            System.out.println("    1 - Cadastrar Aluno");
            System.out.println("    2 - Cadastrar Professor");
            System.out.println("    3 - Cadastrar Turma");
            System.out.println("    4 - Listar ALunos");
            System.out.println("    5 - Listar Professores");
            System.out.println("    6 - Listar Turmas");
            System.out.println("    0 - Sair");
            opc = gerenciador.input.nextInt();
            gerenciador.input.nextLine();
            if (opc != 0) { gerenciador.selecionaOpicao(opc); }
        }
    }
}
