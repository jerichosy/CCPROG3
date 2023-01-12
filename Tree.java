public class Tree {
    private String trunkColor;
    private String leafColor;
    private int height;

    public String getTrunkColor() {
        return trunkColor;
    }
    public void setTrunkColor(String trunkColor) {
        this.trunkColor = trunkColor;
    }
    public String getLeafColor() {
        return leafColor;
    }
    public void setLeafColor(String leafColor) {
        this.leafColor = leafColor;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
    public void grow(int growAmount) {
        this.height += growAmount;
    }
}