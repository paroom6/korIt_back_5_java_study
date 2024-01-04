package com.study.ch07.register;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        String productName = null;
        String productCode = null;
        long productPrice = 0;
        System.out.println("상품 등록 프로그램");

        ProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);

        System.out.print("상품명>>> ");
        productName = scanner.nextLine();
        if(productService.isEmptyString(productName)) {
            System.out.println("상품명을 다시 입력하세요");
            return;//리턴값이 없음 void일 때만 가능, 메서드 종료, 이 경우 main 메서드 종료
        }

        System.out.print("상품코드(예: P20240000)>>> ");
        productCode = scanner.nextLine();
        if(productService.isEmptyString(productCode)) {
            System.out.println("상품코드번호를 다시 입력하세요");
            return;
        }
        System.out.print("상품가격>>> ");
        productPrice = scanner.nextLong();
        Product product = new Product(productName,productCode,productPrice);

        productService.registerProductService(product);



    }

}
