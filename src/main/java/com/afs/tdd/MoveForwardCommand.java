package com.afs.tdd;

public class MoveForwardCommand extends Command {
    public MoveForwardCommand(MarsRover marsRover) {
        super(marsRover);
    }

    @Override
    void execute() {
        this.marsRover.moveForward();
    }
}
