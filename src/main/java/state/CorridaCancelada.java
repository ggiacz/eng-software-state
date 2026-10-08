package state;

public class CorridaCancelada extends CorridaEstado {

    private CorridaCancelada() {
    }

    private static CorridaCancelada instance = new CorridaCancelada();

    public static CorridaCancelada getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Cancelada";
    }
}