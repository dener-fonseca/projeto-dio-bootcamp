package src.main;

import src.estrutura.educacional.*;
import src.estrutura.pessoas.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando professores
        Professor prof1 = new Professor("Maria Silva", "maria@gmail.com", "github.com/mariadev", "linkedin.com/in/mariadev", "123.456.789-00", "Prof001");
        Professor prof2 = new Professor("Carlos Souza", "carlos@gmail.com", "github.com/carlosdev", "linkedin.com/in/carlosdev", "987.654.321-00", "Prof002");

        // Criando cursos
        Curso cursoJava = new Curso("Java Básico", "Aprenda Java do zero", 8, prof1);
        Curso cursoJavaScript = new Curso("JavaScript Avançado", "Domine o JS moderno", 10, prof2);

        // Atribuindo cursos aos professores
        prof1.setCursoResponsavel(cursoJava);
        prof2.setCursoResponsavel(cursoJavaScript);

        // Criando mentorias
        Mentoria mentoria1 = new Mentoria("Mentoria de Carreira", LocalDate.now().plusDays(3), prof1);
        prof1.setMentoria(mentoria1);

        // Criando Bootcamp
        Bootcamp bootcamp = new Bootcamp(
            "Bootcamp Full Stack DIO",
            "Formação completa em desenvolvimento web",
            LocalDate.now(),
            LocalDate.now().plusDays(45)
        );
        bootcamp.getCursos().add(cursoJava);
        bootcamp.getCursos().add(cursoJavaScript);
        bootcamp.getProfessores().add(prof1);
        bootcamp.getProfessores().add(prof2);

        // Mostrando informações do bootcamp
        System.out.println("====== BOOTCAMP ======");
        System.out.println("Nome: " + bootcamp.getNome());
        System.out.println("Descrição: " + bootcamp.getDescricao());
        System.out.println("Duração: " + bootcamp.getDataInicial() + " até " + bootcamp.getDataFinal());
        System.out.println("Cursos:");
        for (Curso c : bootcamp.getCursos()) {
            System.out.println("- " + c.getTitulo() + " com " + c.getProfessorResponsavel().getNome());
        }
        System.out.println();

        // Criando aluno e o inscrevendo no bootcamp
        Aluno aluno = new Aluno("João Oliveira", "joao@gmail.com", "github.com/joaodev", "linkedin.com/in/joaodev");
        aluno.inscreverBootcamp(bootcamp);
        System.out.println("====== ALUNO INSCRITO ======");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Cursos matriculados:");
        for (Curso c : aluno.getCursosMatriculados()) {
            System.out.println("- " + c.getTitulo());
        }
        System.out.println();

        // Simulando progresso
        aluno.concluirCurso(cursoJava);
        System.out.println("====== PROGRESSO DO ALUNO ======");
        System.out.println("Cursos finalizados:");
        for (Curso c : aluno.getCursosFinalizados()) {
            System.out.println("- " + c.getTitulo());
        }
        System.out.println("XP Total: " + aluno.getXp());
        System.out.println();

        // Mostrando mentoria
        System.out.println("====== MENTORIA ======");
        System.out.println("Mentoria: " + mentoria1.getTitulo());
        System.out.println("Data: " + mentoria1.getData());
        System.out.println("Mentor(a): " + mentoria1.getMentor().getNome());
    }
}