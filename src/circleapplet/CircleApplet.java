// Copyright (c) 2010, Ryan J ryanjayako@gmail.com 
//===== Description: ========================================= 
//
//===== Additional Comments: ================================= 
//
//============================================================ 

package circleapplet;

import java.awt.*;

import javax.swing.*;

public class CircleApplet extends JApplet {

	public void init() {
		setSize(600, 600); // setting window size
	}

	public void paint(Graphics g) {

		int x = 50, y = 50, width = 300, height = 300;// , startAngle = 98,
														// arcAngle = 180;
		Color red = new Color(255, 0, 0);
		Color blue = new Color(0, 0, 255);
		Color green = new Color(0, 255, 0);
		Color black = new Color(45, 45, 45);
		int arcRndNum1 = 0, arcRndNum2 = 0;

		// slice 1
		int slice1StartAngle = (int) (Math.random() * 360);
		int slice1ArcAngle = (int) (Math.random() * 360);

		// slice 2
		int slice2StartAngle = 0;
		if(slice1StartAngle + slice1ArcAngle > 360){
			 slice2StartAngle = (slice1StartAngle + slice1ArcAngle) - 360;
		}
		else
			slice2StartAngle = slice1StartAngle + slice1ArcAngle;

		arcRndNum1 = 360 - slice1ArcAngle;
		int slice2ArcAngle = (int) (Math.random() * arcRndNum1);

		// slice 3
		int slice3StartAngle = 0;
		if(slice1StartAngle + slice1ArcAngle
				+ slice2ArcAngle > 360)
		slice3StartAngle = (slice1StartAngle + slice1ArcAngle
				+ slice2ArcAngle) - 360;
		else
			slice3StartAngle = slice1StartAngle + slice1ArcAngle
					+ slice2ArcAngle;
			

		arcRndNum2 = 360 - (slice1ArcAngle + slice2ArcAngle);

		int slice3ArcAngle = (int) (Math.random() * arcRndNum2);

		// slice 4
		int slice4StartAngle = 0;
		if(slice1StartAngle + slice1ArcAngle
				+ slice2ArcAngle + slice3ArcAngle > 360)
		slice4StartAngle = (slice1StartAngle + slice1ArcAngle
				+ slice2ArcAngle + slice3ArcAngle) - 360;
		else
			slice4StartAngle = slice1StartAngle + slice1ArcAngle
		+ slice2ArcAngle + slice3ArcAngle;

		int slice4ArcAngle = 360 - (slice1ArcAngle + slice2ArcAngle + slice3ArcAngle);

		g.setColor(black);
		g.fillArc(x, y, width, height, slice1StartAngle, slice1ArcAngle);

		g.setColor(red);
		g.fillArc(x, y, width, height, slice2StartAngle, slice2ArcAngle);

		g.setColor(blue);
		g.fillArc(x, y, width, height, slice3StartAngle, slice3ArcAngle);

		g.setColor(green);
		g.fillArc(x, y, width, height, slice4StartAngle, slice4ArcAngle);

		System.out.println("BLACK :Start Angle is: " + slice1StartAngle
				+ "   Arc Angle is: " + slice1ArcAngle);
		System.out
				.println("=================================================================================");
		System.out.println("RED :Start Angle is: " + slice2StartAngle
				+ "   Arc Angle is: " + slice2ArcAngle + " random number: "
				+ arcRndNum1);
		System.out
				.println("=================================================================================");
		System.out.println("BLUE :Start Angle is: " + slice3StartAngle
				+ "   Arc Angle is: " + slice3ArcAngle + " random number: "
				+ arcRndNum2);
		System.out
				.println("=================================================================================");
		System.out.println("GREEN :Start Angle is: " + slice4StartAngle
				+ "   Arc Angle is: " + slice4ArcAngle);
		System.out
				.println("=================================================================================");
		System.out
				.println("=================================================================================");

	}
}
