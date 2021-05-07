public interface SuperStudent {

    public void addDetails(String name, String address, char sex, int bornYear, String specialization, String status);

    public String generateID() throws IDInvalidException;

    public void addMark(int first, int second, int third, int fourth, int fifth);

    public void showDetails();

}
