/**
 * Created by host on 14.2.2018.
 */
public class InvalidIdNumberException extends Exception{

    private String rc;

    public InvalidIdNumberException(String rc) {
        this.rc = rc;
    }

    @Override
    public String getMessage() {
        if(rc.charAt(6)=='/' && rc.length()!=11 )
            return "Invalid length with /";
        if(!rc.contains("/") && rc.length()!=10 ) 
            return "Invalid length without /";
        if(rc.contains("/") && rc.charAt(6)!='/' )
            return "Incorrect position of '/' ";
        if("0156".contains(String.valueOf(rc.charAt(2)))==false)
            return "Incorrect 3-rd number in id: "+rc;
        return "Invalid personal number!";
    }
}
