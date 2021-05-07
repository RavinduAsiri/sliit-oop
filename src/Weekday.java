import java.util.Random;

//Weekday class implemented from SuperStudent interface and Override it's method for this Weekday class
public class Weekday implements SuperStudent{
    private String name;
    private String address;
    private char sex;
    private int bornYear;
    private String specialization;
    private String freeDay;


    @Override
    public void addDetails(String name, String address, char sex, int bornYear, String specialization, String status) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.bornYear = bornYear;
        this.specialization = specialization;
        this.freeDay = status;
    }

    @Override
    public String generateID()  {
        Random random = new Random();
        int idNum;
        int count = 0;

        while(true){
            idNum = random.nextInt();
            int temp = idNum;
            if(idNum > 0){
                while (temp != 0) {
                    temp /= 10;
                    ++count;
                }
                if(count > 2){
                    return "IT" + idNum;
                }else {
                    //throw exception
                    try {
                        throw new IDInvalidException("IDInvalidException");

                    } catch (IDInvalidException e) {
                        e.printStackTrace();
                    }
                }
            }else {
                /*if idNum is a negative number, then this else part run
                and after i tell run again this generateID() method*/
                generateID();
            }
        }
    }

    @Override
    public void addMark(int first, int second, int third, int fourth, int fifth) {

    }

    @Override
    public void showDetails() {
        System.out.println("Student Name " + this.name);
        System.out.println("Student Address " + this.address);
        System.out.println("Gender " + this.sex);
        System.out.println("Student Year " + this.bornYear);
        System.out.println("Student Specialization " + this.specialization);
        System.out.println("Student Freeday " + this.freeDay);
    }
}
