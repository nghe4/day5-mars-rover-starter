package com.afs.tdd;

public class TurnLeftCommand extends Command {
    public TurnLeftCommand(MarsRover marsRover) {
        super(marsRover);
    }

    @Override
    void execute() {
        this.marsRover.turnLeft();
    }
}
