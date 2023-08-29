package ch08extends.book.sec02;

//Phone 상속 받아주고
public class SmartPhone extends Phone{
    public boolean wifi; //필드 선언
    //생성자 선언
    public SmartPhone(String model, String color){
        this.model = model;
        this.color = color;
        //phone부터 상속받은 필드
    }
    //메소드 선언
    public void setWifi(boolean wifi){
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다");
    }
    public void internet(){
        System.out.println("인터넷을 연결합니다");
    }
}
