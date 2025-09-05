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

    @Test
    void should_return_x_minus_when_input_command_M_direction_W() {
        String command = "M";
        String direction = "W";
        int x = 0;
        int y = 0;

        MarsRover marsRover = new MarsRover(x, y, direction);
        marsRover.executeCommand(command);

        assertEquals(-1, marsRover.getX());
    }

    @Test
    void should_return_direction_W_when_input_command_L_direction_N() {
        String command = "L";
        String direction = "N";
        int x = 0;
        int y = 0;

        MarsRover marsRover = new MarsRover(x, y, direction);
        marsRover.executeCommand(command);

        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_return_direction_N_when_input_command_L_direction_E() {
        String command = "L";
        String direction = "E";
        int x = 0;
        int y = 0;

        MarsRover marsRover = new MarsRover(x, y, direction);
        marsRover.executeCommand(command);

        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_return_direction_E_when_input_command_L_direction_S() {
        String command = "L";
        String direction = "S";
        int x = 0;
        int y = 0;

        MarsRover marsRover = new MarsRover(x, y, direction);
        marsRover.executeCommand(command);

        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_return_direction_S_when_input_command_L_direction_W() {
        String command = "L";
        String direction = "W";
        int x = 0;
        int y = 0;

        MarsRover marsRover = new MarsRover(x, y, direction);
        marsRover.executeCommand(command);

        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_return_direction_E_when_input_command_R_direction_N() {
        String command = "R";
        String direction = "N";
        int x = 0;
        int y = 0;

        MarsRover marsRover = new MarsRover(x, y, direction);
        marsRover.executeCommand(command);

        assertEquals("E", marsRover.getDirection());
    }
}
