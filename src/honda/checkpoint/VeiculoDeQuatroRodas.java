package honda.checkpoint;

public abstract class VeiculoDeQuatroRodas extends Veiculo{

    private String janela;
    private String cambio;
    private String arCondicionado;
    private String travaPorta;

    //Getters and Setters

    public String getJanela() {
        return janela;
    }

    public void setJanela(String janela) {
        this.janela = janela;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(String arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public String getTravaPorta() {
        return travaPorta;
    }

    public void setTravaPorta(String travaPorta) {
        this.travaPorta = travaPorta;
    }

    //Métodos
    public abstract boolean abrirJanela();

    public abstract boolean fecharJanela();

}
