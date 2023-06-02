import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

import org.junit.After;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

@SuppressWarnings({ "unused", "deprecation" })
class ClientTest {

	private final InputStream systemIn = System.in;
  private final PrintStream systemOut = System.out;

  private ByteArrayInputStream testIn;
  private ByteArrayOutputStream testOut;

  @BeforeEach
  public void setUpOutput() {
      testOut = new ByteArrayOutputStream();
      System.setOut(new PrintStream(testOut));
  }

  private void provideInput(String data) {
      testIn = new ByteArrayInputStream(data.getBytes());
      System.setIn(testIn);
  }

  private String getOutput() {
      return testOut.toString();
  }
  
  @After
  public void restoreSystemInputOutput() {
      System.setIn(systemIn);
      System.setOut(systemOut);
  }

	@Test
	void testClientLoopException() throws Exception {
		provideInput("6");
		Client cliente = new Client();
		cliente.clientLoop();
		
		String output = getOutput();
		assertTrue(output.contains("Ola Cliente. O que deseja?"));
		assertTrue(output.contains("[1] Solicitar software\n[2] Consultar demanda\n[3] Voltar para menu"));
		assertTrue(output.contains("Error character Typed: 6\n"));
	}
}