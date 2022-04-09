package ru.geekbrains.patterns.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MarketApplication {
	// ПАТТЕРНЫ В ПРОЕКТЕ:

	// ПОРОЖДАЮЩИЕ ПАТТЕРНЫ:
	// Корзина является реализацией паттерна Singleton
	// Main-класс создает экземпляр ApplicationContext - паттерн Factory
	// реализация заказа использует паттерн Builder

	// СТРУКТУРНЫЕ ПАТТЕРНЫ:
	// OrederCotroller - паттерн Bridge
	// OrderService -  паттерн Adapter
	// Структура проета реализует паттерн Model View Controller
	// AOP Spring - это паттерн Proxy

	// ПОВЕДЕНЧЕСКИЕ ПАТТЕРНЫ:
	// AuthController - паттерна Mediator
	// JwtTokenUtil реализует паттерн Command
	// Cart реализует паттерн Iterator
	// В репозиториях List наследуется от Collection extends Iterable - паттерн Iterator

	public static void main(String[] args) {
		SpringApplication.run(MarketApplication.class, args);
	}
}
