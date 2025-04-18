package src.estrutura.pessoas;

import src.estrutura.educacional.Bootcamp;
import src.estrutura.educacional.Curso;

import java.util.HashSet;
import java.util.Set;

public class Aluno extends Pessoa {
    // Atributos espefificos de Aluno
    private Set<Curso> cursosMatriculados = new HashSet<>();
    private Set<Curso> cursosFinalizados = new HashSet<>();
    private int xp = 0;

    // Construtor com os atributos herdados de Pessoa e os atributos especificos de Aluno
    public Aluno(String nome, String email, String github, String linkedin) {
        super(nome, email, github, linkedin);
    }

    // Metodo para inscrever o aluno em um bootcamp
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.cursosMatriculados.addAll(bootcamp.getCursos());
        bootcamp.getAlunosInscritos().add(this);
    }

    // Metodo para o aluno concluir o curso e ganhar XP
    public void concluirCurso(Curso curso) {
        if (cursosMatriculados.contains(curso)) {
            cursosMatriculados.remove(curso);
            cursosFinalizados.add(curso);
            this.xp += curso.getXp();
        }
    }

    // Getters e Setters
    public Set<Curso> getCursosMatriculados() {
        return cursosMatriculados;
    }

    public Set<Curso> getCursosFinalizados() {
        return cursosFinalizados;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}