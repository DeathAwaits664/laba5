public class pigdecorator implements male{
    boys s=new boys("asd",12,"asd");
    pig p=new pig("asd");
    public pigdecorator(boys s){this.s=s;this.p=p;}



    public void growtree (){ }
    public void growSon(){}
    public String think(){
        return "Я думаю";
    }
}
