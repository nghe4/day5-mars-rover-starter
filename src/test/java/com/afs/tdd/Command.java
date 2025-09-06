package com.afs.tdd;

abstract class Command {
    protected MarsRover marsRover;

    public Command(MarsRover marsRover) {
        this.marsRover = marsRover;
    }
    abstract void execute();
}
