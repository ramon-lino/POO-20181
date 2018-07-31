import java.util.Scanner;

public class main {
    private Scanner input = new Scanner(System.in);
    private residencia[] comunidade = new residencia[100];
    private int quantidadeResidencias = 0;

    private boolean verificaUnidades(pessoa morador, residencia residencia) {
        int cont = 0;
        for ( int i = 0; i < residencia.getQuantUnidade(); i ++ ) {
            if ( residencia.getUnidades()[i].getInquilino().getCpf().equals(morador.getCpf())) {
                cont += 1;
            }
        }
        if ( cont < 4 ) {
            return true;
        } else {
            return false;
        }
    }

    private pessoa novaPessoa() {
        System.out.print("Nome:  ");
        input.nextLine();
        String nome = input.nextLine();

        System.out.print("CPF:  ");
        String cpf = input.next();

        System.out.print("Idade:  ");
        int idade = input.nextInt();

        System.out.print("Salário:  ");
        double salario = input.nextDouble();

        pessoa pessoa = new pessoa();
        pessoa.setNome(nome);
        pessoa.setCpf(cpf);
        pessoa.setIdade(idade);
        pessoa.setSalario(salario);

        return pessoa;
    }
    private void novaResidencia() {
        System.out.print("Quantidade de Unidades:  ");
        int quantidade = input.nextInt();
        System.out.print("Área do Terreno ( m² ):  ");
        double metragem = input.nextDouble();
        System.out.print("Posição da frente (Norte, Sul, Leste, Oeste):  ");
        String posi = input.next();
        System.out.print("Residencia de esquina? (S/N):  ");
        String esquina = input.next();
        boolean esq;

        if (esquina.equals("s") || esquina.equals("S")) {
            esq = true;
        } else {
            esq = false;
        }

        System.out.println("Proprietario da Residência:");
        pessoa pessoa = novaPessoa();

        residencia residencia = new residencia(quantidade);
        residencia.setMetragemTerreno(metragem);
        residencia.setPosicFrente(posi);
        residencia.setEsquina(esq);
        residencia.setProprietario(pessoa);
        comunidade[quantidadeResidencias] = residencia;
        this.quantidadeResidencias++;
    }

    private void alugarUnidade() {
        System.out.println("Escolha a residência que deseja alugar uma unidade!");
        System.out.println();
        int opc = escolhe_residencia();

        System.out.println("Dados do Morador:");
        pessoa pessoa = novaPessoa();

        if (verificaUnidades(pessoa, comunidade[opc])) {
            System.out.println("Esse inquilino excedeu o numero (quatro) de unidades alugadas");
            return;
        }

        unidade unidade = new unidade();
        unidade.setInquilino(pessoa);
        comunidade[opc].setUnidades(unidade);
        System.out.println("Unidade alugada!");
        System.out.println();
    }

    private void imprime_residencias() {
        if ( quantidadeResidencias == 0 ) {
            System.out.println("Não há nenhuma residência!");
            return;
        }

        for (int i = 0; i < quantidadeResidencias; i++) {
            System.out.print(i + " - ");
            System.out.print(comunidade[i].getProprietario().getCpf() + "   ");
            System.out.println(comunidade[i].getProprietario().getNome());
        }
    }

    private void imprime_unidades(int r) {
        System.out.println("idade     CPF         NOME");
        for (int i = 0; i < comunidade[r].getQuantUnidade(); i++) {
            System.out.print(" "+comunidade[r].getUnidades()[i].getInquilino().getIdade() + "   ");
            System.out.print(comunidade[r].getUnidades()[i].getInquilino().getCpf() + "   ");
            System.out.println(comunidade[r].getUnidades()[i].getInquilino().getNome());
        }
    }

    private int escolhe_residencia() {
        imprime_residencias();

        System.out.print("Residência:  ");
        int opc = input.nextInt();

        while (opc >= quantidadeResidencias){
            System.out.println("Residência inválida!");
            System.out.print("Residência:  ");
            opc = input.nextInt();
        }
        return opc;
    }
    public static void main(String[] args) {
        main gerenciador = new main();

        int opc = 99;
        System.out.println("Bem vindo ao sistema de alugueis de unidades residênciais!");
        while (opc != 0) {
            System.out.println("1) - Nova residência");
            System.out.println("2) - Alugar unidade");
            System.out.println("3) - Mostrar todas as Residências");
            System.out.println("4) - Mostrar moradores de uma residência");
            System.out.println("0) - Sair");
            opc = gerenciador.input.nextInt();
            switch (opc){
                case 1:
                    gerenciador.novaResidencia();
                    break;
                case 2:
                    gerenciador.alugarUnidade();
                    break;
                case 3:
                    gerenciador.imprime_residencias();
                    break;
                case 4:
                    System.out.println("Escolha uma residência!");
                    gerenciador.imprime_unidades( gerenciador.escolhe_residencia() );
                default:
            }
        }
    }
}
