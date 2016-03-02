package image;

import image.Image;

import java.util.*;

public class Image implements ImageInterface {


    // A COMPLETER

    /**
     * @param threshold
     * @return
     */
    public Image edge(int threshold) {
	// ...
    }

    /**
     * @param threshold
     * @return
     */
    public Image decreaseGrayLevels(int nbGrayLevels) {
	// ...
    }

    // ======================================================================
    /** Reads a PGM image from file.
     * It is assumed that file respects the following PGM file syntax:
     *  <ul><li> first line with string "P2"</li>
     *  <li>second line : a comment</li> 
     *  <li>one int for width <code>w</code>, one int for height<code>h</code></li>
     *  <li>one int for max gray level (not used here, we consider this level to be 255 in our images)</li>
     *  <li><code>w</code> x <code>h</code> integers between 0 and max (for us =255) for each pixel</li></ul>
     *  
     *  @param fileName the name of the image file in PGM format
     */
    public static Image initImagePGM(String fileName) {
        Scanner scan = new Scanner(Image.class.getResourceAsStream(fileName));

        scan.nextLine(); // line P2
        scan.nextLine(); // line comment
        // read width
        int width = scan.nextInt();
        // read height        
        int height = scan.nextInt();
        // read max gray level (not used)
        scan.nextInt(); 
        // create an initially white image
        Image result = new Image(width, height); 
        // rad pixels
        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                result.changeColorPixel(y, x, scan.nextInt());
            }
        }
        return result;
    }


}
