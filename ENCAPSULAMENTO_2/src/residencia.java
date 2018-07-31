public class residencia {
    private int quantUnidade = 0;
    private int quantDisponivel;
    private pessoa proprietario;
    private double metragemTerreno;
    private String posicFrente;
    private boolean esquina;
    private unidade[] unidades;

    public residencia(int quantDisponivel) {
        this.unidades = new unidade[quantDisponivel];
        setQuantDisponivel(quantDisponivel);
    }

    public int getQuantUnidade() {
        return quantUnidade;
    }

    public void setQuantUnidade() {
        this.quantUnidade += 1;
        this.quantDisponivel -= 1;
    }

    public void desetQuantUnidade() {
        this.quantUnidade -= 1;
        this.quantDisponivel += 1;
    }

    public int getQuantDisponivel() {
        return quantDisponivel;
    }

    public void setQuantDisponivel(int quantDisponivel) {
        this.quantDisponivel = quantDisponivel;
    }

    public pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(pessoa proprietario) {
        this.proprietario = proprietario;
    }

    public double getMetragemTerreno() {
        return metragemTerreno;
    }

    public void setMetragemTerreno(double metragemTerreno) {
        this.metragemTerreno = metragemTerreno;
    }

    public String getPosicFrente() {
        return posicFrente;
    }

    public void setPosicFrente(String posicFrente) {
        this.posicFrente = posicFrente;
    }

    public boolean isEsquina() {
        return esquina;
    }

    public void setEsquina(boolean esquina) {
        this.esquina = esquina;
    }

    public unidade[] getUnidades() {
        return unidades;
    }

    public void setUnidades(unidade unidades) {
        this.unidades[quantUnidade] = unidades;
        setQuantUnidade();
    }
}