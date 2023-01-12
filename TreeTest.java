public class TreeTest {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.setTrunkColor("\nBrown");
        tree.setLeafColor("Green");
        tree.setHeight(3);

        System.out.println(tree.getTrunkColor());
        System.out.println(tree.getLeafColor());
        System.out.println(tree.getHeight());

        tree.grow(2);
        System.out.println(tree.getHeight());

        tree.grow(4);
        System.out.println(tree.getHeight());
    }
}