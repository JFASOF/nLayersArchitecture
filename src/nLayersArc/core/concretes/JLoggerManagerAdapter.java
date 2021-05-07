package nLayersArc.core.concretes;

import nLayersArc.core.abstracts.LoggerService;
import nLayersArc.jLogger.JLoggerManager;

//Adapter Başka servisleri sisteme adapte etmek
public class JLoggerManagerAdapter implements LoggerService {
    @Override
    public void logToSys(String message) {
        JLoggerManager jLoggerManager=new JLoggerManager();
        jLoggerManager.log(message);

    }
}
