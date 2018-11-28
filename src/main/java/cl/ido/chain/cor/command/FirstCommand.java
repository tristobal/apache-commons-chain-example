package cl.ido.chain.cor.command;

import cl.ido.chain.client.DummySessionClient;
import cl.ido.chain.cor.DummyConstants;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FirstCommand implements Command {

    private static Logger logger = LogManager.getLogger(FirstCommand.class);

    private DummySessionClient dummySessionClient;

    public FirstCommand(DummySessionClient dummySessionClient) {
        this.dummySessionClient = dummySessionClient;
    }

    @Override
    public boolean execute(Context context) throws Exception {
        logger.info("Primer comando");
        context.put(DummyConstants.SESSION, dummySessionClient.getSession());
        return false;
    }
}
