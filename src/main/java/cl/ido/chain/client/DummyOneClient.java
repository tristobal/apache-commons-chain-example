package cl.ido.chain.client;

import cl.ido.chain.domain.ChainRequest;
import cl.ido.chain.domain.DummySession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class DummyOneClient {

    private static Logger logger = LogManager.getLogger(DummyOneClient.class);

    public String getOne(DummySession session, ChainRequest request) throws InterruptedException {
        logger.info("Simulando el consumo de servicio externo ONE");
        TimeUnit.SECONDS.sleep(2);
        return request.getInputOne() + " / " + session.getToken();
    }
}
