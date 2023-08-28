package ru.geekbrains.lesson1.store3D.models;

public class Camera {

    //TODO: Доработать в рамках ДР
    private Point3D Location;
    private Angle3D Angle;

    public Point3D getLocation() {
        return Location;
    }

    public void setLocation(Point3D location) {
        Location = location;
    }

    public Angle3D getAngle() {
        return Angle;
    }

    public void setAngle(Angle3D angle) {
        Angle = angle;
    }

    public void Rotate(Angle3D angle){}

    public void Move(Point3D point){}
}
