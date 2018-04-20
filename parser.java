import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.io.File;

public class parser {
    public void parse(ArrayDeque<boys> x,String g){
        File j1=new File(g);
        j1.setExecutable(true);
        j1.setReadable(true);
        j1.setWritable(true);
           try(
    BufferedReader reader = new BufferedReader(
            new InputStreamReader(
                    new FileInputStream(j1))))

    {
        String line=reader.readLine();
  remover j=new remover();
  String kkk=j.removefrom(line);


String [] b=kkk.split(",");
        String[] vb=new String[b.length];
        int i1=0;
for (String l:b){
    vb[i1]=j.removefields(l,':');
i1++;
}
int z=2;
          while (vb.length>z) {
              x.addFirst(new boys(vb[z-1], Integer.parseInt(vb[z-2]), vb[z]));
            z=z+3;
          }




    } catch(IOException e)

    {
        System.out.println("Файл не найден(ЧТЕНИЕ)");
    }
}
   }
