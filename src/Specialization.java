import java.util.HashMap;
import java.util.Map;

public class Specialization {
    //creating Map object reference for Key Value Pairing
    Map<String, Double> map;
    public void addSpecialization(String specialization, double GPA) {
        map =  new HashMap<String, Double>();

        map.put(specialization, GPA);
    }
}
