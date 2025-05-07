package ch19_generic.products;

import lombok.AllArgsConstructor;
import lombok.ToString;

/*
    1. ProductController.java를 생성하고, 다양한 타입의
    상품 정보를 저장하고, 출력하는 코드를 작성하시오

    실행예
        Product(productName=Laptop, productInfo=Intel i7, 16GB RAM, 512GB SSD) String
        Product(productName=Smartphone, productInfo=199.99) Double
        Product(productName=Available, productInfo=true) Boolean
 */
@AllArgsConstructor
//@ToString     // Data를 달아서 해결하는 방법, alt+ins를 통해 toString() 메서드를 재정의하는 방법도 있습니다.
public class Product<T> {
    private String productName;
    private T productInfo;

    @Override
    public String toString() {
        return "Product(" +
                "productName='" + productName + '\'' +
                ", productInfo=" + productInfo +
                ')';
    }

    // ch19_generic 일부에 wildcards 패키지 생성
    // Animal / AnimalData / Car / Human / Tiger / Main
}
