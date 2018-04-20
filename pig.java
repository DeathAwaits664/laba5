public class pig {
    String name;
    pig(String s){name=s;}
public boolean opr (String s) {
    boolean res = false;
    diff.animals a;
    a=diff.animals.valueOf(s);
    switch (a) {
        case ТИГР:
            res = false;
            break;
        case ЛЕВ:
            res = false;
            break;
        case ПОРОСЕНОК:
            res = true;
            break;
    }
    return res;
}
    public void think(){System.out.print("Хрю-хрю");}
    public void zatru(String g){
        System.out.println(name+" "+"Преспокойно затрусил куда то в "+g);
    }
}
