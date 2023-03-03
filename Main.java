package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static ArrayList<Tarefa> Tarefas = new ArrayList<Tarefa>();

    public static void main(String[] args) {
        Tarefa aplicativoTarefas = new Tarefa();
        Scanner input = new Scanner(System.in);
        int funcao = 0;
        while (funcao != 4) {
            System.out.println("--- Menu de Funções ---" +
                    "\n1 - Adicionar tarefa" +
                    "\n2 - Remover tarefa" +
                    "\n3 - Listar tarefas" +
                    "\n4 - Sair");
            funcao = input.nextInt();
            switch (funcao) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    removerTarefa();
                    break;
                case 3:
                    listarTarefas();
                    break;
                case 4:
                default:
                    System.out.println("Você saiu do menu!");
            }
        }
    }

    static void listarTarefas() {
        for (Tarefa tar : Tarefas) {
            System.out.println(tar.getNome() + " - " + tar.getDescricao() +
                    "\n" + tar.getPrazo());
        }
    }

    static void removerTarefa() {
        Scanner entrada = new Scanner(System.in);
        String remover;
        System.out.println("Digite o nome da tarefa que deseja remover: ");
        remover = entrada.nextLine();
        Tarefas.removeIf(tar -> tar.getNome().equals(remover));
        System.out.println("Tarefa removida!");
    }


    private static void adicionarTarefa() {
        Scanner opcao = new Scanner(System.in);
        System.out.println("Digite o nome da tarefa: ");
        String tarefa = opcao.nextLine();

        boolean estaNaLista = false;
        for (Tarefa tar : Tarefas) {
            if (tar.getNome().equals(tarefa))
                estaNaLista = true;
        }
        if (estaNaLista) {
            System.out.println("Essa tarefa já está na lista!");
        } else {
            System.out.println("Adicione uma descrição: ");
            String descricao = opcao.nextLine();
            System.out.println("Digite um prazo para realizar a tarefa: ");
            String prazo = opcao.nextLine();
            System.out.println("Tarefa adicionada!");

            Tarefa ListadeTarefa = new Tarefa();

            ListadeTarefa.setNome(tarefa);
            ListadeTarefa.setDescricao(descricao);
            ListadeTarefa.setPrazo(prazo);

            Tarefas.add(ListadeTarefa);
        }
    }
}