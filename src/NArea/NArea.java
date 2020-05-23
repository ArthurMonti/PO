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
public class NArea {
    private No raiz;

    public NArea() {
    }

    public No getRaiz() {
        return raiz;
    }
    
    public void insere(int info)
    {
        No aux,ant = null;
        int pos=0;
        boolean inseriu= false;
        if(raiz==null)
            raiz = new No(info);
        else
        {
            aux=raiz;
            while(aux!=null && !inseriu)
            {
                pos = aux.buscaPos(info); 
                if(aux.getTl()<n-1)
                {
                    aux.remanejar(pos);
                    aux.setvInfo(pos, info);
                    aux.setTl(aux.getTl()+1);
                    inseriu=true;
                }
                else
                {
                    ant=aux;
                    aux=aux.getvLig(pos);
                }
                
            }
            if(!inseriu)
                ant.setvLig(pos, new No(info));
        }
    }
    public void inOrdem(No raiz)
    {
        int i=0;
        while(i<raiz.getTl())
        {
            if(raiz.getvLig(i)!=null)
            inOrdem(raiz.getvLig(i));
            System.out.println(raiz.getvInfo(i));
            i++;
        }
        if(raiz.getvLig(i)!=null)
           inOrdem(raiz.getvLig(i));
    }
}
