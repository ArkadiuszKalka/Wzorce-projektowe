package eu.infoshare.pl.singleton;

import java.util.concurrent.atomic.AtomicInteger;

public class Logger {

    private static Logger LOG_INSTANCE;


    private AtomicInteger counter = new AtomicInteger(0);

    private Logger() {
    }

    private static Logger getInstance() {
        synchronized (Logger.class) {
            if (LOG_INSTANCE == null) {
                LOG_INSTANCE = new Logger();
            }
            return LOG_INSTANCE;
        }
    }

    private AtomicInteger increment() {
        counter.incrementAndGet();
        return counter;
    }
}
