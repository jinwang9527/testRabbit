package code.common.rabbitmq;

import org.apache.log4j.Logger;
import org.springframework.util.ErrorHandler;

public class ErrorHandleListener implements ErrorHandler {

    private Logger logger = Logger.getLogger(getClass());


    @Override
    public void handleError(Throwable throwable) {
        logger.error("【ErrorHandleListener】：捕捉消息【" + throwable + "】。");
    }
}
