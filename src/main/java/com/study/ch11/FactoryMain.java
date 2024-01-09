package com.study.ch11;

import com.study.ch01.PrintStudy;

public class FactoryMain {//교재는 참고용
    public static void main(String[] args) {

        Company company = new Company();

        company.setName("삼성");
        company.showCompanyInfo();

//        //SamsungCompany samsungCompany = new SamsungCompany(); // 굳이 생성할 이우가 있나? 언제든 삼성만 나온다.
//        SamsungCompany.name = "애플";
//        SamsungCompany.showCompanyInfo();
//        SamsungCompany samsungCompany = new SamsungCompany();
//        samsungCompany.showCompanyInfo(); // 생성자 new를 선언하여도 같은 메모리주소를 사용한다.
        int autoCount = 0;

        Phone phone1 = new Phone(company);
        Phone phone2 = new Phone(company);
        Phone phone3 = new Phone(company);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        PrintStudy.main(null);//메인내 다른 메신메소드 실행가능
    }

}
