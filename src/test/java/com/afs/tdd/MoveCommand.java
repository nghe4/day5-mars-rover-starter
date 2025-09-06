package com.afs.tdd;

public class MoveCommand  extends Command {
    public MoveCommand(MarsRover marsRover) {
        super(marsRover);
    }

    @Override
    void execute() {
        this.marsRover.moveForward();
    }
}
