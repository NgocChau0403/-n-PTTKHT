/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package style;


/*
 *  soapUI, copyright (C) 2004-2009 eviware.com 
 *
 *  soapUI is free software; you can redistribute it and/or modify it under the 
 *  terms of version 2.1 of the GNU Lesser General Public License as published by 
 *  the Free Software Foundation.
 *
 *  soapUI is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without 
 *  even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 *  See the GNU Lesser General Public License for more details at gnu.org.
 */

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;

import javax.swing.JLabel;

public class GradientLabel extends JLabel {
    private Color start;
    private Color end;

    public GradientLabel(String text, Color start, Color end) {
        super(text);
        this.start = start;
        this.end = end;
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (isOpaque()) {
            int width = getWidth();
            int height = getHeight();

            // Create the gradient paint
            GradientPaint paint = new GradientPaint(0, 0, start, 0, height, end);

            // Cast to Graphics2D
            Graphics2D g2d = (Graphics2D) g.create();

            // Set the paint to use for this operation
            g2d.setPaint(paint);

            // Fill the background using the paint
            g2d.fillRect(0, 0, width, height);

            // Dispose Graphics2D object
            g2d.dispose();
        }

        super.paintComponent(g);
    }

    // Example usage
    public static void main(String[] args) {
        GradientLabel label = new GradientLabel("Gradient Label", new Color(24, 220, 220), new Color(137, 93, 253));
        // Add label to JFrame or any other container
    }
}
