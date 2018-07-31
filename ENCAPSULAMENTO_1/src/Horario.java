public class Horario {
    // Atributtos para Horario;
    private int[][] diaSemana = new int[0][0];
    private int quantDias = 0;

    // Métodos de Setters;
    public void setDiaSemana(int[][] diaSemana) {
        this.diaSemana = diaSemana;
    }
    public void setQuantDias(int quantDias){
        this.quantDias = quantDias;
    }
    // Métodos de Getters;
    public int[][] getDiaSemana() {

        return diaSemana;
    }
    public int getQuantDias(){
        return quantDias;
    }
}

