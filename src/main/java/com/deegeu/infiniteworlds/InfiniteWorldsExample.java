/*
 * The MIT License
 *
 * Copyright 2014 DJ Spiess and DeegeU.com.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.deegeu.infiniteworlds;

import java.util.Random;

/**
 * This is the code example for the video lesson "The secret to No Man's Sky 
 * and creating infinite video games" on DeegeU.com. This code demonstrates
 * how you can use pseudo-random numbers to generate a game universe.
 * 
 * @author dspiess
 */
public class InfiniteWorldsExample {
    static final char[] galaxyType = { 'S', 'E', 'I' };
    
    /**
     * Main application to print out the generated universe. The universe
     * consists of a random galaxy at each position. The universe is a 
     * 5x5 matrix, but this can scale to any size that fits into a computer.
     * 
     * @param args unused
     */
    public static void main(String[] args) {        
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                System.out.print( getGalaxy(i, j) + " ");
            }
            System.out.println("");
        }
        
    }
    
    /**
     * Gets the galaxy at a specified x,y coordinate in the game universe.
     * Each galaxy can be one of three types. Since we are setting the 
     * seed of the random number generator to the x-y position, we always
     * generate the same galaxy for the given position in the universe.
     * 
     * @param x the X coordinate
     * @param y the Y coordinate
     * @return a character representing the generated galaxy
     */
    static private char getGalaxy(int x, int y) {
        Random rnd = new Random();
        rnd.setSeed(x + (y * 5));
        return galaxyType[rnd.nextInt(3)];
    }
}
