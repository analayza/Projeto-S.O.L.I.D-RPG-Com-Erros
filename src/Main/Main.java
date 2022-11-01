package Main;


import Classes.Bruxo;
import Classes.Guerreiro;
import Classes.Mago;
import Classes.Paladino;
import Raca.Elfo;
import Raca.Humano;
import Raca.MortoVivo;
import Raca.Orc;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {

        /*Elfo elfo1 = new Elfo("Layza", "Hetero", new Bruxo());
        System.out.println(elfo1);
        elfo1.poder1();
        elfo1.poder2();
        System.out.println("------------------------------------");


        Humano humano1 = new Humano("Bruno", "Hetero", new Guerreiro());
        System.out.println(humano1);
        humano1.poder1();
        humano1.poder2();
        System.out.println("------------------------------------");


        MortoVivo mortoVivo1 = new MortoVivo("Joao", "Gay", new Mago());
        System.out.println(mortoVivo1);
        mortoVivo1.poder1();
        mortoVivo1.poder2();
        System.out.println("------------------------------------");


        Orc orc1 = new Orc("Venicio", "Gay", new Paladino());
        System.out.println(orc1);
        orc1.poder1();
        orc1.poder2();
        System.out.println("------------------------------------");*/

        Object[] exercito = {};
        ArrayList<Object> novoExercito = new ArrayList<Object>(new ArrayList(asList(exercito)));



        System.out.println("SEJA BEM VINDO AO WARCRAFT ");
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("----------------------------------");
            System.out.println(
                    "1-Cadastrar \n2-Mostrar Exercito \n3-Sair ");
            System.out.println("----------------------------------");



            while(opcao!=1 && opcao!=2 && opcao!=3){
                Scanner teclado2 = new Scanner(System.in);
                System.out.print("Escolha uma opcao valida ->");
                try{
                    opcao = teclado2.nextInt();
                    if(opcao!=1 && opcao!=2 && opcao!=3){
                        System.out.println("Opcao invalida");
                        continue;
                    }
                }catch (InputMismatchException e){
                    System.out.println("O tipo de varivel esta incorreta, digite um inteiro.");
                }
            }



            if (opcao == 1) {
                while (true){
                System.out.println("Escolha uma Raca: Elfo Paladino, Humano Guerreiro, Morto vivo Bruxo ou Orc Mago ");
                Scanner escolha = new Scanner(System.in);
                String escolhaDeRaca = escolha.nextLine();


                if (escolhaDeRaca.equalsIgnoreCase("Elfo")) {
                    Elfo elfo2 = new Elfo(" ", " ", new Paladino());
                    System.out.println("Sua escolha foi Elfo Paladino ");

                    System.out.print("Digite o nome do seu personagem: ");
                    elfo2.setNome(escolha.nextLine());


                    System.out.print("Digite a orientacao sexual do seu personagem: ");
                    elfo2.setOrientacaoSexual(escolha.nextLine());

                    //System.out.println(elfo2.toString());

                    novoExercito.add(elfo2);
                    opcao=0;
                    System.out.println("Cadastro concluido");
                    break;

                } else if (escolhaDeRaca.equalsIgnoreCase("Humano")) {
                    Humano humano2 = new Humano(" ", " ", new Guerreiro());
                    System.out.println("Sua escolha foi Humano Guerreiro ");

                    System.out.print("Digite o nome do seu personagem: ");
                    humano2.setNome(escolha.nextLine());


                    System.out.print("Digite a orientacao sexual do seu personagem: ");
                    humano2.setOrientacaoSexual(escolha.nextLine());

                    //System.out.println(humano2.toString());

                    novoExercito.add(humano2);
                    opcao=0;
                    System.out.println("Cadastro concluido");
                    break;

                } else if (escolhaDeRaca.equalsIgnoreCase("Morto Vivo")) {
                    MortoVivo mortoVivo2 = new MortoVivo(" ", " ", new Bruxo());
                    System.out.println("Sua escolha foi Morto Vivo Bruxo ");

                    System.out.print("Digite o nome do seu personagem: ");
                    mortoVivo2.setNome(escolha.nextLine());


                    System.out.print("Digite a orientacao sexual do seu personagem: ");
                    mortoVivo2.setOrientacaoSexual(escolha.nextLine());

                    //System.out.println(mortoVivo2.toString());

                    novoExercito.add(mortoVivo2);
                    opcao=0;
                    System.out.println("Cadastro concluido");
                    break;

                } else if (escolhaDeRaca.equalsIgnoreCase("Orc")) {
                    Orc orc2 = new Orc(" ", " ", new Mago());
                    System.out.println("Sua escolha foi Orc Mago ");

                    System.out.print("Digite o nome do seu personagem: ");
                    orc2.setNome(escolha.nextLine());


                    System.out.print("Digite a orientacao sexual do seu personagem: ");
                    orc2.setOrientacaoSexual(escolha.nextLine());

                    //System.out.println(orc2.toString());

                    novoExercito.add(orc2);
                    opcao=0;
                    System.out.println("Cadastro concluido");
                    break;

                }else{
                    System.out.println("Essa classe nao existe, escolha uma classe valida!");
                }
                }


            } else if (opcao == 2) {

                if(novoExercito.size()==0){
                    System.out.println("Voce ainda nao possui um exercito, digite 1 para cadastrar seus membros");
                    opcao=0;
                }
                else{
                    System.out.println("----------------------------------");
                    for(Object percorrerLista : novoExercito){
                        System.out.println(percorrerLista);
                        System.out.println();

                }
                    opcao=0;
                }
                System.out.println("----------------------------------");

            }
        }
        System.out.println("Obrigada");
    }
}
