import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("PHP");
        curso1.setDescricao("PHP Backend");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("AdonisJs");
        curso2.setDescricao("Framework");
        curso2.setCargaHoraria(10);



        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("PHP");
        mentoria1.setDescricao("Mentoria de PHP");
        mentoria1.setDate(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Daniel: " + devDaniel.getConteudosInscritos());
        devDaniel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Daniel: " + devDaniel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Daniel: " + devDaniel.getConteudosConcluidos());
        System.out.println("XP: " + devDaniel.calcularXp());

        System.out.println("---------------------");

        Dev devBryan = new Dev();
        devBryan.setNome("Bryan");
        devBryan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Bryan: " + devBryan.getConteudosInscritos());
        devBryan.progredir();
        devBryan.progredir();
        devBryan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bryan: " + devBryan.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Bryan: " + devBryan.getConteudosConcluidos());
        System.out.println("XP: " + devBryan.calcularXp());



    }
}