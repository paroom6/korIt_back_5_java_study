package com.study.ch19;

import lombok.Builder;
import lombok.ToString;


@ToString
//빌드업 패턴


public class Car {
    private String model;
    private String color;

    public Car() {};
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public static class CarBuilder{ //빌드업 패턴  == @Builder
        private String model;
        private String color;

        public Car build(){
            return new Car(model, color);
        }

        public CarBuilder model(String model) {
                this.model = model;
            return this;
        }
        public CarBuilder color (String color) {
            this.color = color;
            return this;
        }
    }

}
