package src.estrutura.pessoas;

public abstract class Pessoa {
    // Atributos da superclasse Pessoa
    private String nome;
    private String email;
    private String github;
    private String linkedin;

    // Construtor que recebe atributos específicos para a superclasse Pessoa
    public Pessoa(String nome, String email, String github, String linkedin) {
        this.nome = nome;
        this.email = email;
        this.github = github;
        this.linkedin = linkedin;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }
}