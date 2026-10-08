package state;

public class CorridaFinalizada extends CorridaEstado {

    private CorridaFinalizada() {
    }

    private static CorridaFinalizada instance = new CorridaFinalizada();

    public static CorridaFinalizada getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Finalizada";
    }
}