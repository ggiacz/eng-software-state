package state;

public abstract class CorridaEstado {

    public abstract String getEstado();

    public boolean aceitar(Corrida corrida) {
        return false;
    }

    public boolean iniciar(Corrida corrida) {
        return false;
    }

    public boolean finalizar(Corrida corrida) {
        return false;
    }

    public boolean cancelar(Corrida corrida) {
        return false;
    }
}