import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PacienteTest {

    @Test
    void deveNotificarUmPaciente() {
        Exame exame = new Exame("Positivo", "gravidez", "Isaura");
        Paciente paciente = new Paciente("José");
        paciente.marcar(exame);
        exame.resltado();
        assertEquals("José, o resultado está pronto.", paciente.getUltimaNotificacao());
    }

}
