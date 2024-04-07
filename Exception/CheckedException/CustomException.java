package Exception.CheckedException;

/**
 * CustomException
 */
public class CustomException extends Exception {


public String getMessage(){
    return "This is custom exception";
}

public String toString(){
    return "ooh exception occured";
}


    // public CustomException(String message){
    //     super(message);
    // }

    
}