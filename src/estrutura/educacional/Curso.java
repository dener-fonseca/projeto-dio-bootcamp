package src.estrutura.educacional;

import src.estrutura.pessoas.Aluno;
import src.estrutura.pessoas.Professor;

import java.util.HashSet;
import java.util.Set;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria; // em horas
    private Professor professorResponsavel;
    private Set<Aluno> alunosInscritos = new HashSet<>();

    // Construtor
    public Curso(String titulo, String descricao, int cargaHoraria, Professor professorResponsavel) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.professorResponsavel = professorResponsavel;
    }

    // Método para calcular XP (exemplo: 10 XP por hora)
    public int getXp() {
        return cargaHoraria * 10;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public Set<Aluno> getAlunosInscritos() {
        return alunosInscritos;
    }

    public void setAlunosInscritos(Set<Aluno> alunosInscritos) {
        this.alunosInscritos = alunosInscritos;
    }
}