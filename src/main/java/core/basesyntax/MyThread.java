package core.basesyntax;

import java.time.LocalDateTime;
import java.util.concurrent.Callable;

public class MyThread implements Callable<String> {
    @Override
    public String call() throws InterruptedException {
        long delayTime = Math.round(Math.random() * 500);
        Thread.sleep(delayTime);
        return String.format("Task duration was %s ms, execution finished at %s",
                delayTime, LocalDateTime.now());
    }
}
