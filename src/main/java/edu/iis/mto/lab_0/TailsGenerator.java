package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        ArrayList word = new ArrayList<>();
        if(value == null)
            return word;
        else {
            for(int i=value.length(); i>=0; i--)
                word.add(value.substring(0,i));
            return word;
        }
    }

}
