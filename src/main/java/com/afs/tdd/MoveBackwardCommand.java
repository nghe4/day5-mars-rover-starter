package com.afs.tdd;

public class MoveBackwardCommand extends Command {
    public MoveBackwardCommand(MarsRover marsRover) {
        super(marsRover);
    }

    @Override
    void execute() {
        this.marsRover.moveBackward();
    }
}
