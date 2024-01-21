package com.example.demo1;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;

import java.util.Arrays;
import java.util.Random;


public class HelloController {
    @FXML
        private Label cube_1_v, cube_2_v, cube_3_v, cube_4_v, cube_5_v, ace_value, FScore, twos_value, threes_value, fours_value, fives_value, sixes_value, bonus_value, three_of_a_kind_value, SScore, four_of_a_kind_value, full_house_value, small_straight_value, large_straight_value, yahtzee_value, chance_value,total_score_value, yahtzee_bonus_value;
    @FXML
        private ToggleButton cube1, cube2, cube3, cube4, cube5;
    @FXML
        private Button roll,ace, twos, three, four, five, sixes, three_of_a_kind, four_of_a_kind, full_house, small_straight, large_straight, yahtzee, chance, yahzee_bonus;

    int [] qc = new int[5];
    int same, same1,same2,same3,same4,same5,same6;
    boolean fullhouse = false;
    int fh_c;
    boolean yahtzee_hit = false;
    int score1, score2;
    Random random = new Random();

    int yahtzee_bonus_count = 0;
    int seq;
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

    int lv1,lv2,lv3,lv4,lv5;
    int ace_v,  twos_v, three_v, fours_v, fives_v, sixes_v = 0;

    int rollv = 0;

    boolean bonus_test = false;
    int bonus = 0;
    public void hold1(){
        if (cube1.isSelected()) {
            h1 = true;
            qc[0] = r1;
            switch (qc[0]){
                case 1: ace_v++; break;
                case 2: twos_v = twos_v + 2; break;
                case 3: three_v = three_v + 3; break;
                case 4: fours_v = fours_v +4; break;
                case 5: fives_v = fives_v+ 5; break;
                case 6: sixes_v = sixes_v+ 6; break;
            }
        }
        else {
            h1 = false;
            switch (qc[0]){
                case 1: ace_v--; break;
                case 2: twos_v = twos_v - 2; break;
                case 3: three_v = three_v - 3; break;
                case 4: fours_v = fours_v -4; break;
                case 5: fives_v = fives_v- 5; break;
                case 6: sixes_v = sixes_v- 6; break;
            }
        }
    }
    public void hold2(){
        if (cube2.isSelected()) {
            h2 = true;
            qc[1] = r2;
            switch (qc[1]){
                case 1: ace_v++; break;
                case 2: twos_v = twos_v + 2; break;
                case 3: three_v = three_v + 3; break;
                case 4: fours_v = fours_v +4; break;
                case 5: fives_v = fives_v+ 5; break;
                case 6: sixes_v = sixes_v+ 6; break;
            }


        }
        else {
            h2 = false;
            switch (qc[1]){
                case 1: ace_v--; break;
                case 2: twos_v = twos_v - 2; break;
                case 3: three_v = three_v - 3; break;
                case 4: fours_v = fours_v -4; break;
                case 5: fives_v = fives_v- 5; break;
                case 6: sixes_v = sixes_v- 6; break;
            }

        }
    }
    public void hold3(){
        if (cube3.isSelected()) {
            h3 = true;
            qc[2] = r3;
            switch (qc[2]){
                case 1: ace_v++; break;
                case 2: twos_v = twos_v + 2; break;
                case 3: three_v = three_v + 3; break;
                case 4: fours_v = fours_v +4; break;
                case 5: fives_v = fives_v+ 5; break;
                case 6: sixes_v = sixes_v+ 6; break;
            }


        }
        else {
            h3 = false;
            switch (qc[2]){
                case 1: ace_v--; break;
                case 2: twos_v = twos_v - 2; break;
                case 3: three_v = three_v - 3; break;
                case 4: fours_v = fours_v -4; break;
                case 5: fives_v = fives_v- 5; break;
                case 6: sixes_v = sixes_v- 6; break;
            }

        }
    }
    public void hold4(){
        if (cube4.isSelected()) {
            h4 = true;
            qc[3] = r4;
            switch (qc[3]) {
                case 1: ace_v++; break;
                case 2: twos_v = twos_v + 2; break;
                case 3: three_v = three_v + 3; break;
                case 4: fours_v = fours_v +4; break;
                case 5: fives_v = fives_v+ 5; break;
                case 6: sixes_v = sixes_v+ 6; break;
                }

        }
        else {
            h4 = false;
            switch (qc[3]){
                case 1: ace_v--; break;
                case 2: twos_v = twos_v - 2; break;
                case 3: three_v = three_v - 3; break;
                case 4: fours_v = fours_v -4; break;
                case 5: fives_v = fives_v- 5; break;
                case 6: sixes_v = sixes_v- 6; break;
            }

        }
    }
    public void hold5(){
        if (cube5.isSelected()) {
            h5 = true;
            qc[4] = r5;
            switch (qc[4]) {
                case 1: ace_v++; break;
                case 2: twos_v = twos_v + 2; break;
                case 3: three_v = three_v + 3; break;
                case 4: fours_v = fours_v +4; break;
                case 5: fives_v = fives_v+ 5; break;
                case 6: sixes_v = sixes_v+ 6; break;
                }

        }
        else {
            h5 = false;
            switch (qc[4]){
                case 1: ace_v--; break;
                case 2: twos_v = twos_v - 2; break;
                case 3: three_v = three_v - 3; break;
                case 4: fours_v = fours_v -4; break;
                case 5: fives_v = fives_v- 5; break;
                case 6: sixes_v = sixes_v- 6; break;
            }

        }
    }

