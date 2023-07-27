package kimjiseung97.class3.app.domain.Service;

import kimjiseung97.class3.app.domain.member.User;
import org.w3c.dom.ls.LSOutput;

public class Service {

    public String findWinner(){
        User firstuser = new User("크롱");
        User seconduser = new User("포비");

        int crongsmaxNumber = firstuser.findMaxNumber();
        int pobysmaxNumber = seconduser.findMaxNumber();

        if(crongsmaxNumber>pobysmaxNumber) {
            return firstuser.getName() + "승" + "1";
        }else if(crongsmaxNumber<pobysmaxNumber){
            return seconduser.getName() + "승" + "-1";
        }else{
            return "무승부" + "0";
        }
    }
}
