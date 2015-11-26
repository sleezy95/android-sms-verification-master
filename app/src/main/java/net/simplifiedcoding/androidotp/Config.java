package net.simplifiedcoding.androidotp;

/**
 * Created by Belal on 11/18/2015.
 */
public class Config {
    //URLs to register.php and confirm.php file
    public static final String REGISTER_URL = "http://10.1.0.15/ts/register.php";
    public static final String CONFIRM_URL = "http://10.1.0.15/ts/confirm.php";

    //Keys to send username, password, phone and otp
    public static final String KEY_USERNAME = "surname";
    public static final String KEY_NAME = "name";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_PHONE = "cell_no";
    public static final String KEY_OTP = "otp";
    public static final String KEY_USEID = "user_id";
    //JSON Tag from response from server
    public static final String TAG_RESPONSE= "ErrorMessage";
}
