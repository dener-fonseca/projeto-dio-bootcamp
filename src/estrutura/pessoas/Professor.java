package src.estrutura.pessoas;

import src.estrutura.educacional.Curso;
import src.estrutura.educacional.Mentoria;

public class Professor extends Pessoa {
    private String cpf;
    private String identificacao;
    private Curso cursoResponsavel;
    private Mentoria mentoria;

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public Curso getCursoResponsavel() {
        return cursoResponsavel;
    }

    public void setCursoResponsavel(Curso cursoResponsavel) {
        this.cursoResponsavel = cursoResponsavel;
    }

    public Mentoria getMentoria() {
        return mentoria;
    }

    public void setMentoria(Mentoria mentoria) {
        this.mentoria = mentoria;
    }
}