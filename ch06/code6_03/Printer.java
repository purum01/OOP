package bookcode.ch06.code6_03;
public class Printer{
    private static Printer printer = null;
    private Printer(){  }

    public static Printer getPrinter(){
        if(printer == null)
            printer = new Printer();

        return printer;        
    }

    public void print(String resource){
        //do something
    }
}