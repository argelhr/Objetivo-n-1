package controller;

import model.Aluno;

public class AlunoController {

    public static void main(String[] args){
        //instancias com contrutor padrão
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        //instancias com contrutor parametrizado com dois atributos
        Aluno aluno3 = new Aluno(3,"Adalberto");
        Aluno aluno4 = new Aluno(4,"Gestrude");

        //instancias com construtor com todos os atributos
        Aluno aluno5 = new Aluno(5,"000.111.222-44","Fulano","Fulado","fulano@dot.com");
        Aluno aluno6 = new Aluno(10,"123","Mariazinha","Foi na vovozinha","maria@dot.com");

        //Imprimindo com toString()
        System.out.println("------- demonstrando instancias com toString()-------");
        System.out.println("Aluno 1");
        System.out.println(aluno1.toString());
        System.out.println("\nAluno 2");
        System.out.println(aluno2.toString());
        System.out.println("\nAluno 3");
        System.out.println(aluno3.toString());
        System.out.println("\nAluno 4");
        System.out.println(aluno4.toString());
        System.out.println("\nAluno 5");
        System.out.println(aluno5.toString());
        System.out.println("\nAluno 6");
        System.out.println(aluno6.toString());

        System.out.println("\n-----------------------------------------");
        //final do exercicio 1.a
    }
}
