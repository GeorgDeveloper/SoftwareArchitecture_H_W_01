package ru.geekbrains.lesson1.store3D.models;

import java.util.ArrayList;
import java.util.List;

public class Scene {

    //TODO: Доработать в рамках ДР

    public int ID;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> cameras = new ArrayList<Camera>();

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {

    }

    public <Flash> Flash method1(Flash flash) {
        return flash;
    }

    public <Model, Camera> Model  method2(Model model, Camera camera) {
        return model;
    }

}
