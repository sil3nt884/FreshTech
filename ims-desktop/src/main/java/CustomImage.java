
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class CustomImage extends JPanel{

	private static final long serialVersionUID = 1L;
	private BufferedImage image;
    private ImageLoader loader;

    public CustomImage() {
           
       loader = new ImageLoader();
       loader.load();
       image = loader.load();
       this.setOpaque(true);
       this.setBackground(new Color(0,0,0,0));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        BufferedImage image2 = getScaledImage(image, 100, 100);
        Graphics2D g2d = (Graphics2D) g;
        int x = (this.getWidth() - image2.getWidth(null)) / 2;
        int y = (this.getHeight() - image2.getHeight(null)) / 2;
        g2d.drawImage(image2, x, y, null);
  
    }
    
    
    private BufferedImage getScaledImage(BufferedImage src, int w, int h){
        int finalw = w;
        int finalh = h;
        double factor = 1.0d;
        if(src.getWidth() > src.getHeight()){
            factor = ((double)src.getHeight()/(double)src.getWidth());
            finalh = (int)(finalw * factor);                
        }else{
            factor = ((double)src.getWidth()/(double)src.getHeight());
            finalw = (int)(finalh * factor);
        }   

        BufferedImage resizedImg = new BufferedImage(finalw, finalh, BufferedImage.TRANSLUCENT);
        Graphics2D g2 = resizedImg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(src, 0, 0, finalw, finalh, null);
        g2.dispose();
    
        return resizedImg;
    }

}