package honda.checkpoint;

public class Caminhao extends VeiculoDeQuatroRodas{
    private double carroceria;
    private String freioAutomatico;

    @Override
    public boolean ligar() {
        return false;
    }

    @Override
    public boolean desligar() {
        return false;
    }

    @Override
    public boolean acelerar() {
        return false;
    }

    @Override
    public boolean freiar() {
        return false;
    }

    @Override
    public boolean trocarMarcha() {
        return false;
    }

    @Override
    public boolean abrirJanela() {
        return false;
    }

    @Override
    public boolean fecharJanela() {
        return false;
    }
}
