package com.afs.tdd;

public class TurnRightCommand  extends Command {
    public TurnRightCommand(MarsRover marsRover) {
        super(marsRover);
    }

    @Override
    void execute() {
        this.marsRover.turnRight();
    }
}
