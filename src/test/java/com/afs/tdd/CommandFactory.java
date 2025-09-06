package com.afs.tdd;

class CommandFactory {
    public static Command createCommand(String commandType, MarsRover marsRover) {
        switch (commandType) {
            case "M":
                return new MoveForwardCommand(marsRover);
            case "L":
                return new TurnLeftCommand(marsRover);
            case "R":
                return new TurnRightCommand(marsRover);
            default:
                throw new IllegalArgumentException("Unknown command: " + commandType);
        }
    }
}