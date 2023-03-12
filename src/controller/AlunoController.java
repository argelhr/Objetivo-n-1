package controller;


import model.Aluno;

import java.util.*;

public class AlunoController {

    public static void main(String[] args){
        //instancias com contrutor padrão
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        //instancias com contrutor parametrizado com dois atributos
        Aluno aluno3 = new Aluno(3,"Adalberto");
        Aluno aluno4 = new Aluno(4,"Gestrude");

        //instancias com construtor com todos os atributos
        Aluno aluno5 = new Aluno(
                5,
                "000.111.222-44",
                "Fulano",
                "Fulado",
                "fulano@dot.com");
        Aluno aluno6 = new Aluno(
                10,
                "123",
                "Mariazinha",
                "Foi na vovozinha",
                "maria@dot.com");

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
        //final do questao 1.a

        //atualizando as instancias 'aluno1' e 'aluno2' com setter
        //atualizando os ids das instancias
        aluno1.setId(1);
        aluno2.setId(2);

        //atualizando a instancia 'aluno1'
        aluno1.setCpf("12312312312");
        aluno1.setNome("Argel");
        aluno1.setSobrenome("Heberle");
        aluno1.setEmail("argel@dot.com");

        //atualizando a instancia 'aluno2'
        aluno2.setCpf("000.000.000-00");
        aluno2.setNome("Manu");
        aluno2.setSobrenome("Nörnberg");
        aluno2.setEmail("nerenbar@dot.com");

        //utilização do metodo getter para impressao dos paramentos
        System.out.println("------------- Aluno 1 atualizado ----------");
        System.out.println("ID: " + aluno1.getId());
        System.out.println(aluno1.getCpf());
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getSobrenome());
        System.out.println(aluno1.getEmail());

        //utilização dos metodo getter para impressao
        System.out.println("------------- Aluno 2 atualizado ----------");
        System.out.println("ID: " + aluno2.getId());
        System.out.println(aluno2.getCpf());
        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getSobrenome());
        System.out.println(aluno2.getEmail());

        //fim da questao 1b

        //Questao 2
        //criando coleção de tipo lista
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);//id: 1
        alunos.add(aluno2);//id: 2
        alunos.add(aluno3);//id: 3
        alunos.add(aluno4);//id: 4
        alunos.add(aluno5);//id: 5
        alunos.add(aluno6);//id: 10

        System.out.println("------ Imprimindo Lista da forma que as instancias foram adicionadas");
        System.out.println(alunos);

        System.out.println("\n\n ----- imprimindo aluno de id 5 de dentro da lista");
        System.out.println(alunos.stream().filter(aluno -> aluno.getId().equals(5)).findAny().orElse(null));

        System.out.println("--------------------------------------");
        //criando coleção do tipo MAP
        Map<Integer, Aluno> alunoMap = new HashMap<>();
        alunoMap.put(aluno1.getId(),aluno1);
        alunoMap.put(aluno2.getId(),aluno2);
        alunoMap.put(aluno3.getId(),aluno3);
        alunoMap.put(aluno4.getId(),aluno4);
        alunoMap.put(aluno5.getId(),aluno5);
        alunoMap.put(aluno6.getId(),aluno6);

        System.out.println("------- imprimindo coleção MAP ---------");
        System.out.println(alunoMap);

        System.out.println("impriminto aluno de ID 5 no map");
        System.out.println(alunoMap.get(5));

        System.out.println();
        System.out.println();
        System.out.println("\n ----- imprimindo com ordem inversa pelo ID ----- lista");
        alunos.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println(alunos);

        
    }
}
