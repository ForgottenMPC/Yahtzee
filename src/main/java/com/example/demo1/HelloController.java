package com.example.demo1;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;

import java.util.Random;


public class HelloController {
    @FXML
        private Label cube_1_v, cube_2_v, cube_3_v, cube_4_v, cube_5_v, ace_value, FScore, twos_value, threes_value, fours_value, fives_value, sixes_value;
    @FXML
        private ToggleButton cube1, cube2, cube3, cube4, cube5;
    @FXML
        private Button roll,ace, twos, three, four, five, sixes;

    int [] qc = new int[5];
    int same;

    int score1;
    Random random = new Random();
    int r1=0;
    int r2 = 0;
    int r3 = 0;
    int r4 = 0;
    int r5 = 0;
    boolean h1 = false;
    boolean h2 = false;
    boolean h3 = false;
    boolean h4 = false;
    boolean h5 = false;

    int ace_v = 0;
    int twos_v = 0;
    int three_v = 0;
    int fours_v = 0;
    int fives_v = 0;
    int sixes_v = 0;

    int rollv = 0;


    public void hold1(){
        if (cube1.isSelected()) {

            h1 = true;
            qc[0] = r1;

            switch (qc[0]){
                case 1: ace_v++;
                case 2: twos_v = twos_v +2;
                case 3: three_v = three_v +3;
                case 4: fours_v = fours_v +4;
                case 5: fives_v = fives_v +5;
                case 6: sixes_v += 6;

            }
        }
        else {
            h1 = false;
            ace_v = twos_v = three_v = fours_v = fives_v = sixes_v = 0;
        }
    }

    public void hold2(){
        if (cube2.isSelected()) {
            h2 = true;
            qc[1] = r2;
            switch (qc[1]){
                case 1: ace_v++;
                case 2: twos_v = twos_v +2;
                case 3: three_v = three_v +3;
                case 4: fours_v = fours_v +4;
                case 5: fives_v = fives_v +5;
                case 6: sixes_v += 6;
            }


        }
        else {
            h2 = false;
            ace_v = twos_v = three_v = fours_v = fives_v = sixes_v = 0;

        }
    }

    public void hold3(){
        if (cube3.isSelected()) {
            h3 = true;
            qc[2] = r3;
            switch (qc[2]){
                case 1: ace_v++;
                case 2: twos_v = twos_v +2;
                case 3: three_v = three_v +3;
                case 4: fours_v = fours_v +4;
                case 5: fives_v = fives_v +5;
                case 6: sixes_v += 6;
            }


        }
        else {
            h3 = false;
            ace_v = twos_v = three_v = fours_v = fives_v = sixes_v = 0;

        }
    }


    public void hold4(){
        if (cube4.isSelected()) {
            h4 = true;
            qc[3] = r4;
                switch (qc[3]) {
                    case 1:
                        ace_v++;
                    case 2:
                        twos_v = twos_v + 2;
                    case 3:
                        three_v = three_v + 3;
                    case 4:
                        fours_v = fours_v + 4;
                    case 5:
                        fives_v = fives_v + 5;
                    case 6:
                        sixes_v += 6;
                }

        }
        else {
            h4 = false;
            ace_v = twos_v = three_v = fours_v = fives_v = sixes_v = 0;

        }
    }
    public void hold5(){
        if (cube5.isSelected()) {
            h5 = true;
            qc[4] = r5;
                switch (qc[4]) {
                    case 1:
                        ace_v++;
                    case 2:
                        twos_v = twos_v + 2;
                    case 3:
                        three_v = three_v + 3;
                    case 4:
                        fours_v = fours_v + 4;
                    case 5:
                        fives_v = fives_v + 5;
                    case 6:
                        sixes_v += 6;
                }

        }
        else {
            h5 = false;
            ace_v = twos_v = three_v = fours_v = fives_v = sixes_v = 0;

        }
    }

    public void rollvalue() {
        if (rollv <= 2){

            if (!h1) {
            r1 = random.nextInt(6) + 1;
            cube_1_v.setText(String.valueOf(r1));
            }
            if (!h2) {
                r2 = random.nextInt(6) + 1;
                cube_2_v.setText(String.valueOf(r2));
            }
            if (!h3) {
                r3 = random.nextInt(6) + 1;
                cube_3_v.setText(String.valueOf(r3));
            }
            if (!h4) {
                r4 = random.nextInt(6) + 1;
                cube_4_v.setText(String.valueOf(r4));
            }
            if (!h5) {
                r5 = random.nextInt(6) + 1;
                cube_5_v.setText(String.valueOf(r5));
            }
                roll.setText("roll");
        rollv++;
        } else{
            roll.setText("Stop");
        }
    }

