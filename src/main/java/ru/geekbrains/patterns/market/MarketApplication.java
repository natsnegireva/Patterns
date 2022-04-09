package ru.geekbrains.patterns.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MarketApplication {
	// Корзина является реализацией паттерна Синглтон
	// Main-класс создает экземпляр ApplicationContext - паттерн Фабрика
	// реализация заказа использует паттерн Builder

	public static void main(String[] args) {
		SpringApplication.run(MarketApplication.class, args);
	}
}
