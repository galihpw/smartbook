package com.galihpw.smartbookandroid.Config;

/**
 * Created by GalihPW on 27/11/2017.
 */

public class Config {
    //URL to our login.php file
    //public static final String URL = "http://192.168.8.105/~classroom/";
    public static final String URL = "http://projectsmartbook.000webhostapp.com/jsonmobile/";

    //Keys for nip and password as defined in our $_POST['key'] in login.php
    public static final String KEY_NIS = "nis";
    public static final String KEY_PASSWORD = "password";

    //Catch JSON result
    public static final String JSON_ARRAY = "result";

    //If server response is equal to this that means login is successful
    public static final String LOGIN_SUCCESS = "success";

}