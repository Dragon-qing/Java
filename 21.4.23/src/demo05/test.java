package demo05;

public class test {
    public static void main(String[] args) {
        Computer com=new Computer();
        com.on();
        USB usb=new mouse();
        com.device(usb);
        KeyBoard k=new KeyBoard();
        com.device(k);
        com.off();
    }
}
