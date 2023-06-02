import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Usuario {

  public static String lerInput() throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        String entradaDoTeclado = buff.readLine();

        return entradaDoTeclado;
    }
  
  public static int lerInputInteiro() throws Exception {
    BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

    int entradaDoTeclado = buff.read();

    return entradaDoTeclado-48;
  }

  public static void loopDoUsuario() throws Exception {
    while (true) {
      System.out.println("Quem eh voce?\n[1] Cliente\n[2] Desenvolvedor");
      int escolha = lerInputInteiro();
      if(escolha == 1) {
        System.out.println("Cliente Selecionado");
      } else if(escolha == 2) {
        System.out.println("Cliente Desenvolvedor");
      } else {
        System.out.println("Error character Typed: " + escolha);
        break;
      }
    }
  }
}