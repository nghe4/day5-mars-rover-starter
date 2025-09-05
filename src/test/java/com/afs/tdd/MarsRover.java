package com.afs.tdd;

public class MarsRover {
    private int x;
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void executeCommand(String command) {
        if (command.equals("M")) {
            move();
        }
        else if (command.equals("L")) {
            turnLeft();
        }
        else if (command.equals("R")) {
            turnRight();
        }
    }

    private void turnRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "E":
                direction = "S";
                break;
            case "S":
                direction = "W";
                break;
            case "W":
                direction = "N";
                break;
        }
    }

    private void turnLeft() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "E":
                direction = "N";
                break;
            case "S":
                direction = "E";
                break;
            case "W":
                direction = "S";
                break;
        }
    }

    private void move() {
        switch (direction) {
            case "N":
                y += 1;
                break;
            case "E":
                x += 1;
                break;
            case "S":
                y -= 1;
                break;
            case "W":
                x -= 1;
                break;
        }
    }



    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public String getDirection() {
        return direction;
    }
}
