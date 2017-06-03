package org.coach.tdd.template;
import java.lang.String;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public String sometoString(int num) {
        String result = "";
        result = gemThree(num) + gemFive(num);
//        if(num % 15 == 0){result = "BizzPizz";}
//        else if(num % 5 == 0){result = "Pizz";}
//        else if(num % 3 == 0){result = "Bizz";}
        return result;
    }

    private String gemThree(int num) {
        return num % 3 == 0 ? "Bizz" : "";
    }

    private String gemFive(int num) {
        return num % 5 == 0 ? "Pizz" : "";
    }
}
