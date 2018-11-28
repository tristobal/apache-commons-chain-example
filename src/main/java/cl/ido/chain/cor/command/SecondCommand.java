package cl.ido.chain.cor.command;

import cl.ido.chain.client.DummyOneClient;
import cl.ido.chain.cor.DummyConstants;
import cl.ido.chain.domain.ChainRequest;
import cl.ido.chain.domain.ChainResponse;
import cl.ido.chain.domain.DummySession;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SecondCommand implements Command {

    private static Logger logger = LogManager.getLogger(SecondCommand.class);

    private DummyOneClient dummyOneClient;

    public SecondCommand(DummyOneClient dummyOneClient) {
        this.dummyOneClient = dummyOneClient;
    }

    @Override
    public boolean execute(Context context) throws Exception {
        logger.info("Segundo comando");
        DummySession session = (DummySession) context.get(DummyConstants.SESSION);
        ChainRequest request = (ChainRequest) context.get(DummyConstants.CHAIN_REQUEST);
        ChainResponse chainResponse = new ChainResponse();
        chainResponse.setOutputOne(dummyOneClient.getOne(session, request));
        context.put(DummyConstants.CHAIN_RESPONSE, chainResponse);
        return false;
    }
}
