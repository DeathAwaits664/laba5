import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class start {
    public static void main(String[] args) {


        ArrayDeque boysArrayDeque = new ArrayDeque<boys>();
        CollMan z = new CollMan();
        z.setColl(boysArrayDeque);
        class ShutdownHook extends Thread {

            public void run() {
                if (z.fi != "") {
                    z.ex_port();
                    System.out.println("Завершение программы");
                } else {
                    System.out.println("Завершение программы");
                }
            }
        }
        ShutdownHook shutdownHook = new ShutdownHook();
        Runtime.getRuntime().addShutdownHook(shutdownHook);

        Alice a = new Alice();
        Scanner in = new Scanner(System.in);


        System.out.println("Перейти в режим управления коллекцией?");
        String l = in.nextLine();
        if (l.equals("Да") || l.equals("Yes") || l.equals("да")) {
            System.out.println("Режим управления коллекцией активирован");
            System.out.println("Доступные команды");

            System.out.println("import {String path}: добавить в коллекцию все данные из файла\n" +
                    "remove_greater {element}: удалить из коллекции все элементы, превышающие заданный\n" +
                    "remove_all {element}: удалить из коллекции все элементы, эквивалентные заданному\n" +
                    "info: вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)");
            boolean ter = true;

            try{

            while (ter) {
                String ini = in.nextLine();

                    if (ini.equals("terminate")) {
                        System.exit(0);
                    }
                    z.Analyze(ini);


            }}catch(NoSuchElementException h){System.exit(0);}


        } else {

            System.out.println("ВВЕДИТЕ ВИД ЖИВОТНОГО, С КОТОРЫМ ХОТИТЕ ВЗАИМОДЕЙСТВОВАТЬ");
            String q = in.nextLine();
            try {
                //System.out.println("ВВЕДИТЕ ИМЯ ЖИВОТНОГО");
                //String o = in.nextLine();
                pig t = new pig("Малыш");
                Boolean n = t.opr(q);


                a.free(t);


                if (n) {
                    a.think("Ну что ж,ничего,");
                    a.think("ведь из него мог бы выйти очень противный мальчишка, а так получился симпатичный " + q);

                    String c = "других знакомых детей, из которых могли бы выйти развеликолепные" + " " + q;
                    a.remember(a.name, c);
                    System.out.println("Вот бы только узнать такое средство, чтобы превратить их. Узнать?   Да/Нет");
                    String h = in.nextLine();
                    Boolean x;
                    if (h.equals("Да")) {
                        x = true;
                    } else {
                        x = false;
                    }
                    boys u = new boys("ИЛЬЯ", 12, "СВЕТЛЫЕ");
                    if (x) {
                        boys yu = new boys("ИЛЬЯ", 12, "СВЕТЛЫЕ");
                        System.out.println("Сейчас мальчики говорят");
                        yu.think("Я думаю");
                        System.out.println("А сейчас");
                        pigboys i = new pigboys(new boys("КИРИЛЛ", 15, "ТЕМНЫЕ"));
                        System.out.println(i.think());
                        System.out.println(" ");
                    }

                    a.trem();
                    a.stop();


                } else {
                    boys x = new boys("ИЛЬЯ", 12, "СВЕТЛЫЕ");
                    boys y = new boys("ИЛЬЯ", 13, "СВЕТЛЫЕ");
                    System.out.println(y.equals(x));
                    System.out.println(x.toString());
                    System.exit(0);
                }


            } catch (Exception IllegalArgumentException) {
                System.out.println("НЕТ ТАКОГО ЖИВОТНОГО");
                System.exit(0);
            }
            Cheshir iu = new Cheshir();
            System.out.println("Введите число от 1 до 3");
            int po = in.nextInt();
            try {
                System.out.println("В нескольких шагах от нее на " + iu.sid(po) + " сидел " + iu.name);
            } catch (Exception StupidException) {
                System.out.println("Ты что, дуралей?");
            }

        }


    }

}
