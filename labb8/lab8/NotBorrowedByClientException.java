package lab8;

public class NotBorrowedByClientException extends Exception{
    NotBorrowedByClientException(String message)
    {
        super(message);
    }
}