package bookcode.ch06.code6_13;

/*
 * 코드 6-13
 */

public class UsePrinter {
    public void doSomething(){
        String str;
        // 코드 생략
        str = "this is a test";
        RealPrinter315.print(str);
    }    
}

class RealPrinter315{
    public synchronized static void print(String str){
        // 실제 프린터 하드웨어를 조작하는 코드
    }
}
