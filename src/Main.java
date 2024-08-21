import ao.doaat.com.Dominio.Bootcamp;
import ao.doaat.com.Dominio.Curso;
import ao.doaat.com.Dominio.Dev;
import ao.doaat.com.Dominio.Mentoria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso();
        Curso c2 = new Curso();

        c1.setTitulo("Curso java");
        c1.setDescricao("Descrição do curso java");
        c1.setCargaHoraria(60);
        c2.setTitulo("Curso kotlin");
        c2.setDescricao("Descrição do curso kotlin");
        c2.setCargaHoraria(30);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java e Devops");
        mentoria.setDescricao("descricao da mentoria Java e Devops");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Expert");
        bootcamp.setDescricao("Descricao do bootcamp Java Expert");
        bootcamp.getConteudos().add(c1);
        bootcamp.getConteudos().add(c2);
        bootcamp.getConteudos().add(mentoria);

        Dev d1 = new Dev();
        d1.setNome("David");
        d1.InscreverBootCamp(bootcamp);
        System.out.println("conteudos inscritos David" + d1.getConteudosInscritos());
        d1.progredir();
        System.out.println("conteudos inscritos David" + d1.getConteudosInscritos());
        System.out.println("conteudos concluidos David" + d1.getConteudosConcluidos());
        System.out.println("Xp: "+d1.calcularTotalXp());

        Dev d2 = new Dev();
        d2.setNome("Camila");
        d2.InscreverBootCamp(bootcamp);
        System.out.println("Conteudos inscritos Camila" + d2.getConteudosInscritos());
        d2.progredir();
        System.out.println("Conteudos inscritos Camila" + d2.getConteudosInscritos());
        System.out.println("Conteudos concluidos Camila" + d2.getConteudosConcluidos());
        System.out.println("Xp: "+d2.calcularTotalXp());

    }
}