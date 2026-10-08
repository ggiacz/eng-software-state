package state;

public class CorridaEmAndamento extends CorridaEstado {

    private CorridaEmAndamento() {
    }

    private static CorridaEmAndamento instance = new CorridaEmAndamento();

    public static CorridaEmAndamento getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Em Andamento";
    }

    @Override
    public boolean finalizar(Corrida corrida) {
        corrida.setEstado(CorridaFinalizada.getInstance());
        return true;
    }
}