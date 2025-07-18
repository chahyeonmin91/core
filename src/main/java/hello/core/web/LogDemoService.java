package hello.core.web;

import hello.core.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
@RequiredArgsConstructor

public class LogDemoService {
//    private final ObjectProvider<MyLogger> myLoggerProvider;
//
//    public void logic(String id) {
//        MyLogger myLogger = myLoggerProvider.getObject();
//        myLogger.log("service id = " + id);
//    }

    private final MyLogger myLogger;
    public void logic(String id) {
        myLogger.log("service id = " + id);
    }
}
