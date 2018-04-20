
public class boys extends child implements male,Comparable<boys> {
    int age;
    String name;
    String hair;
    boys(String name1,int age1,String hair1){
        age=age1;
        name=name1;
        hair=hair1;
    }
    public void growtree() {System.out.println("Ращу");}
    public void growSon() { System.out.println("Ращу");}
    public void trem(){System.out.println("Вздрогнул");}
    public void stop(){System.out.print("Остановился");}
    @Override
    public boolean equals(Object obj) {

        if (obj==null||obj.getClass()!=this.getClass()||obj.hashCode()!=this.hashCode()) {return false;}

        boys guest = (boys)obj;
        return  age==guest.age&& (name == guest.name ||
                (name != null && name.equals(guest.name)))
                && (hair == guest.hair || (hair != null && hair.equals(guest.hair)));
       }


    @Override
    public int hashCode() throws StupidUnException {
        try {if (age==0)throw new StupidUnException();}catch(Exception e) {
        e.printStackTrace();}
        int kk = name.hashCode() /  hair.hashCode()*age;
        return kk;
    }
    @Override
    public String toString() {
        String s="Мальчик "+name+" "+age+" лет "+hair+" волосы";
        return s;
    }

    @Override
    public int compareTo(boys o) {
        if (o.age>this.age){return -1;}
        if (this.age>o.age){return 1;}
        return 0;
    }
}

