package com.study.ch15;

public class SendMain {
    public static void main(String[] args) {
        SendData<String> sendData1 = new SendData<>(200, "조성민");//서로다른 타입의 객체를 받기위해 Object를 사용
        //send(sendData1);                               //그럴경우 클래스의 메서드를 사용하기 위해서는 다운캐스팅을 매번해야한다.
                                                        //그래서 제너릭을 사용
        SendData<Member> sendData2 = new SendData<>(200, new Member("조성민", "01034053728")); //Member 객체의 toString이 와야한다.
        send(sendData2); //양 클래스명 중 한 곳에는 변수타입을 넣어야 한다. 만약 양쪽다 제거하면 Object형이 된다.
        SendData<VipMember> sendData3 = new SendData<>(200,new VipMember("민성조","01011111111"));
        SendData<VipMember> sendData4 = new SendData<>(200,new Mem("민성","01011111111"));
        send(sendData3);
        send(sendData4);
    }
    public static void send(SendData<? super VipMember> sendData) {
        sendData.send();    //SendData<? extends Member> sendData: Member나 Member를 상속받은 객체만 가능 와일드카드의 상속제한
    }                       //SendData<? super VipMember> sendData : VipMember나 VipMember에 상속한 객체, VipMember를 상속 받은 객체만 가능 와일드카드의 상속제한
}
