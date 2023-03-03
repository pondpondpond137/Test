public class Item {
    
    private boolean appear = false;

    public void show() {
        setAppear(true);
        System.out.println("Block is cracked! Item is appearing.");
    }

    public void setAppear(boolean appear) {
        this.appear = appear;
    }
}
