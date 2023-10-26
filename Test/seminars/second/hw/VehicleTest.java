package seminars.second.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car;
    Motorcycle moto;

    @BeforeEach
    void setUp() {
        car = new Car("Audi", "Volkswagen", 2014);
        moto = new Motorcycle("Sun", "Yamaha", 1989);
    }

    @Test
    public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);

    }

    @Test
    public void testCarFourWheels() {
        Assertions.assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotoTwoWheels() {
        Assertions.assertEquals(2, car.getNumWheels());
    }

    @Test
    public void testCarDriveSpeed60() {
        car.testDrive();
        Assertions.assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotoDriveSpeed75() {
        moto.testDrive();
        Assertions.assertEquals(75, car.getSpeed());
    }

    @Test
    public void testCarParkSpeedIsZero() {
        car.testDrive();
        car.park();
        Assertions.assertEquals(0, car.getSpeed());
    }

    @Test
    public void testMotoParkSpeedIsZero() {
        moto.testDrive();
        moto.park();
        Assertions.assertEquals(0, moto.getSpeed());
    }
}

