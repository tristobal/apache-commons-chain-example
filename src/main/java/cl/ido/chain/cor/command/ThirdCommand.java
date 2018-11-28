package cl.ido.chain.cor.command;

import cl.ido.chain.client.DummyTwoClient;
import cl.ido.chain.cor.DummyConstants;
import cl.ido.chain.domain.ChainRequest;
import cl.ido.chain.domain.ChainResponse;
import cl.ido.chain.domain.DummySession;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThirdCommand implements Command {

    private static Logger logger = LogManager.getLogger(ThirdCommand.class);

    private DummyTwoClient dummyTwoClient;

    public ThirdCommand(DummyTwoClient dummyTwoClient) {
        this.dummyTwoClient = dummyTwoClient;
    }

    @Override
    public boolean execute(Context context) throws Exception {
        logger.info("tercer comando");
        DummySession session = (DummySession) context.get(DummyConstants.SESSION);
        ChainRequest request = (ChainRequest) context.get(DummyConstants.CHAIN_REQUEST);
        ChainResponse chainResponse = (ChainResponse) context.get(DummyConstants.CHAIN_RESPONSE);
        chainResponse.setOutputTwo(dummyTwoClient.getTwo(session, request));
        context.put(DummyConstants.CHAIN_RESPONSE, chainResponse);
        return false;
    }
}
