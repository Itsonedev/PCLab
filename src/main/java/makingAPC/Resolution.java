package makingAPC;

public class Resolution {
    private int width;
    private int height;
public Resolution(){
}
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
    this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
    this.height = height;
    }

    @Override
    public String toString() {
        return "Resolution{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
