package org.example;

import org.example.domain.Car;
import org.example.dto.CarDto;
import org.example.mapper.CarMapper;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		Car car = new Car("Morris", 5, "SEDAN");
		CarDto carDto = CarMapper.INSTANCE.convertCarToCatDto(car);
		System.out.println(car.getType() + " == " + carDto.getType());
		System.out.println(car.getMake() + " == " + carDto.getMake());
		System.out.println(car.getNumberOfSeats() + " == " + carDto.getSeatCount());
	}

}
