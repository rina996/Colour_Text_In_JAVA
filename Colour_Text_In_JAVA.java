import java.applet.applet;
publice class AnimatedImage extends Applet implements Runnable
{
    MediaTRacker mt = null;
    Image img[] = new Image[3];
    int animate = null;
    Thread animate = null;

    public voice init()
    {
        mt = new MediaTRacker(this);
        img[0] = getImage( getCodeBAse(),"1.jpg");
        img[1] = getImage( getCodeBAse(),"2.jpg");
        img[2] = getImage( getCodeBAse(),"3.jpg");

    }

    public void start()
    {
        if(animate != null)
        {
            animate.stop();
            animate = null;
        }
    }

    public void run()
    {
        for (; ;)
        {
            repaint();
            if (index <2)
            index++;
            else
            index = 0;
            try
            {
                animate.sleep(1000);
            }
            catch( Exception ex) { }

        }
    }

    public void paint( Grapics g)
    {
        if( mt.checkID(0,true))
        g.drawImage( img[index], 10,10, 500, 400, this);
    }
    
    
 }