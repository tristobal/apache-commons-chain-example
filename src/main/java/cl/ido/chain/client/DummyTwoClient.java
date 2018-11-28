package cl.ido.chain.client;

import cl.ido.chain.domain.ChainRequest;
import cl.ido.chain.domain.DummySession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class DummyTwoClient {

    private static Logger logger = LogManager.getLogger(DummyTwoClient.class);

    public String getTwo(DummySession session, ChainRequest request) throws InterruptedException {
        logger.info("Simulando el consumo de servicio externo TWO");
        TimeUnit.SECONDS.sleep(3);
        return request.getInputTwo() + " / " + session.getToken();
    }
}
