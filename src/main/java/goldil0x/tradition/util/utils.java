package goldil0x.tradition.util;
import goldil0x.tradition.reference;

import org.apache.logging.log4j.Logger;

public class utils {
    private static Logger Logger;

    public static Logger getLogger() {
        if(Logger == null){
            Logger = org.apache.logging.log4j.LogManager.getFormatterLogger(reference.MODID);
        }
        return Logger;
    }
}
