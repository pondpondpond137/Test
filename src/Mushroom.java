public class Mushroom extends Item {
    Color mushroomColor;

    public Mushroom(Color mushroomColor) {
        this.mushroomColor = mushroomColor;
    }

    @Override
    public void show() {
        setAppear(true);
        System.out.printf("Block is cracked! %s Mushroom is appearing.", this.mushroomColor);
        if (this.mushroomColor == Color.Green) {
            System.out.println("Gain 1 extra life ");
        }else if (this.mushroomColor == Color.Red){
            System.out.println("Break block! ");
        }

    }

    public void setMushroomColor(Color mushroomColor) {
        this.mushroomColor = mushroomColor;
    }
}