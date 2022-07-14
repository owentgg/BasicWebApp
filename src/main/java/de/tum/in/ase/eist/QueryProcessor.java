package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import static java.lang.Integer.parseInt;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("name")) {
           return "sheesh";
        } else if(query.toLowerCase().contains("larger")){ // TODO extend the programm here
            String[] allNumbers = query.substring(query.indexOf("largest:")).split(",");
            int i = parseInt(allNumbers[0]);
            for(String s: allNumbers){
                if(parseInt(s) > i){
                    i = parseInt(s);
                }
            }
            return String.valueOf(i);
        }
        else if(query.toLowerCase().contains("plus")){
            String[] allNumbers = query.substring(query.indexOf("is")).split("plus");
            int i = parseInt(allNumbers[0]);
            for(String s: allNumbers){
                if(parseInt(s) > i){
                    i = parseInt(s) + i;
                }
            }
            return String.valueOf(i);
        }
        return "";
    }
}
