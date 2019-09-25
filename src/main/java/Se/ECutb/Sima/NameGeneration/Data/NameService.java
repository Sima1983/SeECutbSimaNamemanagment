package Se.ECutb.Sima.NameGeneration.Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class NameService {
    private static List<String> male = new ArrayList<>();
    private static List<String> female = new ArrayList<>();
    private static List<String> lastName = new ArrayList<>();
    Slumgenerator generator = new Slumgenerator();

    public List<String> MaleName(){
        List<String> names = new ArrayList<>();
        try(BufferedReader reader = Files.newBufferedReader(Paths.get("PojkName.txt"))){
            String line;
            while ((line = reader.readLine())!=null){
                names.add(line);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }return names;
    }//3sticken
    public String slumpFlickName(){
        String name = female.get(generator.getNumber( 1000));
        return name;
    }
      public String slumpPoikName


}
