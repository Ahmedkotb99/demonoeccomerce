package org.example.utilities;

public class BrowserUtilities {

//    public static  void wait(int seconds)
//    {
//        try {
//            Thread.sleep(seconds*1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
    public  static  int convertStringToNumber(String txt)
    {
        String value=txt.replaceAll("[^0-9]","");
        return Integer.parseInt(value);
    }
}
