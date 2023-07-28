package kimjiseung97.class3.app.domain.Service;

import kimjiseung97.class3.app.domain.member.User;

public class Service {

    public int findWinner(User firstuser, User seconduser){


        int crongsmaxNumber = firstuser.findMaxNumber();
        int pobysmaxNumber = seconduser.findMaxNumber();

        if(crongsmaxNumber>pobysmaxNumber) {
            return 1;
        }else if(crongsmaxNumber<pobysmaxNumber){
            return 2;
        }else {
           return 0;
        }
    }
}
