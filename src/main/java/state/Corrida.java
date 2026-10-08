package state;

public class Corrida {

    private String destino;
    private CorridaEstado estado;

    public Corrida() {
        this.estado = CorridaSolicitada.getInstance();
    }

    public void setEstado(CorridaEstado estado) {
        this.estado = estado;
    }

    public CorridaEstado getEstado() {
        return estado;
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public boolean aceitar() {
        return estado.aceitar(this);
    }

    public boolean iniciar() {
        return estado.iniciar(this);
    }

    public boolean finalizar() {
        return estado.finalizar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}