package state;

public class CorridaAceita extends CorridaEstado {

    private CorridaAceita() {
    }

    private static CorridaAceita instance = new CorridaAceita();

    public static CorridaAceita getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Aceita";
    }

    @Override
    public boolean iniciar(Corrida corrida) {
        corrida.setEstado(CorridaEmAndamento.getInstance());
        return true;
    }

    @Override
    public boolean cancelar(Corrida corrida) {
        corrida.setEstado(CorridaCancelada.getInstance());
        return true;
    }
}