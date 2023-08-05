package com.learning.designpatterns.abstractfactory;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class AbstractFactoryTest {

    @Test
    public void testGeneralMotorMotorVehicle() {
        Corporation corporation = new GeneralMotorCorporation();
        MotorVehicle motorVehicle = corporation.createMotorVehicle();
        ElectricVehicle electricVehicle = corporation.createElectricVehicle();

        motorVehicle.build();
        electricVehicle.build();
        assertTrue(motorVehicle instanceof GeneralMotorMotorVehicle);
        assertTrue(electricVehicle instanceof GeneralMotorElectricVehicle);
    }
}
