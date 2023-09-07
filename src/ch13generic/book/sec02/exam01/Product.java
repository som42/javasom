package ch13generic.book.sec02.exam01;

public class Product<k,M> {

    private k kind;
    private M model;

    public k getKind(){ return  this.kind;}
    public M getModel(){ return this.model;}
    public void setKind(k kind){ this.kind = kind;}
    public void setModel(M model){this.model = model;}

}
