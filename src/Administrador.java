public class Administrador extends Usuario {

     // Construtor
     public Administrador(String nome) {
        super(nome);
    }

    // Implementação específica do acesso
    @Override
    public void acessarSistema() {
        System.out.println("Acesso de administrador liberado.");
        System.out.println("Permissão: acesso completo ao sistema.");
    }

}
