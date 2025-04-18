package src.main;

import src.estrutura.pessoas.Aluno;
import src.estrutura.pessoas.Professor;
import src.estrutura.educacional.Bootcamp;
import src.estrutura.educacional.Curso;
import src.estrutura.educacional.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando professores
        Professor prof1 = new Professor("Maria Silva", "maria@gmail.com", "github.com/mariadev", "linkedin.com/in/mariadev", "123.456.789-00", "Prof001");
        Professor prof2 = new Professor("Carlos Souza", "carlos@gmail.com", "github.com/carlosdev", "linkedin.com/in/carlosdev", "987.654.321-00", "Prof002");

        // Criando cursos
        Curso cursoJava = new Curso("Java Básico", "Introdução ao Java", 8, prof1);
        Curso cursoJS = new Curso("JavaScript Avançado", "Manipulação de DOM e Assíncrono", 10, prof2);

        // Criando mentoria
        Mentoria mentoria = new Mentoria("Mentoria de Carreira", LocalDate.now(), prof1);

        // Criando bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp Desenvolvedor", "Programa intensivo de desenvolvimento", LocalDate.now(), LocalDate.now().plusDays(45));
        bootcamp.getProfessores().add(prof1);
        bootcamp.getProfessores().add(prof2);
        bootcamp.getCursos().add(cursoJava);
        bootcamp.getCursos().add(cursoJS);

        // Criando aluno
        Aluno aluno = new Aluno("João Oliveira", "joao@gmail.com", "github.com/joaodev", "linkedin.com/in/joaodev");

        // Aluno se inscreve no bootcamp
        aluno.inscreverBootcamp(bootcamp);

        // Mostra cursos matriculados
        System.out.println("Cursos Matriculados: ");
        aluno.getCursosMatriculados().forEach(c -> System.out.println(" - " + c.getTitulo()));

        // Aluno conclui curso
        aluno.concluirCurso(cursoJava);

        // Mostra cursos finalizados e XP
        System.out.println("\nCursos Finalizados: ");
        aluno.getCursosFinalizados().forEach(c -> System.out.println(" - " + c.getTitulo()));
        System.out.println("XP Total: " + aluno.getXp());
    }
}