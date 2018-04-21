import com.google.gson.*;
import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Date;
public class CollMan {
    String fi="";

    ArrayDeque x = new <boys>ArrayDeque();
    Date dat = new Date();
    /**
     *Устанавливает коллекцию, которой управляет менеджер коллекций
     *@param
     */
    public void setColl(ArrayDeque E) {
        x = E;
    }
    /**Возвращает коллекцию, которой управляет менеджер коллекций
     *@return ArrayDeque
     */
    public Deque getColl() {
        return x;
    }

    /**Выводит базовую информацию о коллекции*/
    public void info() {
        System.out.println(x.getClass());
        System.out.println(x.size());
        System.out.println(dat);
    }
    /**Удаляет из коллекции элементы, хэшкоды которых больше хэшкода полученного на ввод элемента*/
    public void remove_greater(boys j) {
        x.removeIf(c -> c.hashCode() > j.hashCode());
        System.out.println(x);
    }
    /**Удаляет из коллекции элементы, хэшкоды которых равны хэшкоду полученного на ввод элемента*/
    public void remove_all(boys j) {
        x.removeIf(c -> c.hashCode() == j.hashCode());
        System.out.println(x);
    }


/**Импортит коллекцию из файла, путь которого указан как аргумент*/
    public void im_port(String f) {
        parser m = new parser();
        m.parse(x, f);
        System.out.println(x);}



    /**ЗАПИСЬ*/
    public void ex_port() {
        String jsonstr = new Gson().toJson(x);
        File ll=new File(fi);
        ll.setWritable(true);
        ll.setReadable(true);
        ll.setExecutable(true);
        try (FileOutputStream out = new FileOutputStream(ll);
             BufferedOutputStream bos = new BufferedOutputStream(out)) {
            byte[] buffer = jsonstr.getBytes();
            bos.write(buffer);
        } catch (IOException ex) {

            System.out.println("Файл не найден(ЗАПИСЬ))");
        }
    }


    /**  АНАЛИЗ И ВЫПОЛЕНИЕ КОМАНДЫ*/
    public void Analyze(String com)  {
        String[] z = com.split(" ");
        try{
        if (!(z[0].equals("remove_greater") || z[0].equals("remove_all") || z[0].equals("info")||z[0].equals("import")||z[0].equals("a"))) {
            throw new CommandException();
        }}catch (CommandException ex){System.out.println("NO SUCH COMMAND1");}

        if (z[0].equals("import")) {

            remover kl = new remover();
            String h=kl.removefrom(z[1]);
            this.fi=h;
            im_port(h);

        }
        if (z[0].equals("info")) {
            info();

        }
        if (z[0].equals("remove_greater")) {
            remover jh = new remover();
            String[] z0=z[1].split(",");
            String[] z1 = new String [z0.length];

            for(int l=0;l<z0.length;l++){z1[l]=jh.removefrom(z0[l]);}

            String[] z2=new String[z1.length];
            for(int j=0;j<z1.length;j++){z2[j]=jh.removefields(z1[j],':');}
            remove_greater(new boys(z2[1], Integer.parseInt(z2[0]), z2[2]));
            }
        if (z[0].equals("remove_all")) {
            remover ty = new remover();
            String vb[] = new String[z[1].length()];
            String jh = ty.removefrom(com);
            String[] z2 = jh.split(",");

            for (int o = 0; o < z2.length; o++) {
                vb[o] = ty.removefields(z2[o], ':');
                }

            remove_all(new boys(vb[1], Integer.parseInt(vb[0]), vb[2]));

        }
    }


    }
