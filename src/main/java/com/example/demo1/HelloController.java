package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;

import java.util.Random;


public class HelloController {
    @FXML
        private Label cube_1_v, cube_2_v, cube_3_v, cube_4_v, cube_5_v;
    @FXML
        private ToggleButton cube1, cube2, cube3, cube4, cube5;
    @FXML
        private Button roll;
    Random random = new Random();
    int r1;
    boolean h1 = false;
    boolean h2 = false;
    boolean h3 = false;
    boolean h4 = false;
    boolean h5 = false;

    int rollv = 0;
    public void rollvalue(ActionEvent e) {
        if (rollv <= 2){
        switch (1){
        case 1:
            if (h1 == false) {
            r1 = random.nextInt(6) + 1;
            cube_1_v.setText(String.valueOf(r1)); }
        case 2:
            if (h2 == false) {
                r1 = random.nextInt(6) + 1;
                cube_2_v.setText(String.valueOf(r1));
            }
        case 3:
            if (h3 == false) {
                r1 = random.nextInt(6) + 1;
                cube_3_v.setText(String.valueOf(r1));
            }
        case 4:
            if (h4 == false) {
                r1 = random.nextInt(6) + 1;
                cube_4_v.setText(String.valueOf(r1));
            }
        case 5:
            if (h5 == false) {
                r1 = random.nextInt(6) + 1;
                cube_5_v.setText(String.valueOf(r1));
            }
        }
        rollv++;
        } else{
            roll.setText("Stop");
        }
    }

    public void hold1(ActionEvent e){
        if (cube1.isSelected()) {
        h1 = true;
        }
        else {
           h1 = false;
        }
    }

    public void hold2(ActionEvent e){
        if (cube2.isSelected()) {
            h2 = true;
        }
        else {
            h2 = false;
        }
    }

    public void hold3(ActionEvent e){
        if (cube3.isSelected()) {
            h3 = true;
        }
        else {
            h3 = false;
        }
    }


    public void hold4(ActionEvent e){
        if (cube4.isSelected()) {
            h4 = true;
        }
        else {
            h4 = false;
        }
    }
    public void hold5(ActionEvent e){
        if (cube5.isSelected()) {
            h5 = true;
        }
        else {
            h5 = false;
        }
    }








}

