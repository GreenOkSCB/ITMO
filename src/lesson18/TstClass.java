package lesson18;


import lesson18.annotation.UserAnnotation;

public class TstClass {

    private final int intData;

    @UserAnnotation(author = "not me")
    private String strData;

    public  String tstAtr = "tstAtr";

    public TstClass(int intData, String strData) {
        this.intData = intData;
        this.strData = strData;
    }

    public int getIntData() {
        return intData;
    }

    public String getStrData() {
        return strData;
    }

    public void setStrData(String strData) {
        this.strData = strData;
    }

    private void callPrivate(){
        System.out.println("Private method called");
    }

    @Override
    public String toString() {
        return "TstClass{" +
                "intData=" + intData +
                ", strData='" + strData + '\'' +
                '}';
    }
}
