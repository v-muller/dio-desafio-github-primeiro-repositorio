package br.com.dio.desafio.dados;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Dados {

    public Dados(){}

    public void adicionaDados(){
        //Criar Cursos
        Curso cursoJava = new Curso("Curso Java", "Curso para iniciantes Java", 22);
        Curso cursoSpring = new Curso("Curso SpringBoot", "Curso de introdução ao Spring", 13);
        Curso cursoGit = new Curso("Curso Git", "Curso de Git para iniciantes", 6);
        Curso cursoJavascript = new Curso("Curso Javascript", "Curso de Javascropt para iniciantes", 18);
        Curso cursoHTML = new Curso("Curso de HTML", "Curso de HTML para iniciantes", 10);
        Curso cursoCSS = new Curso("Curso de CSS", "Curso de CSS para iniciantes", 11);
        Curso cursoPraticoBackend = new Curso("Curso prático de Backend", "Criação de Backend em Java", 13);

        //Criar Mentorias
        Mentoria mentoriaJava = new Mentoria("Mentoria de Java", "Mentoria de apoio na dúvidas dos devs", LocalDate.now());
        Mentoria mentoriaSpring = new Mentoria("Mentoria de Spring", "Mentoria de apoio na dúvidas dos devs", LocalDate.now().plusDays(7));
        Mentoria mentoriaGit = new Mentoria("Mentoria de Git", "Mentoria de apoio na dúvidas dos devs", LocalDate.now().plusDays(14));
        Mentoria mentoriaJavascript = new Mentoria("Mentoria de Javascript", "Mentoria de apoio na dúvidas dos devs", LocalDate.now().plusDays(21));
        Mentoria mentoriaHTML = new Mentoria("Mentoria de HTML", "Mentoria de apoio na dúvidas dos devs", LocalDate.now().plusDays(28));
        Mentoria mentoriaCSS = new Mentoria("Mentoria de CSS", "Mentoria de apoio na dúvidas dos devs", LocalDate.now().plusDays(35));
        Mentoria mentoriaCursoBackend = new Mentoria("Mentoria do curso Prático de Backend", "Mentoria de apoio na dúvidas dos devs", LocalDate.now().plusDays(42));

        //Criar Bootcamps e adicionar cursos e mentorias a eles
        Bootcamp bootcampBackend = new Bootcamp("Bootcamp Backend", "Bootcamp focado em Backend utilizando Java e Spring");
        bootcampBackend.getConteudos().add(cursoJava);
        bootcampBackend.getConteudos().add(cursoSpring);
        bootcampBackend.getConteudos().add(cursoGit);
        bootcampBackend.getConteudos().add(mentoriaJava);
        bootcampBackend.getConteudos().add(mentoriaSpring);
        bootcampBackend.getConteudos().add(mentoriaGit);

        Bootcamp bootcampFrontend = new Bootcamp("Bootcamp Frontend", "Bootcamp focado em Frontend utilizando HTML, CSS e JS");
        bootcampFrontend.getConteudos().add(cursoJavascript);
        bootcampFrontend.getConteudos().add(cursoHTML);
        bootcampFrontend.getConteudos().add(cursoCSS);
        bootcampFrontend.getConteudos().add(cursoGit);
        bootcampFrontend.getConteudos().add(mentoriaJavascript);
        bootcampFrontend.getConteudos().add(mentoriaHTML);
        bootcampFrontend.getConteudos().add(mentoriaCSS);
        bootcampFrontend.getConteudos().add(mentoriaGit);


        Bootcamp bootcampPraticoBackend = new Bootcamp("Bootcamp Prático Backend", "Bootcamp na prática de Backend");
        bootcampPraticoBackend.getConteudos().add(cursoPraticoBackend);
        bootcampPraticoBackend.getConteudos().add(mentoriaCursoBackend);

        //Criar Devs
        Dev devJorge = new Dev("Jorge");
        devJorge.inscreverBootcamp(bootcampBackend);
        devJorge.progredir();
        devJorge.progredir();
        devJorge.calcularTotalXp();

        Dev devBeto = new Dev("Beto");
        devBeto.inscreverBootcamp(bootcampBackend);
        devBeto.progredir();
        devBeto.calcularTotalXp();

        Dev devClaudia = new Dev("Claudia");
        devClaudia.inscreverBootcamp(bootcampBackend);
        devClaudia.progredir();
        devClaudia.progredir();
        devClaudia.calcularTotalXp();

        Dev devVeronica = new Dev("Veronica");
        devVeronica.inscreverBootcamp(bootcampBackend);
        devVeronica.progredir();
        devVeronica.progredir();
        devVeronica.progredir();
        devVeronica.calcularTotalXp();

        Dev devEllen = new Dev("Ellen");
        devEllen.inscreverBootcamp(bootcampFrontend);
        devEllen.progredir();
        devEllen.calcularTotalXp();

        Dev devSofia = new Dev("Sofia");
        devSofia.inscreverBootcamp(bootcampFrontend);
        devSofia.progredir();
        devSofia.progredir();
        devSofia.progredir();
        devSofia.progredir();
        devSofia.calcularTotalXp();

        Dev devLaura = new Dev("Laura");
        devLaura.inscreverBootcamp(bootcampFrontend);
        devLaura.progredir();
        devLaura.progredir();
        devLaura.calcularTotalXp();

        Dev devJoao = new Dev("João");
        devJoao.inscreverBootcamp(bootcampFrontend);
        devJoao.progredir();
        devJoao.calcularTotalXp();

        Dev devTiago = new Dev("Tiago");
        devTiago.inscreverBootcamp(bootcampPraticoBackend);
        devTiago.progredir();
        devTiago.progredir();
        devTiago.progredir();
        devTiago.calcularTotalXp();

        Dev devPaula = new Dev("Paulo");
        devPaula.inscreverBootcamp(bootcampPraticoBackend);
        devPaula.progredir();
        devPaula.progredir();
        devPaula.progredir();
        devPaula.progredir();
        devPaula.calcularTotalXp();

        Dev devTais = new Dev("Tais");
        devTais.inscreverBootcamp(bootcampPraticoBackend);
        devTais.progredir();
        devTais.progredir();
        devTais.calcularTotalXp();

        Dev devHelena = new Dev("Helena");
        devHelena.inscreverBootcamp(bootcampPraticoBackend);
        devHelena.progredir();
        devHelena.calcularTotalXp();

        System.out.println("Ranking Bootcamp Backend");
        for(Dev d : bootcampBackend.rankear()){
            System.out.printf("Nome: %s\nXP: %.2f\n",d.getNome(), d.getXp());
        }
        System.out.println();

        System.out.println("Ranking Bootcamp Frontend");
        for(Dev d : bootcampFrontend.rankear()){
            System.out.printf("Nome: %s\nXP: %.2f\n",d.getNome(), d.getXp());
        }
        System.out.println();

        System.out.println("Ranking Bootcamp Prático Backend");
        for(Dev d : bootcampPraticoBackend.rankear()){
            System.out.printf("Nome: %s\nXP: %.2f\n",d.getNome(), d.getXp());
        }

    }
}
