package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;


public class ShapeFactory {

    public static Shape create(RegularShapeType type){
    	Shape figura;  
        switch(type){
            case Triangle:
                figura = new Triangle();
                break;
            case Quadrilateral:
                figura = new Quadrilateral();
                break;
            case Pentagon:
                figura = new Pentagon();
                break;
            case Hexagon:
                figura = new Hexagon();
                break;
            default:
                figura = null;
        }
        return figura;             
    }
}
