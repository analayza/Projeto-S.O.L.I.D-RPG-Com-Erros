package Raca;

import ClasseInterface.IClasse;
import Informacoes.Personagem;
import Interfaces.IFurtividade;

public class Elfo extends Personagem implements IFurtividade, IClasse {

    private final IClasse classe;

    public Elfo(String n, String s, IClasse poder) {
        this.classe = poder;
        this.setNome(n);
        this.setOrientacaoSexual(s);
    }



    @Override
    public void furtividade() {
        System.out.println("Furtividade");
    }

    @Override
    public void poder1() {
        this.classe.poder1();
    }

    @Override
    public void poder2() {
        this.classe.poder2();
    }
    @Override
    public String toString() {
        return  "Elfo: " + getNome() +
                "\n"+ this.classe.getClass() +
                "\nSexo: " + getOrientacaoSexual();
    }
}

