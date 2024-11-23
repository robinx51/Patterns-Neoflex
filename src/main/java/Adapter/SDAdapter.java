package Adapter;

public class SDAdapter extends USBCard {
    private final SDCard sdCard;

    public SDAdapter(SDCard sdCard) {
        this.sdCard = sdCard;
    }
    @Override
    public void set() {
        sdCard.set();
    }
}
