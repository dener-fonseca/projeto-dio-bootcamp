package src.main;

import src.estrutura.educacional.*;
import src.estrutura.pessoas.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criar professores
        Professor prof1 = new Professor("Maria Silva", "maria@gmail.com", "github.com/mariadev", "linkedin.com/in/mariadev", "123.456.789-00", "Prof001");
        Professor prof2 = new Professor("Carlos Souza", "carlos@gmail.com", "github.com/carlosdev", "linkedin.com/in/carlosdev", "987.654.321-00", "Prof002");

        // Criar cursos
        Curso cursoJava = new Curso("Java Básico", "Aprenda Java do zero", 8, prof1);
        Curso cursoJS = new Curso("JavaScript Avançado", "Domine o JS moderno", 10, prof2);

        // Atribuir cursos aos professores
        prof1.setCursoResponsavel(cursoJava);
        prof2.setCursoResponsavel(cursoJS);

        // Criar mentorias
        Mentoria mentoria1 = new Mentoria("Mentoria de Carreira", LocalDate.now().plusDays(3), prof1);
        prof1.setMentoria(mentoria1);

        // Criar Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Full Stack");
        bootcamp.setDescricao("Formação completa em desenvolvimento web");
        bootcamp.setDataInicial(LocalDate.now());
        bootcamp.setDataFinal(LocalDate.now().plusDays(45));
        bootcamp.getCursos().add(cursoJava);
        bootcamp.getCursos().add(cursoJS);
        bootcamp.getProfessores().add(prof1);
        bootcamp.getProfessores().add(prof2);

        // Mostrar informações do bootcamp
        System.out.println("====== BOOTCAMP ======");
        System.out.println("Nome: " + bootcamp.getNome());
        System.out.println("Descrição: " + bootcamp.getDescricao());
        System.out.println("Duração: " + bootcamp.getDataInicial() + " até " + bootcamp.getDataFinal());
        System.out.println("Cursos:");
        for (Curso c : bootcamp.getCursos()) {
            System.out.println("- " + c.getTitulo() + " com " + c.getProfessorResponsavel().getNome());
        }
        System.out.println();

        // Criar aluno e inscrever-se
        Aluno aluno = new Aluno("João Oliveira", "joao@gmail.com", "github.com/joaodev", "linkedin.com/in/joaodev");
        aluno.inscreverBootcamp(bootcamp);
        System.out.println("====== ALUNO INSCRITO ======");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Cursos matriculados:");
        for (Curso c : aluno.getCursosMatriculados()) {
            System.out.println("- " + c.getTitulo());
        }
        System.out.println();

        // Simular progresso
        aluno.concluirCurso(cursoJava);
        System.out.println("====== PROGRESSO DO ALUNO ======");
        System.out.println("Cursos finalizados:");
        for (Curso c : aluno.getCursosFinalizados()) {
            System.out.println("- " + c.getTitulo());
        }
        System.out.println("XP Total: " + aluno.getXp());
        System.out.println();

        // Mostrar mentoria
        System.out.println("====== MENTORIA ======");
        System.out.println("Mentoria: " + mentoria1.getTitulo());
        System.out.println("Data: " + mentoria1.getData());
        System.out.println("Mentor(a): " + mentoria1.getMentor().getNome());
    }
}