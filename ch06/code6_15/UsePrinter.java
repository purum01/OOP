package bookcode.ch06.code6_15;


/*
 * 코드 6-15 
 * static setter 메서드 사용해 대역 클래스 생성
 */

public class UsePrinter {
    public void doSomething(){
        String str;
        str = "this is a test";
        PrinterFactory.getPrinterFactory().getPrinter().print(str);
    }
}

class PrinterFactory{
    private static PrinterFactory printerFactory = null;
    protected PrinterFactory(){ };

    public synchronized static PrinterFactory getPrinterFactory(){
        if(printerFactory == null){
            printerFactory = new PrinterFactory();
        }
        return printerFactory;
    }

    public static void setPrinterFactory(PrinterFactory p){ // 정적 setter 메서드
        printerFactory = p;
    }

    public Printer getPrinter(){
        return new RealPrinter315();
    }
}

class FakePrinterFactory extends PrinterFactory{
    public Printer getPrinter(){
        return new FakePrinter();
    }
}



/*
 * 이전 코드들
 */
interface Printer{
    public void print(String str);
}

class RealPrinter315 implements Printer{  //싱글턴 패턴을 사용
    private static Printer printer = null;
    RealPrinter315(){}

    public synchronized static Printer getPrinter(){
        if(printer == null){
            printer = new RealPrinter315();
        }
        return printer;
    }
    public void print(String str){
        // 실제 프린터 하드웨어를 조작하는 코드드
    }
}

class FakePrinter implements Printer{ //테스트용 가짜 프린터
    private String str;

    public void print(String str) {
        this.str = str;
        System.out.println("FakePrinter : "+str);
    }

    public String get(){
        return str;
    }
}