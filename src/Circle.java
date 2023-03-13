public class Circle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing circle");
        System.out.println("Number of a= "+a);
    }
    public static void main(String[] args) {
        Drawable circle = new Circle();
        circle.draw();
    }

}
