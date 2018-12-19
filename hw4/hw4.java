
public class ShapeTest1 {
	public static void main(String[] args) {
		
//		Point objects
		Point pt1 = new Point();
		System.out.println("Point 1 " + pt1);
		
		Point pt2 = new Point(10, 50);
		System.out.println("Point 2 " + pt2);
		
		Point pt3 = new Point(20);
		System.out.println("Point 3 " + pt3);
		
		System.out.println("");
		
//		Circle objects
		Circle cc1 = new Circle();
		System.out.println("Circle Center = " + cc1);
		System.out.println("Circle1 Area " + cc1.getArea());
		
		Circle cc2 = new Circle(10);
		System.out.println("Circle Center " + cc2);
		System.out.println("Circle2 Area " +cc2.getArea());
		
		Circle cc3 = new Circle(pt2, 20);
		System.out.println("Circle Center " + cc3);
		System.out.println("Circle3 Area " +cc3.getArea());
		
		System.out.println("");
		
//		Rectangle objects
		Rectangle rt1 = new Rectangle();
		System.out.println(rt1);
		System.out.println("Rectangle1 Area " +rt1.getArea());
		
		Rectangle rt2 = new Rectangle(10);
		System.out.println(rt2);
		System.out.println("Rectangle2 Area " +rt2.getArea());
		
		Rectangle rt3 = new Rectangle(20,20);
		System.out.println(rt3);
		System.out.println("Rectangle3 Area " +rt3.getArea());
		
		Rectangle rt4 = new Rectangle(pt2, 30, 30);
		System.out.println(rt4);
		System.out.println("Rectangle4 Area " +rt4.getArea());
		
		System.out.println("");
		
//		Square objects
		Square sq1 = new Square();
		System.out.println(sq1);
		System.out.println("Square Area1 " +sq1.getArea());
		
		Square sq2 = new Square(10);
		System.out.println(sq2);
		System.out.println("Square Area2 " +sq2.getArea());
		
		Square sq3 = new Square(pt2, 20);
		System.out.println(sq3);
		System.out.println("Square Area3 " +sq3.getArea());
		
		System.out.println("-----------------------------Test getter setter objects-----------------------------");
		
//		Point setter getter objects
		pt1.setX(55);
		int pointx1 = pt1.getX();
		pt1.setY(55);
		int pointy1 = pt1.getY();
		System.out.println("After fix Point1 " + pt1);
		
		pt2.setX(66);
		int pointx2 = pt2.getX();
		pt2.setY(66);
		int pointy2 = pt2.getY();
		System.out.println("After fix Point2 " + pt2);
		
		pt3.setX(77);
		int pointx3 = pt3.getX();
		pt3.setY(77);
		int pointy3 = pt3.getY();
		System.out.println("After fix Point3 " + pt3);
		
//		Circle setter getter objects
		cc1.setRadius(30);
		float radius1 = cc1.getRadius();
		System.out.println("After fix Circle1 Radius " + cc1);
		
		cc2.setRadius(40);
		float radius2 = cc2.getRadius();
		System.out.println("After fix Circle2 Radius " + cc2);
		
		cc3.setRadius(50);
		float radius3 = cc3.getRadius();
		System.out.println("After fix Circle3 Radius " + cc3);
		
//		Rectangle setter getter objects
		rt1.setHeight(55);
		float height1 = rt1.getHeight();
		rt1.setWidth(55);
		float width1 = rt1.getWidth();
		System.out.println("After fix Rectangle1 height and width = " + rt1);
		
		rt2.setHeight(66);
		float height2 = rt2.getHeight();
		rt2.setWidth(66);
		float width2 = rt2.getWidth();
		System.out.println("After fix Rectangle2 height and width = " + rt2);
		
		rt3.setHeight(77);
		float height3 = rt1.getHeight();
		rt3.setWidth(77);
		float width3 = rt3.getWidth();
		System.out.println("After fix Rectangle3 height and width = " + rt3);
		
		rt4.setHeight(88);
		float height4 = rt1.getHeight();
		rt4.setWidth(88);
		float width4 = rt3.getWidth();
		System.out.println("After fix Rectangle4 height and width = " + rt4);
		
//		Square setter getter objects
		sq1.setSquare(30);
		float facet1 = sq1.getSquare();
		System.out.println("After fix Square1 facet " + sq1);
		
		sq2.setSquare(40);
		float facet2 = sq2.getSquare();
		System.out.println("After fix Square2 facet " + sq2);
		
		sq3.setSquare(50);
		float facet3 = sq3.getSquare();
		System.out.println("After fix Square3 facet " + sq3);
		
		
	}
}

class Point {
	private int x;
	private int y;
	
	public Point() {
		x = 1;
		y = 1;
	}
	
	public Point(int a) {
		x = a;
		y = a;
	}
	
	public Point(int a, int b) {
		x = a;
		y = b;
	}
	
//	getter method
	public int getX(){
		return x;
	}
	
	public int getY() {
		return y;
	}
	
//	setter method
	public void setX(int a) {
		x = a;
	}
	
	public void setY(int b) {
		y = b;
	}
	
//	toString method
	public String toString() {
		return ("(x,y) = ("+ x +","+ y +")");
		
	}
}

class Circle {
	private Point center;
	private float radius;
	
	public Circle() {
		center = new Point(10,10);
		radius = 5;
	}
	
	public Circle(float r) {
		radius = r;
		center = new Point(20,20);
	}
	
	public Circle(Point pos, float r) {
		center = pos;
		radius = r;
	}
	
//	getter method
	public float getRadius() {
		return radius;
	}
	
//	setter method
	public void setRadius(float a) {
		radius = a;
	}
	
//	toString method
	public String toString() {
		return("= "+ center + " radius = "+radius);
	}
	
//	getArea method
	public double getArea() {
		return 3.14*radius*radius;
	}
}

class Rectangle {
	private Point position;
	private float height;
	private float width;
	
	public Rectangle(){
		position = new Point(10, 10);
		height = 5;
		width = 10;
	}
	
	public Rectangle(float h){
		height = h;
		position = new Point(20,20);
		width = 10;
	}
	
	public Rectangle(float h, float w) {
		height = h;
		width = w;
		position = new Point(30,30);
	}
	
	public Rectangle(Point pos, float h, float w) {
		position = pos;
		height = h;
		width = w;
	}
	
//	getter method
	public float getHeight() {
		return height;
	}
	
	public float getWidth() {
		return width;
	}
	
//	setter method
	public void setHeight(float h) {
		height = h;
	}
	
	public void setWidth(float w) {
		width = w;
	}
	
	
	
//	toString method
	public String toString() {
		return("Rectahgle Position = "+ position + " height = "+ height + " width = "+ width);
	}
	
//	getArea method
	public float getArea() {
		return width*height;
	}
}

class Square {
	private Point position;
	private float facet;
	
	public Square() {
		position = new Point(10,10);
		facet = 5;
	}
	
	public Square(float a) {
		position = new Point(20, 20);
		facet = a;
	}
	
	public Square(Point pos, float a) {
		position = pos;
		facet = a;
	}
	
//	getter method
	public float getSquare(){
		return facet;
	}
	
//	setter method
	public void setSquare(float a) {
		facet = a;
	}
	
//	toString method
	public String toString() {
		return("Square Position = "+ position + " facet = "+facet);
	}
	
//	getArea method
	public float getArea() {
		return facet*facet;
	}
}

