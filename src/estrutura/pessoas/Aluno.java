package src.estrutura.pessoas;

import src.estrutura.educacional.Bootcamp;
import src.estrutura.educacional.Curso;

import java.util.HashSet;
import java.util.Set;

public class Aluno extends Pessoa {
    private Set<Curso> cursosMatriculados = new HashSet<>();
    private Set<Curso> cursosFinalizados = new HashSet<>();
    private int xp = 0;

    public Aluno(String nome, String email, String github, String linkedin) {
        super(nome, email, github, linkedin);
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.cursosMatriculados.addAll(bootcamp.getCursos());
        bootcamp.getAlunosInscritos().add(this);
    }

    public void concluirCurso(Curso curso) {
        if (cursosMatriculados.contains(curso)) {
            cursosMatriculados.remove(curso);
            cursosFinalizados.add(curso);
            this.xp += curso.getXp();
        }
    }

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