    public void rollvalue() {
        if (rollv <= 200){

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
        r2 = random.nextInt(6)+1;
        cube_2_v.setText(String.valueOf(r2));
        r3 = random.nextInt(6)+1;
        cube_3_v.setText(String.valueOf(r3));
        r4 = random.nextInt(6)+1;
        cube_4_v.setText(String.valueOf(r4));
        r5 = random.nextInt(6)+1;
        cube_5_v.setText(String.valueOf(r5));
        score1 = score1 + ace_v;
        FScore.setText(String.valueOf(score1));
        rollv = 0;
        h1 = h2 = h3 = h4 = h5 = false;
        cube1.setSelected(false);
        cube2.setSelected(false);
        cube3.setSelected(false);
        cube4.setSelected(false);
        cube5.setSelected(false);
        bonus = score1;
        if (bonus >= 63 && !bonus_test){
            bonus_value.setText(String.valueOf(35));
            bonus_test = true;
            score1 += 35;
            FScore.setText(String.valueOf(score1));
            lv1 = lv2 = lv3 = lv4 = lv5 = fh_c = same = same1 = same2 = same3 = same4 = same5 = same6 = ace_v = twos_v = three_v = fours_v = fives_v = sixes_v = 0;

        }
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
        h1 = h2 = h3 = h4 = h5 = false;
        cube1.setSelected(false);
        cube2.setSelected(false);
        cube3.setSelected(false);
        cube4.setSelected(false);
        cube5.setSelected(false);
        bonus = score1;
        if (bonus >= 63 && !bonus_test){
            bonus_value.setText(String.valueOf(35));
            bonus_test = true;
            score1 += 35;
            FScore.setText(String.valueOf(score1));
            lv1 = lv2 = lv3 = lv4 = lv5 = same = fh_c =same1 = same2 = same3 = same4 = same5 = same6 = ace_v = twos_v = three_v = fours_v = fives_v = sixes_v = 0;

        }
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
        h1 = h2 = h3 = h4 = h5 = false;
        cube1.setSelected(false);
        cube2.setSelected(false);
        cube3.setSelected(false);
        cube4.setSelected(false);
        cube5.setSelected(false);
        bonus = score1;
        if (bonus >= 63 && !bonus_test){
            bonus_value.setText(String.valueOf(35));
            bonus_test = true;
            score1 += 35;
            FScore.setText(String.valueOf(score1));
            lv1 = lv2 = lv3 = lv4 =fh_c= lv5 = same = same1 = same2 = same3 = same4 = same5 = same6 = ace_v = twos_v = three_v = fours_v = fives_v = sixes_v = 0;

        }
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
        h1 = h2 = h3 = h4 = h5 = false;
        cube1.setSelected(false);
        cube2.setSelected(false);
        cube3.setSelected(false);
        cube4.setSelected(false);
        cube5.setSelected(false);
        bonus = score1;
        if (bonus >= 63 && !bonus_test){
            bonus_value.setText(String.valueOf(35));
            bonus_test = true;
            score1 += 35;
            FScore.setText(String.valueOf(score1));
            lv1 = lv2 = lv3 = lv4 = lv5 = fh_c = same = same1 = same2 = same3 = same4 = same5 = same6 = ace_v = twos_v = three_v = fours_v = fives_v = sixes_v = 0;
        }
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
        h1 = h2 = h3 = h4 = h5 = false;
        cube1.setSelected(false);
        cube2.setSelected(false);
        cube3.setSelected(false);
        cube4.setSelected(false);
        cube5.setSelected(false);
        bonus = score1;

        if (bonus >= 63 && !bonus_test){
            bonus_value.setText(String.valueOf(35));
            bonus_test = true;
            score1 += 35;
            FScore.setText(String.valueOf(score1));
            lv1 = lv2 = lv3 = lv4 = lv5 = same =fh_c= same1 = same2 = same3 = same4 = same5 = same6 = ace_v = twos_v = three_v = fours_v = fives_v = sixes_v = 0;

        }
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
        h1 = h2 = h3 = h4 = h5 = false;
        cube1.setSelected(false);
        cube2.setSelected(false);
        cube3.setSelected(false);
        cube4.setSelected(false);
        cube5.setSelected(false);
        bonus = score1;

        if (bonus >= 63 && !bonus_test){
            bonus_value.setText(String.valueOf(35));
            bonus_test = true;
            score1 += 35;
            FScore.setText(String.valueOf(score1));
            lv1 = lv2 = lv3 = lv4 = lv5 = same = same1 = same2 = fh_c = same3 = same4 = same5 = same6 = ace_v = twos_v = three_v = fours_v = fives_v = sixes_v = 0;
        }
    }

    public void three_of_a_kind_hit(){
        if (h1){
            lv1 = r1;
        }
        if (h2){
            lv2 = r2;
        }
        if (h3){
            lv3 = r3;
        }
        if (h4){
            lv4 = r4;
        }
        if (h5){
            lv5 = r5;
        }
        int[] lv = {lv1,lv2,lv3,lv4,lv5};
        Arrays.sort(lv);
        for (int i = 0; i<lv.length ; i++)
        {
            switch (lv[i]){
                case 1:
                    same1++;
                case 2: same2++;
                case 3: same3++;
                case 4: same4++;
                case 5: same5++;
                case 6: same6++;
            }
        }
        if (same1 == 3){
            same = 1;
        } else if (same2 == 3) {
            same = 2;
        } else if (same3 == 3){
            same = 3;
        } else if (same4 == 3) {
            same = 4;
        } else if (same5 == 3) {
            same = 5;
        } else if (same6 == 3){
            same = 6;
        }
        if ((same1 == 3)||(same2 == 3)||(same3 == 3)||(same4 == 3)|| (same5 == 3) || (same6 == 3)){
            three_of_a_kind_value.setText(String.valueOf(same * 3));
            three_of_a_kind.setDisable(true);
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
            score2 = score2 + same * 3;
            SScore.setText(String.valueOf(score2));
            rollv = 0;
            h1 = h2 = h3 = h4 = h5 = false;
            cube1.setSelected(false);
            cube2.setSelected(false);
            cube3.setSelected(false);
            cube4.setSelected(false);
            cube5.setSelected(false);
        }
        lv1 = lv2 = lv3 = lv4 = lv5 = same = same1 = same2 = same3 = same4 = same5 = same6 = ace_v = twos_v = three_v = fours_v = fives_v = sixes_v = 0;

    }
    public void four_of_a_kind_hit(){
        if (h1){
            lv1 = r1;
        }
        if (h2){
            lv2 = r2;
        }
        if (h3){
            lv3 = r3;
        }
        if (h4){
            lv4 = r4;
        }
        if (h5){
            lv5 = r5;
        }
        int[] lv = {lv1,lv2,lv3,lv4,lv5};
        Arrays.sort(lv);
        for (int i = 0; i<lv.length ; i++)
        {
            switch (lv[i]){
                case 1:
                    same1++;
                case 2: same2++;
                case 3: same3++;
                case 4: same4++;
                case 5: same5++;
                case 6: same6++;
            }
        }
        if (same1 == 4){
            same = 1;
        } else if (same2 == 4) {
            same = 2;
        } else if (same3 == 4){
            same = 3;
        } else if (same4 == 4) {
            same = 4;
        } else if (same5 == 4) {
            same = 5;
        } else if (same6 == 4){
            same = 6;
        }

        if ((same1 == 4)||(same2 == 4)||(same3 == 4)||(same4 == 4)|| (same5 == 4) || (same6 == 4)){
            four_of_a_kind_value.setText(String.valueOf(same * 4));
            four_of_a_kind.setDisable(true);
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
            score2 = score2 + same * 4;
            SScore.setText(String.valueOf(score2));
            rollv = 0;
            h1 = h2 = h3 = h4 = h5 = false;
            cube1.setSelected(false);
            cube2.setSelected(false);
            cube3.setSelected(false);
            cube4.setSelected(false);
            cube5.setSelected(false);
        }
        lv1 = lv2 = lv3 = lv4 = lv5 = same = same1 = same2 = same3 = same4 = same5 = same6 = ace_v = twos_v = three_v = fours_v = fives_v = sixes_v = 0;

    }
    public void full_house_hit(){
        if (h1){
            lv1 = r1;
        }
        if (h2){
            lv2 = r2;
        }
        if (h3){
            lv3 = r3;
        }
        if (h4){
            lv4 = r4;
        }
        if (h5){
            lv5 = r5;
        }
        int[] lv = {lv1,lv2,lv3,lv4,lv5};
        Arrays.sort(lv);

        for (int i = 0; i<lv.length; i++)
        {
            switch (lv[i])
            {
                case 1: same1++; break;
                case 2: same2++; break;
                case 3: same3++; break;
                case 4: same4++; break;
                case 5: same5++; break;
                case 6: same6++; break;
            }
        }

        if (same1 == 3) same++;
        else if (same2 == 3) same++;
        else if (same3 == 3) same++;
        else if (same4 == 3) same++;
        else if (same5 == 3) same++;
        else if (same6 == 3) same++;

        System.out.println(same);
        if (same1 == 2) fh_c++;
        else if (same2 == 2) fh_c++;
        else if (same3 == 2) fh_c++;
        else if (same4 == 2) fh_c++;
        else if (same5 == 2) fh_c++;
        else if (same6 == 2) fh_c++;

        System.out.println(fh_c);

       if (same == 1 && fh_c == 1 ) fullhouse= true;


    if (fullhouse){
        full_house_value.setText(String.valueOf(25));
        full_house.setDisable(true);
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
        score2 = score2 +25;
        SScore.setText(String.valueOf(score2));
        rollv = 0;
        h1 = h2 = h3 = h4 = h5 = false;
        cube1.setSelected(false);
        cube2.setSelected(false);
        cube3.setSelected(false);
        cube4.setSelected(false);
        cube5.setSelected(false);

        }
        lv1 = lv2 = lv3 = lv4 = lv5 = same = same1 = same2 = same3 = same4 = same5 = same6 = ace_v = twos_v = three_v = fours_v = fives_v = sixes_v = 0;

    }

    public void small_straight_hit(){
        if (h1){
            lv1 = r1;
        }
        if (h2){
            lv2 = r2;
        }
        if (h3){
            lv3 = r3;
        }
        if (h4){
            lv4 = r4;
        }
        if (h5){
            lv5 = r5;
        }
        int[] lv = {lv1,lv2,lv3,lv4,lv5};
        Arrays.sort(lv);
        if ((lv1 - lv2 == -1 && (lv2 != 0) && (lv1 != 0) )||(lv1-lv3 == -1  && (lv3 != 0) && (lv1 != 0)) || (lv1-lv4 == -1 && (lv4 != 0) && (lv1 != 0)) || (lv1-lv5 == -1) && (lv5 != 0) && (lv1 != 0)) seq++;
        if ((lv2 - lv1 == -1 && (lv2 != 0) && (lv1 != 0))||(lv2-lv3 == -1 && (lv3 != 0) && (lv2 != 0)) || (lv2-lv4 == -1 && (lv2 != 0) && (lv4 != 0)) || (lv2-lv5 == -1) && (lv2 != 0) && (lv5 != 0)) seq++;
        if ((lv3 - lv2 == -1 && (lv3 != 0) && (lv2 != 0))||(lv3-lv1 == -1 && (lv3 != 0) && (lv1 != 0)) || (lv3-lv4 == -1 && (lv3 != 0) && (lv4 != 0)) || (lv3-lv5 == -1) && (lv3 != 0) && (lv5 != 0)) seq++;
        if ((lv4 - lv2 == -1 && (lv2 != 0) && (lv4 != 0))||(lv4-lv3 == -1 && (lv3 != 0) && (lv4 != 0)) || (lv4-lv1 == -1 && (lv1 != 0) && (lv4 != 0)) || (lv4-lv5 == -1) && (lv5 != 0) && (lv4 != 0)) seq++;
        if ((lv5 - lv2 == -1  && (lv5 != 0) && (lv2 != 0))||(lv5-lv3 == -1  && (lv5 != 0) && (lv3 != 0)) || (lv5-lv4 == -1  && (lv5 != 0) && (lv4 != 0)) || (lv5-lv1 == -1  && (lv5 != 0) && (lv1 != 0))) seq++;


        if (seq == 3) {
            small_straight_value.setText(String.valueOf(30));
            small_straight.setDisable(true);
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
            score2 = score2 +30;
            SScore.setText(String.valueOf(score2));
            rollv = 0;
            h1 = h2 = h3 = h4 = h5 = false;
            cube1.setSelected(false);
            cube2.setSelected(false);
            cube3.setSelected(false);
            cube4.setSelected(false);
            cube5.setSelected(false);
        }

        lv1 = lv2 = lv3 = lv4 = lv5 = same = same1 = same2 = same3 = same4 = same5 = same6 = ace_v = twos_v = three_v = fours_v = fives_v = sixes_v = seq = 0;
    }
    public void large_straight_hit(){
        if (h1){
            lv1 = r1;
        }
        if (h2){
            lv2 = r2;
        }
        if (h3){
            lv3 = r3;
        }
        if (h4){
            lv4 = r4;
        }
        if (h5){
            lv5 = r5;
        }
        int[] lv = {lv1,lv2,lv3,lv4,lv5};
        Arrays.sort(lv);
        if ((lv1 - lv2 == -1 && (lv2 != 0) && (lv1 != 0) )||(lv1-lv3 == -1  && (lv3 != 0) && (lv1 != 0)) || (lv1-lv4 == -1 && (lv4 != 0) && (lv1 != 0)) || (lv1-lv5 == -1) && (lv5 != 0) && (lv1 != 0)) seq++;
        if ((lv2 - lv1 == -1 && (lv2 != 0) && (lv1 != 0))||(lv2-lv3 == -1 && (lv3 != 0) && (lv2 != 0)) || (lv2-lv4 == -1 && (lv2 != 0) && (lv4 != 0)) || (lv2-lv5 == -1) && (lv2 != 0) && (lv5 != 0)) seq++;
        if ((lv3 - lv2 == -1 && (lv3 != 0) && (lv2 != 0))||(lv3-lv1 == -1 && (lv3 != 0) && (lv1 != 0)) || (lv3-lv4 == -1 && (lv3 != 0) && (lv4 != 0)) || (lv3-lv5 == -1) && (lv3 != 0) && (lv5 != 0)) seq++;
        if ((lv4 - lv2 == -1 && (lv2 != 0) && (lv4 != 0))||(lv4-lv3 == -1 && (lv3 != 0) && (lv4 != 0)) || (lv4-lv1 == -1 && (lv1 != 0) && (lv4 != 0)) || (lv4-lv5 == -1) && (lv5 != 0) && (lv4 != 0)) seq++;
        if ((lv5 - lv2 == -1  && (lv5 != 0) && (lv2 != 0))||(lv5-lv3 == -1  && (lv5 != 0) && (lv3 != 0)) || (lv5-lv4 == -1  && (lv5 != 0) && (lv4 != 0)) || (lv5-lv1 == -1  && (lv5 != 0) && (lv1 != 0))) seq++;


        if (seq == 4) {
            large_straight_value.setText(String.valueOf(40));
            large_straight.setDisable(true);
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
            score2 = score2 +40;
            SScore.setText(String.valueOf(score2));
            rollv = 0;
            h1 = h2 = h3 = h4 = h5 = false;
            cube1.setSelected(false);
            cube2.setSelected(false);
            cube3.setSelected(false);
            cube4.setSelected(false);
            cube5.setSelected(false);
        }

        lv1 = lv2 = lv3 = lv4 = lv5 = same = same1 = same2 = same3 = same4 = same5 = same6 = ace_v = twos_v = three_v = fours_v = fives_v = sixes_v = seq = 0;
    }

    public void yahtzee_hit(){
        if (h1) lv1 = r1;
        if (h2) lv2 = r2;
        if (h3) lv3 = r3;
        if (h4) lv4 = r4;
        if (h5) lv5 = r5;
        yahtzee_hit = true;

        int[] lv = {lv1,lv2,lv3,lv4,lv5};

        if ((lv1 == lv2 && lv2 == lv3 && lv3 == lv4 && lv4 == lv5) == (lv1 != 0) && (lv2 != 0) && (lv3 != 0) && (lv4 != 0) && (lv5 != 0)) {
            yahtzee_value.setText(String.valueOf(50));
            yahtzee.setDisable(true);
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
            score2 = score2 +50;
            SScore.setText(String.valueOf(score2));
            rollv = 0;
            h1 = h2 = h3 = h4 = h5 = false;
            cube1.setSelected(false);
            cube2.setSelected(false);
            cube3.setSelected(false);
            cube4.setSelected(false);
            cube5.setSelected(false);

        }
        lv1 = lv2 = lv3 = lv4 = lv5 = same = same1 = same2 = same3 = same4 = same5 = same6 = ace_v = twos_v = three_v = fours_v = fives_v = sixes_v = 0;
    }

    public void chance_hit(){
    if (h1) lv1 = r1;
    if (h2) lv2 = r2;
    if (h3) lv3 = r3;
    if (h4) lv4 = r4;
    if (h5) lv5 = r5;

    chance_value.setText(String.valueOf(lv1 + lv2 + lv3 + lv4 + lv5));
    chance.setDisable(true);
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
    score2 = score2 +lv1 + lv2 +lv3 +lv4 + lv5;
    SScore.setText(String.valueOf(score2));
    rollv = 0;
    h1 = h2 = h3 = h4 = h5 = false;
    cube1.setSelected(false);
    cube2.setSelected(false);
    cube3.setSelected(false);
    cube4.setSelected(false);
    cube5.setSelected(false);
lv1 = lv2 = lv3 = lv4 = lv5 = same = same1 = same2 = same3 = same4 = same5 = same6 = ace_v = twos_v = three_v = fours_v = fives_v = sixes_v = 0;
}

    public void yahtzee_bonus_hit(){
        if (yahtzee_hit){
            if (h1) lv1 = r1;
            if (h2) lv2 = r2;
            if (h3) lv3 = r3;
            if (h4) lv4 = r4;
            if (h5) lv5 = r5;

            int[] lv = {lv1,lv2,lv3,lv4,lv5};

            if ((lv1 == lv2 && lv2 == lv3 && lv3 == lv4 && lv4 == lv5) == (lv1 != 0) && (lv2 != 0) && (lv3 != 0) && (lv4 != 0) && (lv5 != 0)){
                yahtzee_bonus_count += 100;
                yahtzee_bonus_value.setText(String.valueOf(yahtzee_bonus_count));
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
                score2 = score2 +100;
                SScore.setText(String.valueOf(score2));
                rollv = 0;
                h1 = h2 = h3 = h4 = h5 = false;
                cube1.setSelected(false);
                cube2.setSelected(false);
                cube3.setSelected(false);
                cube4.setSelected(false);
                cube5.setSelected(false);

            }
            lv1 = lv2 = lv3 = lv4 = lv5 = same = same1 = same2 = same3 = same4 = same5 = same6 = ace_v = twos_v = three_v = fours_v = fives_v = sixes_v = 0;
        }
    }

    public void total_score_hit(){
        total_score_value.setText(String.valueOf(score1+score2));
    }
}