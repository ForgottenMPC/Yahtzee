package com.example.demo1;

import javafx.event.ActionEvent;
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
    int r1;
    boolean h1 = false;
    boolean h2 = false;
    boolean h3 = false;
    boolean h4 = false;
    boolean h5 = false;

    int ace_v,twos_v,three_v, fours_v, fives_v, sixes_v;

    int rollv = 0;


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

    public void rollvalue(ActionEvent e) {
        if (rollv <= 2){

        switch (1){
            case 1:
            if (h1 == false) {
            r1 = random.nextInt(6) + 1;
            cube_1_v.setText(String.valueOf(r1));
            qc[0] = r1;
            }
        case 2:
            if (h2 == false) {
                r1 = random.nextInt(6) + 1;
                cube_2_v.setText(String.valueOf(r1));
                qc[1] = r1;
            }
        case 3:
            if (h3 == false) {
                r1 = random.nextInt(6) + 1;
                cube_3_v.setText(String.valueOf(r1));
                qc[2] = r1;
            }
        case 4:
            if (h4 == false) {
                r1 = random.nextInt(6) + 1;
                cube_4_v.setText(String.valueOf(r1));
                qc[3] = r1;
            }
        case 5:
            if (h5 == false) {
                r1 = random.nextInt(6) + 1;
                cube_5_v.setText(String.valueOf(r1));
                qc[4] = r1;
            }
            default:
                roll.setText("roll");

        }
        rollv++;
        } else{
            roll.setText("Stop");
        }
    }

    public void ace_hit(ActionEvent e){
        switch (1) {
            case 1:
                if (qc[0] == 1 && h1) {
                    ace_v++;
                }
            case 2:
                if (qc[1]  == 1 && h2) {
                    ace_v++;
                }
            case 3:
                if (qc[2]  == 1 && h3) {
                    ace_v++;
                }
            case 4:
                if (qc[3]  == 1 && h4) {
                    ace_v++;
                }
            case 5:
                if (qc[4]  == 1 && h5) {
                    ace_v++;
                }
            default:
                ace_value.setText(String.valueOf(ace_v));
                ace.setDisable(true);
        }
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

        h1 = h2 = h3 = h4 = h5 = false;
        cube1.setDisable(false);
        cube2.setDisable(false);
        cube3.setDisable(false);
        cube4.setDisable(false);
        cube5.setDisable(false);


        score1 = score1 + ace_v;
        FScore.setText(String.valueOf(score1));
        rollv = 0;
    }

    public void twos_hit(ActionEvent e){
        switch (1) {
        case 1:
            if (qc[0] == 2 && h1) {
                twos_v = twos_v +2;
            }
        case 2:
            if (qc[1]  == 2 && h2) {
                twos_v = +2;
            }
        case 3:
            if (qc[2]  == 2 && h3) {
                twos_v = +2;
            }
        case 4:
            if (qc[3]  == 2 && h4) {
                twos_v = +2;
            }
        case 5:
            if (qc[4]  == 2 && h5) {
                twos_v = +2;
            }
        default:
            twos_value.setText(String.valueOf(twos_v));
            twos.setDisable(true);
    }
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

        h1 = h2 = h3 = h4 = h5 = false;
        cube1.setDisable(false);
        cube2.setDisable(false);
        cube3.setDisable(false);
        cube4.setDisable(false);
        cube5.setDisable(false);


        score1 = score1 + twos_v;
        FScore.setText(String.valueOf(score1));
        rollv = 0;
    }

    public void threes_hit(ActionEvent e){
        switch (1) {
            case 1:
                if (qc[0] == 3 && h1) {
                    three_v = three_v +3;
                }
            case 2:
                if (qc[1]  == 3 && h2) {
                    three_v = three_v + 3;
                }
            case 3:
                if (qc[2]  == 3 && h3) {
                    three_v = three_v + 3;
                }
            case 4:
                if (qc[3]  == 3 && h4) {
                    three_v = three_v +3;
                }
            case 5:
                if (qc[4]  == 3 && h5) {
                    three_v = three_v +3;
                }
            default:
                threes_value.setText(String.valueOf(three_v));
                three.setDisable(true);
        }
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

        h1 = h2 = h3 = h4 = h5 = false;
        cube1.setDisable(false);
        cube2.setDisable(false);
        cube3.setDisable(false);
        cube4.setDisable(false);
        cube5.setDisable(false);


        score1 = score1 + three_v;
        FScore.setText(String.valueOf(score1));
        rollv = 0;
    }

    public void fours_hit(ActionEvent e){
        switch (1) {
            case 1:
                if (qc[0] == 4 && h1) {
                    fours_v = fours_v +4;
                }
            case 2:
                if (qc[1]  == 3 && h2) {
                    fours_v = fours_v + 4;
                }
            case 3:
                if (qc[2]  == 3 && h3) {
                    fours_v = fours_v + 4;
                }
            case 4:
                if (qc[3]  == 3 && h4) {
                    fours_v = fours_v +4;
                }
            case 5:
                if (qc[4]  == 3 && h5) {
                    fours_v = fours_v +4;
                }
            default:
                fours_value.setText(String.valueOf(fours_v));
                four.setDisable(true);
        }
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

        h1 = h2 = h3 = h4 = h5 = false;
        cube1.setDisable(false);
        cube2.setDisable(false);
        cube3.setDisable(false);
        cube4.setDisable(false);
        cube5.setDisable(false);


        score1 = score1 + three_v;
        FScore.setText(String.valueOf(score1));
        rollv = 0;
    }

    public void fives_hit(ActionEvent e){
        switch (1) {
            case 1:
                if (qc[0] == 5 && h1) {
                    fives_v = fives_v +5;
                }
            case 2:
                if (qc[1]  == 5 && h2) {
                    fives_v = fives_v + 5;
                }
            case 3:
                if (qc[2]  == 5 && h3) {
                    fives_v = fives_v + 5;
                }
            case 4:
                if (qc[3]  == 5 && h4) {
                    fives_v = fives_v +5;
                }
            case 5:
                if (qc[4]  == 5 && h5) {
                    fives_v = fives_v +5;
                }
            default:
                fives_value.setText(String.valueOf(fives_v));
                five.setDisable(true);
        }
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

        h1 = h2 = h3 = h4 = h5 = false;
        cube1.setDisable(false);
        cube2.setDisable(false);
        cube3.setDisable(false);
        cube4.setDisable(false);
        cube5.setDisable(false);


        score1 = score1 + three_v;
        FScore.setText(String.valueOf(score1));
        rollv = 0;
    }

    public void sixes_hit(ActionEvent e){
        switch (1) {
            case 1:
                if (qc[0] == 6 && h1) {
                    sixes_v = sixes_v +6;
                }
            case 2:
                if (qc[1]  == 6 && h2) {
                    sixes_v = sixes_v + 6;
                }
            case 3:
                if (qc[2]  == 6 && h3) {
                    sixes_v = sixes_v + 6;
                }
            case 4:
                if (qc[3]  == 6 && h4) {
                    sixes_v = sixes_v +6;
                }
            case 5:
                if (qc[4]  == 6 && h5) {
                    sixes_v = sixes_v +6;
                }
            default:
                sixes_value.setText(String.valueOf(sixes_v));
                sixes.setDisable(true);
        }
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

        h1 = h2 = h3 = h4 = h5 = false;
        cube1.setDisable(false);
        cube2.setDisable(false);
        cube3.setDisable(false);
        cube4.setDisable(false);
        cube5.setDisable(false);


        score1 = score1 + three_v;
        FScore.setText(String.valueOf(score1));
        rollv = 0;
    }

    public void three_of_a_kind(ActionEvent e){

    }




}

