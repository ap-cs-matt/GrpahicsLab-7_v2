import java.awt.*;
import java.applet.*;

public class GraphicsLab07_Matthew_Pearce_v2 extends Applet {

	public void paint(Graphics g) {
		drawSquare1(g, 1024, 768);
	}

	public void drawSquare1(Graphics g, int maxX, int maxY) {
		int midX = maxX / 2;
		int midY = maxY / 2;
		int startWidth = maxX / 4;
		int startHeight = maxY / 4;
		int tlX = midX - (startWidth / 2);
		int tlY = midY - (startHeight / 2);
		g.fillRect(tlX, tlY, startWidth, startHeight);
		Draw(g, tlX, tlY, startWidth, startHeight, "top left");
		Draw(g, tlX, tlY, startWidth, startHeight, "bottom right");		//since top left that is called first doesnt call the bottom right
	}

	public void Draw(Graphics g, int maxX, int maxY, int width, int height,String direction) {
		
		if (width >= 1) {
			switch (direction){
			case "top left":{
				Draw(g, maxX - width / 2, maxY - height / 2, width / 2, height / 2, "top left");	//top left
				Draw(g, maxX + width, maxY - height / 2, width / 2, height / 2, "top right");		//top right
				Draw(g, maxX - width / 2, maxY + height, width / 2, height / 2, "bottom left");		//bottom left
				g.fillRect(maxX, maxY, width, height);
				break;
			}
			
			case "top right":{
				Draw(g, maxX - width / 2, maxY - height / 2, width / 2, height / 2, "top left");	//top left
				Draw(g, maxX + width, maxY - height / 2, width / 2, height / 2, "top right");		//top right
				Draw(g, maxX + width, maxY + height, width / 2, height / 2, "bottom right");		//bottom right
				g.fillRect(maxX, maxY, width, height);
				break;
			}
			case "bottom right":{
				Draw(g, maxX + width, maxY - height / 2, width / 2, height / 2, "top right");		//top right
				Draw(g, maxX + width, maxY + height, width / 2, height / 2, "bottom right");		//bottom right
				Draw(g, maxX - width / 2, maxY + height, width / 2, height / 2, "bottom left");		//bottom left
				g.fillRect(maxX, maxY, width, height);
				break;
			}
			case "bottom left":{
				Draw(g, maxX - width / 2, maxY - height / 2, width / 2, height / 2, "top left");	//top left
				Draw(g, maxX + width, maxY + height, width / 2, height / 2, "bottom right");		//bottom right
				Draw(g, maxX - width / 2, maxY + height, width / 2, height / 2, "bottom left");		//bottom left
				g.fillRect(maxX, maxY, width, height);
			}
				
			}
		}
	}
}
