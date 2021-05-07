//to throw new IDInvalidException Exception, that needs create class like below
//it inherit from the Exception class
public class IDInvalidException extends Exception{
    public IDInvalidException(String message) {
        super(message);
    }
}
