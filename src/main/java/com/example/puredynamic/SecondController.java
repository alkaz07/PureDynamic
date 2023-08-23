package com.example.puredynamic;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SecondController {

    @FXML
    Button xbutton, ybutton;

    private String z="";

    public void setZ(String s)
    {
        z=s;
    }

    @FXML
    private void doX()
    {
        System.out.println("xxxxxx"+z);
    }

}
