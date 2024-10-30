import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.SQLClientInfoException;

import static org.junit.jupiter.api.Assertions.*;
class BancoTest {

    private static Banco banco;

    @BeforeAll
    public static void init() {
        banco = new Banco();
        Cuenta cuenta1 = new Cuenta("Marco", "001", 3000.2);
        Cuenta cuenta2 = new Cuenta("Mateo", "002", 3500.2);
        Cuenta cuenta3 = new Cuenta("Mario", "003", 3600.2);
        Cuenta cuenta4 = new Cuenta("Martin", "004", 3050.2);
    }

    @Test
    public void testExisteCuenta() {
        System.out.println("Cuenta existe");
        boolean existe = banco.existeCuenta("Martin");
        assertTrue(existe == true);
    }

    @Test
    public void testExisteCuentaFallido() {
        System.out.println("Cuenta no existe");
        boolean existe = banco.existeCuenta("Martinn");
        assertTrue(existe == false);
    }

}