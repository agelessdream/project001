package polymorphism.exer1;

public class GeometricTest {
    public boolean equalsArea(GeometricObject g1,GeometricObject g2){
        return g1.findArea()== g2.findArea();
    }
    public double displayGeometricObjectArea(GeometricObject geometricObject){
        return geometricObject.findArea();
    }
}
