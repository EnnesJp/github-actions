import java.time.LocalDate;

class Desenvolvedor extends Usuario {

  public void desenvolvedorLoop() throws Exception  {

    while(true) {
      System.out.println("Ola Desenvolvedor. O que deseja?");
      System.out.println("[1] Visualizar demanda\n[2] Criar tarefa da demanda\n[3] Voltar para menu");
      
      int choice = lerInputInteiro();
      if(choice == 1) {
        System.out.println("Visualizar demanda");
      } else if (choice == 2) {
        System.out.println("Criar tarefa da demanda");
      } else if (choice == 3){
        break;
      } else {
        System.out.println("Error character Typed: " + choice);
        break;
      }
    }
  }
}