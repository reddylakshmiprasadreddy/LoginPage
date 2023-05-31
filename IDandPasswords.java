package LoginPage;
import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("Hari","Reddy");
        logininfo.put("Vishnu","PASSWORD");
        logininfo.put("Sreekar","matcha123");
    }

    public HashMap getLoginInfo(){
        return logininfo;
    }
}

