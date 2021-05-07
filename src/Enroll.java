import java.util.HashMap;
import java.util.Map;

public class Enroll {
    Map<String, String> map;
    public void enrollStudent(String studentId, String specialization){
        //assign HashMap Object to the map reference if only map reference equal to null
        if(map == null) {
            map = new HashMap<>();
        }

        // add values to the hashmap with Key Value pairing
        map.put(studentId, specialization);
    }

    public void displayEnrolledStudents(){
//        map.forEach((key, value) -> System.out.println(key + " : " + value));
        for (String name: map.keySet()) {
            String key = name.toString();
            String value = map.get(name).toString();
            System.out.println(key + " : " + value);
        }

    }
}
