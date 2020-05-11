package com.training.design.pattern.observer;

/**
 * Observer pattern.
 *
 * 의도: 객체 사이에 일 대 다의 의존 관계를 정의해 두어, 어떤 객체의 상태가 변할 때 그 객체에 의존성을 가진 다른 객체들이 그 변화를 통지받고 자동으로 갱신될 수 있게 만듭니다.
 *
 * */
public class Main {
    public static void main(String[] args) {
        WeatherData weather = new WeatherData();
        new CurrentConditionsDisplay(weather, 1);
        new CurrentConditionsDisplay(weather, 2);
        new CurrentConditionsDisplay(weather, 3);

        weather.setMeasurements(30,65, 30.4f);
        weather.setMeasurements(29,64, 30.5f);
        weather.setMeasurements(30,64, 30.6f);
    }
}
