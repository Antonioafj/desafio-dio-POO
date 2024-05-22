import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("dscrição do curso java");
        curso1.setCargaHoraria(7);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao do curso java");
        curso2.setCargaHoraria(5);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso C++");
        curso3.setDescricao("Descrição do Curso C++");
        curso3.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição da mentoria java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria de java segunda");
        mentoria2.setDescricao("descrição da mentoria java 2");
        mentoria2.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("C++ Developer");
        bootcamp.setDescricao("Descrição c++");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria2);
        bootcamp.getConteudos().add(curso3);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteudos Inscritos" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularToralXp());
        System.out.println( devCamila.ganharBootcamp());


        System.out.println("\n---------------\n");

        Dev devTony = new Dev();
        devTony.setNome("Tony");
        devTony.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devTony.getConteudosInscritos());
        devTony.progredir();
        devTony.progredir();
        System.out.println("Conteudos Inscritos" + devTony.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devTony.getConteudosConcluidos());
        System.out.println("XP: " + devTony.calcularToralXp());
        System.out.println( devTony.ganharBootcamp());

    }
}