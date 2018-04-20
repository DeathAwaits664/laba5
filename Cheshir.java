import java.util.Random;
public class Cheshir {
    String name="Чеширский кот";
    public void smile(int d) {

        for (int e = 0; e<d;e++){System.out.println("Знаешь, откуда эти шрамы?");
        }
    }
    public String sid(int u) throws StupidException {
        String[] side={"ВЕТКЕ КАКОГО-ТО ДЕРЕВА", "ЗЕМЛЕ","ДИВАНЕ"};
        Random s=new Random();
        try {
            if (u > 3) {
                throw new StupidException();
            }
        }catch(Exception e) {
                e.printStackTrace();
                u=3;
            }
        int ay=s.nextInt(u);
    return side[ay];
        }
    }



