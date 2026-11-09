import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        int opcao;

        do {

            System.out.println();
            System.out.println("==================================");
            System.out.println("       CONTROLE DE ACESSO");
            System.out.println("==================================");
            System.out.println("1 - Acesso como Administrador");
            System.out.println("2 - Acesso como Usuário Comum");
            System.out.println("0 - Sair");
            System.out.println("==================================");
            System.out.print("Escolha uma opção: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println();
                    System.out.print("Digite o nome: ");

                    String nomeAdministrador = teclado.nextLine();

                    // A variável é do tipo da interface
                    IAcesso administrador = new Administrador(nomeAdministrador);

                    administrador.mostrarUsuario();
                    administrador.acessarSistema();

                    break;

                case 2:

                    System.out.println();
                    System.out.print("Digite o nome: ");

                    String nomeUsuario = teclado.nextLine();

                    // A variável é do tipo da interface
                    IAcesso usuario =
                            new UsuarioComum(nomeUsuario);

                    usuario.mostrarUsuario();
                    usuario.acessarSistema();

                    break;

                case 0:

                    System.out.println();
                    System.out.println("Programa encerrado.");

                    break;

                default:

                    System.out.println();
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        teclado.close();
    }
}
