package com.study.ch07.register;

public class ProductService {
    boolean isEmptyString(String str) {
        if(str == null){
            return true;
        }
        return str.isBlank();//" "을 지우고 공백을 인식 isEmpty() ""인 경우에만 true ," "경우 false

    }
    void registerProductService(Product product) {
        System.out.println("서비스까지 데이터 전달함.");
        ProductRepository productRepository = new ProductRepository();
        productRepository.saveProduct(product);
    }

}
