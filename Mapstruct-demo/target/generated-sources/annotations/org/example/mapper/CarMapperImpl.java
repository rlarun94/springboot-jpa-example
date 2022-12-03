package org.example.mapper;

import javax.annotation.Generated;
import org.example.domain.Car;
import org.example.dto.CarDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-03T16:02:15+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
public class CarMapperImpl implements CarMapper {

    @Override
    public CarDto convertCarToCatDto(Car car) {
        if ( car == null ) {
            return null;
        }

        CarDto carDto = new CarDto();

        carDto.setSeatCount( car.getNumberOfSeats() );
        carDto.setMake( car.getMake() );
        carDto.setType( car.getType() );

        return carDto;
    }
}
