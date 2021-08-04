package demo05;

public class Computer {
    public void on(){
        System.out.println("打开电脑");
    }
    public void off(){
        System.out.println("关闭电脑");
    }
    public void device(USB usb) {
        usb.open();
        if(usb instanceof mouse){
            mouse s=(mouse )usb;
            s.click();
        }else if(usb instanceof KeyBoard){
            KeyBoard k=(KeyBoard) usb;
            k.input();
        }
        usb.close();
    }
}
