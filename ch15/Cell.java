import java.awt.Color;
import java.awt.Graphics;

/**
 * A square at a fixed location that changes color.
 */
public class Cell {

	public static final Color colors[] = {Color.WHITE, Color.BLACK};

    private final int x;
    private final int y;
    private final int size;
    private int state;

    /**
     * Constructs a new cell, initially turned off.
     * 
     * @param x the X coordinate
     * @param y the Y coordinate
     * @param size number of pixels
     */
    public Cell(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.state = 0;
    }

    /**
     * Draws the cell on the screen.
     * 
     * @param g graphics context
     */
    public void draw(Graphics g) {
    	Color color = colors[this.state];
        g.setColor(color);
        g.fillRect(x + 1, y + 1, size - 1, size - 1);
        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(x, y, size, size);
    }

    /**
     * @return true if the cell is OFF
     */
    public boolean isOff() {
        return state == 0;
    }

    /**
     * @return true if the cell is ON
     */
    public boolean isOn() {
        return state == 1;
    }

    /**
     * Sets the cell's state to OFF.
     */
    public void turnOff() {
        state = 0;
    }

    /**
     * Sets the cell's state to ON.
     */
    public void turnOn() {
        state = 1;
    }
}
