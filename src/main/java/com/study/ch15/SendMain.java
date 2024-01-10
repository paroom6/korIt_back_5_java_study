package com.study.ch15;

public class SendMain {
    public static void main(String[] args) {
        SendData<String> sendData1 = new SendData<>(200, "조성민");//서로다른 타입의 객체를 받기위해 Object를 사용
        send(sendData1);                               //그럴경우 클래스의 메서드를 사용하기 위해서는 다운캐스팅을 매번해야한다.
                                                        //그래서 제너릭을 사용
        SendData<Member> sendData2 = new SendData<>(200, new Member("조성민", "01034053728")); //Member 객체의 toString이 와야한다.
        send(sendData2); //양 클래스명 중 한 곳에는 변수타입을 넣어야 한다. 만약 양쪽다 제거하면 Object형이 된다.
        SendData<VipMember> sendData3 = new SendData<>(200,new VipMember("민성조","01011111111"));
        send(sendData3);
    }

    public static void send(SendData<?> sendData) { // 서로다른 타입의 제네릭을 한 메서드로 호출하기 위해 <> 자리에 ?을 사용한다 이때 ?는 와일드카드로 Object타입으로 받는다.
        sendData.send();    //SendData<? extends Member> sendData: Member나 Member를 상속받은 객체만 가능 와일드카드의 상속제한
    }                       //SendData<? super VipMember> sendData : VipMember나 VipMember에 상속한 객체만 가능 와일드카드의 상속제한
}
