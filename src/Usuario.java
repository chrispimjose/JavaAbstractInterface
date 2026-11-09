public abstract  class Usuario implements IAcesso {

    protected String nome;

    // Construtor da classe abstrata
    public Usuario(String nome) {
        this.nome = nome;
    }

    // Método concreto compartilhado pelas subclasses
    public void mostrarUsuario() {
        System.out.println("Usuário: " + nome);
    }

    // Método abstrato que cada tipo de usuário
    // deverá implementar de forma diferente
    // Sobrescrevendo o método da interface
    // public void acessarSistema();

}
