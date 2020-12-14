public class InitializeOfInstruments {
    public static void main(String[] args) {
        IInstrument[] instruments = {new Drum(), new Trumpet(), new Guitar()};
        for (int i = 0; i < instruments.length; i++) {
            instruments[i].play();
            
        }

    }

}
