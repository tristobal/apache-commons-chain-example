package cl.ido.chain.client;

import cl.ido.chain.domain.DummySession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class DummySessionClient {

    private static Logger logger = LogManager.getLogger(DummySessionClient.class);

    public DummySession getSession() throws InterruptedException {
        logger.info("Simulando la creación de la sesión");
        TimeUnit.SECONDS.sleep(1);
        DummySession session = new DummySession();
        session.setToken("admin123");
        return session;
    }
}
