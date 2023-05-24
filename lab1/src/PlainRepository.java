import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlainRepository {
    private ArrayList<Plain> Plains;

    public PlainRepository(){
        Plains = new ArrayList<>();
    }

    public PlainRepository(Plain plain){
        Plains = new ArrayList<>(Arrays.asList(plain));
    }

    public PlainRepository(ArrayList<Plain> plains){
        Plains = plains;
    }

    public void Add(Plain plain){
        Plains.add(plain);
    }

    public void Remove(int index){
        Plains.remove(index);
    }

    public Plain Get(int index){
        return Plains.get(index);
    }

    public void Update(int index, Plain newPlain){
        Plains.set(index, newPlain);
    }

    public List<Plain> GetPlainsWhereCountPassengerLess(int count){
        return Plains.stream().filter(plain -> plain.CountPassenger < count).toList();
    }

    public List<Plain> GetPlainWhereNameStartFromLetter(char letter){
        return GetPlainWhereNameStartFromLetter(String.valueOf(letter));
    }

    public List<Plain> GetPlainWhereNameStartFromLetter(String letter){
        return Plains.stream().filter(plain -> plain.Name.startsWith(letter)).toList();
    }

    public int GetLen(){
        return Plains.size();
    }
}
