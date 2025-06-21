package praticaExame.AVL1;

public class arvoreAVLint {


    private class NO {
        int dado;
        NO esq, dir;
        int hEsq, hDir;
    }

    public NO root = null;

    public NO inserirAVL(NO p, int info) {
        if (p == null) {
            p = new NO();
            p.dado = info;
            p.esq = null;
            p.dir = null;
            p.hDir = 0;
            p.hEsq = 0;
        } else if (info < p.dado) {
            p.esq = inserirAVL(p.esq, info);
            if (p.dir.hDir > p.esq.hEsq) {
                p.hDir = p.esq.hDir + 1;
            } else {
                p.hEsq = p.esq.hEsq + 1;
            }
            p = balanceamento(p);
        }
        if (info > p.dado) {
            p.dir = inserirAVL(p.dir, info);
            if (p.dir.hDir > p.esq.hEsq) {
                p.hDir = p.dir.hDir + 1;
            } else {
                p.hDir = p.dir.hDir + 1;
            }
            p = balanceamento(p);
        }
        return p;
    }

    public NO balanceamento(NO p) {

        int fbPai = p.hDir - p.hEsq;
        if (fbPai > 1) {
            int fbFilhoDir = p.hDir - p.hEsq;
            if (fbFilhoDir >= 0) {
                p = rotacaoEsquerda(p);
            } else {
                p.dir = rotacaoDireita(p.dir);
                p = rotacaoEsquerda(p);
            }
        }
        if (fbPai < -1) {
            int fbFilhoEsq = p.hDir - p.hEsq;
            if (fbFilhoEsq < -1) {
                p = rotacaoDireita(p);
            } else {
                p.esq = rotacaoEsquerda(p.esq);
                p = rotacaoDireita(p);
            }
        }
        return p;
    }

    public NO rotacaoDireita(NO p) {
        NO q, temp;
        q = p.esq;
        temp = q.dir;
        q.dir = p;
        p.esq = temp;
        return q;
    }

    public NO rotacaoEsquerda(NO p) {
        NO q, temp;
        q = p.dir;
        temp = q.esq;
        q.esq = p;
        p.dir = temp;
        return q;
    }

    public NO removeAVL(NO p, int info) {
        if (p != null) {
            if (info == p.dado) {
                if (p.dir == null && p.esq == null) {
                    return null;
                } else {
                    if (p.esq == null) {
                        return p.dir;
                    } else if (p.dir == null) {
                        return p.esq;
                    } else {
                        NO aux, ref;
                        ref = p.dir;
                        aux = p.dir;
                        while (aux.esq != null){
                            aux = aux.esq;
                        }
                        aux.esq = p.esq;
                        return ref;
                    }
                }
            }else{
                if (info < p.dado){
                    p.esq = removeAVL(p.esq, info);
                }else{
                    p.dir = removeAVL(p.dir,info);
                }
            }
        }
        return p;
    }

    public NO atualizaAlturaBalanceamento(NO p) {
        if (p != null)
            p.esq = atualizaAlturaBalanceamento(p.esq);
        if (p.esq == null)
            p.hEsq = 0;
        else if (p.esq.hEsq > p.esq.hDir)
            p.hEsq = p.esq.hEsq + 1;
        else
            p.hEsq = p.esq.hDir + 1;

        p.dir = atualizaAlturaBalanceamento(p.dir);
        if (p.dir == null)
            p.hDir = 0;
        else if (p.dir.hDir > p.dir.hEsq)
            p.hDir = p.dir.hDir + 1;
        else
            p.hDir = p.dir.hEsq;

        p = balanceamento(p);

    return p;
    }

    public void mostrarEmOrdem(NO p) {
        if (p != null) {
            mostrarEmOrdem(p.esq);
            System.out.println(p.dado+"\t");
            mostrarEmOrdem(p.dir);
        }
    }

    public void mostraFB(NO p){
        if(p != null){
            int fb = p.hDir - p.hEsq;
            mostraFB(p.esq);
            mostraFB(p.dir);
            System.out.println("Dado: " + p.dado + "\t FB= " + (p.hDir - p.hEsq));
        }else{
            System.out.println("ÁRVORE VAZIA...");
        }
    }

}
