/* Decompiled by Jasmine from Video2.class */
/* Originally compiled from Video2.java */

package MPEGDecoder;

import java.io.*;
import java.awt.Label;
import java.net.URL;
import java.util.Date;

public class Video implements Runnable 
{
    


    public final void stopmovie()
    {
       
        try
        {
            instream.close();
        }
        catch (IOException e)
        {
        }
        gop.setstream(null);
        instream = null;
    }
}
