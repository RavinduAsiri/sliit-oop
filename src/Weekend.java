import java.util.Random;

//Weekend class implemented from SuperStudent interface and Override it's method for this Weekend class
public class Weekend implements SuperStudent{

    private String name;
    private String address;
    private char sex;
    private int bornYear;
    private String specialization;
    private String jobTitle;

    @Override
    public void addDetails(String name, String address, char sex, int bornYear, String specialization, String status) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.bornYear = bornYear;
        this.specialization = specialization;
        this.jobTitle = status;
    }

    @Override
    public String generateID()  {
        Random random = new Random();
        int idNum;
        int count = 0;

        while(true){
            idNum = random.nextInt();
            int temp = idNum;
            //find whether generated number is less than 0 or not
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
               // generateID();
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
        System.out.println("Student Job Title " + this.jobTitle);
    }
}
