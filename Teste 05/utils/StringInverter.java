package utils;

public class StringInverter {
    public String inverter(String string){
        String stringInvertida ="";
        for (int i = string.length() -1; i >= 0; i--){
            stringInvertida += string.charAt(i);
        } return stringInvertida;
    }
}
