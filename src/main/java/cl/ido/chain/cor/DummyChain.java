package cl.ido.chain.cor;

import cl.ido.chain.client.DummyOneClient;
import cl.ido.chain.client.DummySessionClient;
import cl.ido.chain.client.DummyTwoClient;
import cl.ido.chain.cor.command.FirstCommand;
import cl.ido.chain.cor.command.SecondCommand;
import cl.ido.chain.cor.command.ThirdCommand;
import org.apache.commons.chain.impl.ChainBase;
import org.springframework.stereotype.Component;

@Component
public class DummyChain extends ChainBase {

    /**
     * Si alguno de los Command retorna true, la cadena se interrumpe
     */
    public DummyChain(DummySessionClient dummySessionClient,
                      DummyOneClient dummyOneClient,
                      DummyTwoClient dummyTwoClient) {
        super();
        addCommand(new FirstCommand(dummySessionClient));
        addCommand(new SecondCommand(dummyOneClient));
        addCommand(new ThirdCommand(dummyTwoClient));
        addCommand(new DummyFilter());
    }
}
