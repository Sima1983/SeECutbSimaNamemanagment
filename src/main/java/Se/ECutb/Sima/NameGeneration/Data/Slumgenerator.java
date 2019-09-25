package Se.ECutb.Sima.NameGeneration.Data;

import java.util.Random;

public class Slumgenerator {
    static Random random = new Random();

    public  int getNumber(int n){
        int number =random.nextInt(n);
        return number;
    }
}
