package src.estrutura.educacional;

import src.estrutura.pessoas.Professor;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private LocalDate data;
    private Professor mentor;

    // Construtor
    public Mentoria(String titulo, LocalDate data, Professor mentor) {
        this.titulo = titulo;
        this.data = data;
        this.mentor = mentor;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Professor getMentor() {
        return mentor;
    }

    public void setMentor(Professor mentor) {
        this.mentor = mentor;
    }
}