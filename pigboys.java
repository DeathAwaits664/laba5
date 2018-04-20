public class pigboys extends pigdecorator {
    public pigboys (boys boys){super(boys);}
    public String trf(){
        return "ХРЮХРЮ";
    }
    @Override
    public String think(){
        String f=super.think()+" "+trf();
        return f;
    }



}
