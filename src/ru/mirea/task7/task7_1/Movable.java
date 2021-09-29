package ru.mirea.task7.task7_1;
public interface Movable {
    public void moveUp();
    public void moveDown();
    public void moveRight();
    public void moveLeft();
}
class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    public MovablePoint(int x,int y,int xSpeed,int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public void moveUp() {
        y=y+ySpeed;
    }
    public void moveDown() {
        y=y-ySpeed;
    }
    public void moveLeft() {
        x = x - xSpeed;
    }
    public void moveRight() {
        x=x+xSpeed;
    }
}
class MovableCircle extends MovablePoint implements Movable{
private int radius;
private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed,int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius=radius;
         this.center = new MovablePoint(x,y,xSpeed,ySpeed);
    }

    public String toString() {
        return "MovableCircle{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                "radius=" + radius + "}";

    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }
    public void moveLeft() {
        center.moveLeft();
    }
    public void moveRight() {
        center.moveRight();
    }
}
class MoveableRectangle extends MovablePoint implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MoveableRectangle(int x1, int y1,int x2,int y2, int xSpeed, int ySpeed) {
        super(x1, y1, xSpeed, ySpeed);
        this.topLeft=new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.bottomRight=new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    public String toString() {
        return "MoveableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}