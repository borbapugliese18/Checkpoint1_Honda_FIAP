package honda.checkpoint;

public class Moto extends Veiculo{
    private String cortaPipa;
    private String mataCachorro;

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
}
