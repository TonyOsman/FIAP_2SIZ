package br.com.fiap.codigoAltaPerformance.pilhaSenquencial;

public class pilhaSequencial {

    public final int N = 10;
    int dados[] = new int[N];
    int topo;

    //init
    public void init(){
        topo=0;
    }

    //isEmpty
    public boolean isEmpty(){
        return(topo==0);
    }

    //isFull
    public boolean isFull(){
        return(topo==N);
    }

    //push
    public void push(int elem){
        if(isFull()){
            System.out.println("STACK OVERFLOW...");
        } else {
            dados[topo]=elem;
            topo++;
        }
    }

    //pop
    public int pop(){
            topo--;
            return dados[topo];
    }
    //top
    public int top(){
        return dados[topo];
    }



}