    public void ace_hit(){
        ace_value.setText(String.valueOf(ace_v));
        ace.setDisable(true);
        r1 = random.nextInt(6)+1;
        cube_1_v.setText(String.valueOf(r1));
        r1 = random.nextInt(6)+1;
        cube_2_v.setText(String.valueOf(r1));
        r1 = random.nextInt(6)+1;
        cube_3_v.setText(String.valueOf(r1));
        r1 = random.nextInt(6)+1;
        cube_4_v.setText(String.valueOf(r1));
        r1 = random.nextInt(6)+1;
        cube_5_v.setText(String.valueOf(r1));
        score1 = score1 + ace_v;
        FScore.setText(String.valueOf(score1));
        rollv = 0;
    }

    public void twos_hit(){
        twos_value.setText(String.valueOf(twos_v));
        twos.setDisable(true);
        r1 = random.nextInt(6)+1;
        cube_1_v.setText(String.valueOf(r1));
        r2 = random.nextInt(6)+1;
        cube_2_v.setText(String.valueOf(r2));
        r3 = random.nextInt(6)+1;
        cube_3_v.setText(String.valueOf(r3));
        r4 = random.nextInt(6)+1;
        cube_4_v.setText(String.valueOf(r4));
        r5 = random.nextInt(6)+1;
        cube_5_v.setText(String.valueOf(r5));
        score1 = score1 + twos_v;
        FScore.setText(String.valueOf(score1));
        rollv = 0;
    }

    public void threes_hit(){
        threes_value.setText(String.valueOf(three_v));
        three.setDisable(true);
        r1 = random.nextInt(6)+1;
        cube_1_v.setText(String.valueOf(r1));
        r2 = random.nextInt(6)+1;
        cube_2_v.setText(String.valueOf(r2));
        r3 = random.nextInt(6)+1;
        cube_3_v.setText(String.valueOf(r3));
        r4 = random.nextInt(6)+1;
        cube_4_v.setText(String.valueOf(r4));
        r5 = random.nextInt(6)+1;
        cube_5_v.setText(String.valueOf(r5));
        score1 = score1 + three_v;
        FScore.setText(String.valueOf(score1));
        rollv = 0;
    }

    public void fours_hit(){
        fours_value.setText(String.valueOf(fours_v));
        four.setDisable(true);
        r1 = random.nextInt(6)+1;
        cube_1_v.setText(String.valueOf(r1));
        r2 = random.nextInt(6)+1;
        cube_2_v.setText(String.valueOf(r2));
        r3 = random.nextInt(6)+1;
        cube_3_v.setText(String.valueOf(r3));
        r4 = random.nextInt(6)+1;
        cube_4_v.setText(String.valueOf(r4));
        r5 = random.nextInt(6)+1;
        cube_5_v.setText(String.valueOf(r5));
        score1 = score1 + fours_v;
        FScore.setText(String.valueOf(score1));
        rollv = 0;
    }

    public void fives_hit(){
        fives_value.setText(String.valueOf(fives_v));
        five.setDisable(true);
        r1 = random.nextInt(6)+1;
        cube_1_v.setText(String.valueOf(r1));
        r2 = random.nextInt(6)+1;
        cube_2_v.setText(String.valueOf(r2));
        r3 = random.nextInt(6)+1;
        cube_3_v.setText(String.valueOf(r3));
        r4 = random.nextInt(6)+1;
        cube_4_v.setText(String.valueOf(r4));
        r5 = random.nextInt(6)+1;
        cube_5_v.setText(String.valueOf(r5));
        score1 = score1 + fives_v;
        FScore.setText(String.valueOf(score1));
        rollv = 0;
    }

    public void sixes_hit(){
        sixes_value.setText(String.valueOf(sixes_v));
        sixes.setDisable(true);
        r1 = random.nextInt(6)+1;
        cube_1_v.setText(String.valueOf(r1));
        r2 = random.nextInt(6)+1;
        cube_2_v.setText(String.valueOf(r2));
        r3 = random.nextInt(6)+1;
        cube_3_v.setText(String.valueOf(r3));
        r4 = random.nextInt(6)+1;
        cube_4_v.setText(String.valueOf(r4));
        r5 = random.nextInt(6)+1;
        cube_5_v.setText(String.valueOf(r5));
        score1 = score1 + sixes_v;
        FScore.setText(String.valueOf(score1));
        rollv = 0;
    }

    public void three_of_a_kind(){

    }




}

