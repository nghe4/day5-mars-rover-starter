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
}
