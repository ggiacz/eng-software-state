package state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CorridaTest {

    Corrida corrida;

    @BeforeEach
    public void setUp() {
        corrida = new Corrida();
    }

    @Test
    public void deveAceitarCorridaSolicitada() {
        corrida.setEstado(CorridaSolicitada.getInstance());

        assertTrue(corrida.aceitar());
        assertEquals(
                CorridaAceita.getInstance(),
                corrida.getEstado()
        );
    }

    @Test
    public void naoDeveIniciarCorridaSolicitada() {
        corrida.setEstado(CorridaSolicitada.getInstance());

        assertFalse(corrida.iniciar());
    }

    @Test
    public void naoDeveFinalizarCorridaSolicitada() {
        corrida.setEstado(CorridaSolicitada.getInstance());

        assertFalse(corrida.finalizar());
    }

    @Test
    public void deveCancelarCorridaSolicitada() {
        corrida.setEstado(CorridaSolicitada.getInstance());

        assertTrue(corrida.cancelar());
        assertEquals(
                CorridaCancelada.getInstance(),
                corrida.getEstado()
        );
    }

    @Test
    public void naoDeveAceitarCorridaAceita() {
        corrida.setEstado(CorridaAceita.getInstance());

        assertFalse(corrida.aceitar());
    }

    @Test
    public void deveIniciarCorridaAceita() {
        corrida.setEstado(CorridaAceita.getInstance());

        assertTrue(corrida.iniciar());
        assertEquals(
                CorridaEmAndamento.getInstance(),
                corrida.getEstado()
        );
    }

    @Test
    public void naoDeveFinalizarCorridaAceita() {
        corrida.setEstado(CorridaAceita.getInstance());

        assertFalse(corrida.finalizar());
    }

    @Test
    public void deveCancelarCorridaAceita() {
        corrida.setEstado(CorridaAceita.getInstance());

        assertTrue(corrida.cancelar());
        assertEquals(
                CorridaCancelada.getInstance(),
                corrida.getEstado()
        );
    }

    @Test
    public void naoDeveAceitarCorridaEmAndamento() {
        corrida.setEstado(CorridaEmAndamento.getInstance());

        assertFalse(corrida.aceitar());
    }

    @Test
    public void naoDeveIniciarCorridaEmAndamento() {
        corrida.setEstado(CorridaEmAndamento.getInstance());

        assertFalse(corrida.iniciar());
    }

    @Test
    public void deveFinalizarCorridaEmAndamento() {
        corrida.setEstado(CorridaEmAndamento.getInstance());

        assertTrue(corrida.finalizar());
        assertEquals(
                CorridaFinalizada.getInstance(),
                corrida.getEstado()
        );
    }

    @Test
    public void naoDeveCancelarCorridaEmAndamento() {
        corrida.setEstado(CorridaEmAndamento.getInstance());

        assertFalse(corrida.cancelar());
    }

    @Test
    public void naoDeveAceitarCorridaFinalizada() {
        corrida.setEstado(CorridaFinalizada.getInstance());

        assertFalse(corrida.aceitar());
    }

    @Test
    public void naoDeveIniciarCorridaFinalizada() {
        corrida.setEstado(CorridaFinalizada.getInstance());

        assertFalse(corrida.iniciar());
    }

    @Test
    public void naoDeveFinalizarCorridaFinalizada() {
        corrida.setEstado(CorridaFinalizada.getInstance());

        assertFalse(corrida.finalizar());
    }

    @Test
    public void naoDeveCancelarCorridaFinalizada() {
        corrida.setEstado(CorridaFinalizada.getInstance());

        assertFalse(corrida.cancelar());
    }

    // Corrida Cancelada

    @Test
    public void naoDeveAceitarCorridaCancelada() {
        corrida.setEstado(CorridaCancelada.getInstance());

        assertFalse(corrida.aceitar());
    }

    @Test
    public void naoDeveIniciarCorridaCancelada() {
        corrida.setEstado(CorridaCancelada.getInstance());

        assertFalse(corrida.iniciar());
    }

    @Test
    public void naoDeveFinalizarCorridaCancelada() {
        corrida.setEstado(CorridaCancelada.getInstance());

        assertFalse(corrida.finalizar());
    }

    @Test
    public void naoDeveCancelarCorridaCancelada() {
        corrida.setEstado(CorridaCancelada.getInstance());

        assertFalse(corrida.cancelar());
    }
}