package Units;
public class Coordinate {
    
    public int x;
    public int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    } 

    public float getDistance (Coordinate coordinateEnemy) {
        float dx = coordinateEnemy.x - this.x;
        float dy = coordinateEnemy.y - this.y;
        
        return (float)Math.sqrt(dx*dx+dy*dy);
    }
}
