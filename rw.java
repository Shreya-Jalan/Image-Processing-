import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
public class rw
{
    public static void main(String args[])throws IOException
    {
        int width=963;
        int height=640;
        BufferedImage img=null;
        try{
            File in=new File("C:\\Users\\hp\\Desktop\\img.png");
            img=new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
            img=ImageIO.read(in);
            System.out.println("Reading done");

        }
        catch(IOException e)
        {
            System.out.println("Error: +e");

    }
        try
        {
            File outt=new File("C:\\Users\\hp\\Desktop\\outp.jpg");
            ImageIO.write(img,"jpg",outt);
            System.out.println("Writing done");
            
        }
        catch(IOException e)
        {
            System.out.println("Error: +e");
        }

    }
}
