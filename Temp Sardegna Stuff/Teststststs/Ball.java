import java.awt.Color;
import java.awt.Graphics;
/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball
{
    Color white = new Color(255);
    Color orange = new Color(255, 165, 0);

    float x;
    float y;
    float dx;
    float dy;
    float diam;

    void setup() {
        //size(500, 500);
        //smooth();
        x = 100;
        y = 100;
        dx = 1;
        dy = 2;
        diam = 50;
    }

    void draw() {
        //background(white);

        //noStroke();
        // fill(orange);
        //ellipse(x, y, diam, diam);

        x += dx;
        y += dy;

        // hit the left edge?
        if (x - diam / 2 <= 0) {
            dx = -dx;
            x = diam / 2;
        }

        // hit the right edge?
        if (x + diam / 2 >= 499) {
            dx = -dx;
            x = 499 - diam / 2;
        }

        // hit the top edge?
        if (y - diam / 2 <= 0) {
            dy = -dy;
            diam += 10;
            y = diam / 2;
        }

        // hit the bottom edge?
        if (y + diam / 2 >= 499) {
            dy = -dy;
            y = 499 - diam / 2;
        }
    }
}
