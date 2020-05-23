/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po;

import NArea.NArea;

/**
 *
 * @author Arthur
 */
public class PO {

    public final int n=3;
    public static void main(String[] args) {
        NArea a = new NArea();
        a.insere(10);
        a.insere(9);
        a.insere(7);
        a.insere(11);
        a.insere(15);
        a.insere(30);
        a.insere(29);
        a.insere(5);
        a.insere(6);
        a.inOrdem(a.getRaiz());
    }
    
}
