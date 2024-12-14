import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);


    }
}