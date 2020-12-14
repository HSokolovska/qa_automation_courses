package com.courses.HomeWorkFour;

import com.courses.HomeWorkFour.Drum;
import com.courses.HomeWorkFour.Guitar;
import com.courses.HomeWorkFour.IInstrument;

public class InitializeOfInstruments {
    public static void main(String[] args) {
        IInstrument[] instruments = {new Drum(), new Trumpet(), new Guitar()};
        for (IInstrument instrument : instruments) {
            instrument.play();

        }

    }

}
