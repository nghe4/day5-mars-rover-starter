package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_return_y_plus_when_input_command_M_direction_N() {
        String command = "M";
        String direction = "N";
        int x = 0;
        int y = 0;

        MarsRover marsRover = new MarsRover(x, y, direction);
        marsRover.executeCommand(command);

        assertEquals(1, marsRover.getY());
    }

    @Test
    void should_return_x_plus_when_input_command_M_direction_E() {
        String command = "M";
        String direction = "E";
        int x = 0;
        int y = 0;

        MarsRover marsRover = new MarsRover(x, y, direction);
        marsRover.executeCommand(command);

        assertEquals(1, marsRover.getX());
    }

    @Test
    void should_return_y_minus_when_input_command_M_direction_S() {
        String command = "M";
        String direction = "S";
        int x = 0;
        int y = 0;

        MarsRover marsRover = new MarsRover(x, y, direction);
        marsRover.executeCommand(command);

        assertEquals(-1, marsRover.getY());
    }
}
