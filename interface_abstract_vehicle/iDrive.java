package com.mac190.vehicle;

public interface iDrive {
    void moveForward();
    void moveBackwards();
    void turnLeft(double degrees);
    void turnRight(double degrees);
    void ChangeSpeed(double s);
    void Brake();
}
