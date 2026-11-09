public class UsuarioComum extends Usuario{
     
    // Construtor
     public UsuarioComum(String nome) {
        super(nome);
    }

    // Implementação específica do acesso
    @Override
    public void acessarSistema() {
        System.out.println("Acesso de usuário comum liberado.");
        System.out.println("Permissão: acesso limitado ao sistema.");
    }

}
