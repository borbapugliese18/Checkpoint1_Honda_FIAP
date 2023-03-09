package honda.checkpoint;

public abstract class Veiculo {

    protected String roda;
    protected String motor;
    protected char tipoMotor;
    protected String radio;
    protected String farol;
    protected double bagageiro;
    protected String buzina;
    protected String ignicao;
    protected String tipoFreio;
    protected String airBag;
    protected String painelMultmedia;

    //Getters and Setters

    public String getPainelMultmedia() {
        return painelMultmedia;
    }

    public void setPainelMultmedia(String painelMultmedia) {
        this.painelMultmedia = painelMultmedia;
    }

    public String getRoda() {
        return roda;
    }

    public void setRoda(String roda) {
        this.roda = roda;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public char getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(char tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getFarol() {
        return farol;
    }

    public void setFarol(String farol) {
        this.farol = farol;
    }

    public double getBagageiro() {
        return bagageiro;
    }

    public void setBagageiro(double bagageiro) {
        this.bagageiro = bagageiro;
    }

    public String getBuzina() {
        return buzina;
    }

    public void setBuzina(String buzina) {
        this.buzina = buzina;
    }

    public String getIgnicao() {
        return ignicao;
    }

    public void setIgnicao(String ignicao) {
        this.ignicao = ignicao;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    public String getAirBag() {
        return airBag;
    }

    public void setAirBag(String airBag) {
        this.airBag = airBag;
    }

    //Métodos
    public abstract boolean ligar();

    public abstract boolean desligar();

    public abstract boolean acelerar();

    public abstract boolean freiar();

    public abstract boolean trocarMarcha();





}
