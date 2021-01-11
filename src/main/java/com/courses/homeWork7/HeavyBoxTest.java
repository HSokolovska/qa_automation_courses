package com.courses.homeWork7;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class HeavyBoxTest {
    public static void main(String[] args) {
        ArrayList HeavyBoxes = new ArrayList();
        HeavyBox box1 = new HeavyBox(10);
        HeavyBox box2 = new HeavyBox(20);
        HeavyBox box3 = new HeavyBox(30);
        HeavyBoxes.add(box1);
        HeavyBoxes.add(box2);
        HeavyBoxes.add(box3);

        HeavyBox currentValue = (HeavyBox) HeavyBoxes.get(0);
        HeavyBoxes.set(0, new HeavyBox(currentValue.weight + 1));
        ShowBoxes(HeavyBoxes);

        HeavyBoxes.remove(2);
        ShowBoxes(HeavyBoxes);

        HeavyBoxes.clear();
        ShowBoxes(HeavyBoxes);
    }

    public static void ShowBoxes(ArrayList HeavyBoxes) {
        System.out.println("------------------------");
        for (int i = 0; i < HeavyBoxes.size(); i++) {
            System.out.println(((HeavyBox) HeavyBoxes.get(i)).weight);
        }
    }
}
