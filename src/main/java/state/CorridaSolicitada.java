package state;

public class CorridaSolicitada extends CorridaEstado {

    private CorridaSolicitada() {
    }

    private static CorridaSolicitada instance = new CorridaSolicitada();

    public static CorridaSolicitada getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Solicitada";
    }

    @Override
    public boolean aceitar(Corrida corrida) {
        corrida.setEstado(CorridaAceita.getInstance());
        return true;
    }

    @Override
    public boolean cancelar(Corrida corrida) {
        corrida.setEstado(CorridaCancelada.getInstance());
        return true;
    }
}