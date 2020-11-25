package com.louis.webservice.etc;

public class Study {

    public String[] splitString(String str, String reg){
        return str.split(reg);
    }

    public String removeBracket(String str){
        return str.substring(1,str.length()-1);
    }

    public char pickCharactor(String str, int idx){
        return str.charAt(idx);
    }

}
