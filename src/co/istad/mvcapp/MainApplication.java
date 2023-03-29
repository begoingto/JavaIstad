package co.istad.mvcapp;

import co.istad.mvcapp.controller.IndexController;

public class MainApplication {
    private static IndexController indexController;
    public static void main(String[] args) {
        indexController = new IndexController();
        indexController.handleIndex();
    }
}
