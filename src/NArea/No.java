/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NArea;

import static Util.Tamanho.n;

/**
 *
 * @author Arthur
 */
public class No {
    private int vInfo[]= new int[n-1];
    private No vLig[]= new No[n];
    private int tl;

    public No(int info) {
        vInfo[0]=info;
        tl=1;
    }

    public int getvInfo(int pos) {
        return vInfo[pos];
    }

    public void setvInfo(int pos,int info) {
        this.vInfo[pos] = info;
    }

    public No getvLig(int pos) {
        return vLig[pos];
    }

    public void setvLig(int pos,No lig) {
        this.vLig[pos] = lig;
    }

    public int getTl() {
        return tl;
    }

    public void setTl(int tl) {
        this.tl = tl;
    }
    
    public int buscaPos(int info)
    {
        int i=0;
        while(i<getTl() && vInfo[i]<info)
        {
            i++;
        }
        return i;
    }
    
    public void remanejar(int pos)
    {
        for(int i=getTl();i>pos;i--)
        {
            vInfo[i]=vInfo[i-1];
            vLig[i]=vLig[i-1];
        }
    }
    
}
