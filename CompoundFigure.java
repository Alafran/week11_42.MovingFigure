
package movingfigure;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.util.ArrayList;

public class CompoundFigure extends Figure {

    private ArrayList<Figure> figureList;
    
    public CompoundFigure() {
        super(0,0);
        this.figureList = new ArrayList<Figure>();
    }
    
    public void add(Figure f) {
       this.figureList.add(f);
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Figure figure : this.figureList) {
            figure.move(dx, dy);
        }
    }
    
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        for(Figure figure : this.figureList) {
            figure.draw(graphics);
        }
    }

}
