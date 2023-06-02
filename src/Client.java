import java.time.LocalDate;

class Client extends Usuario {

  public void clientLoop() throws Exception  {

    while(true) {
      System.out.println("Ola Cliente. O que deseja?");
      System.out.println("[1] Solicitar software\n[2] Consultar demanda\n[3] Voltar para menu");
      
      int escolha = lerInputInteiro();
      if(escolha == 1) {
        System.out.println("Solicitar software");
      } else if (escolha == 2){
        System.out.println("Consultar demanda");
      } else if (escolha == 3){ 
          break;
      } else {
        System.out.println("Error character Typed: " + escolha);
        break;
      }
    }
  }
}