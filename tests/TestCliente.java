import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCliente {
    @Test
    public void testCriacaoCorretaCliente() throws Exception{
        Cliente c = new Cliente(1,"M".repeat(50),"Fundão","96777777");

        assertEquals(c.getId(),1,"O id está correto");
        assertEquals(c.getNome(),"M".repeat(50), "O nome está correto");
        assertEquals(c.getMorada(),"Fundão", "A morada está correta");
        assertEquals(c.getContacto(),"96777777", "O contacto está correto");
    }

    @Test
    public void testClienteIDInValido() throws Exception{
        assertThrows(Exception.class, ()-> {
            Cliente c = new Cliente(0, "Maria", "Fundão", "96777777");
        });
    }

    @Test
    public void testClienteTamanhoNomeInferior3() throws Exception{
        assertThrows(Exception.class, ()-> {
            Cliente c = new Cliente(1, "La", "Fundão", "96777777");
        });
    }

    @Test
    public void testClienteTamanhoNomeSuperior50() throws Exception{
        assertThrows(Exception.class, ()-> {
            Cliente c = new Cliente(1, "L".repeat(51), "Fundão", "96777777");
        });
    }
}
