package property;

import java.applet.Applet;
import java.awt.*;
/*
<applet code = "Simple Applet" width="200" height="60">
</applet>
*/  

public class SimpleApplet extends Applet {
    public void paint(Graphics g){
        g.drawString("Simple Applet",20,20);
    }
}
