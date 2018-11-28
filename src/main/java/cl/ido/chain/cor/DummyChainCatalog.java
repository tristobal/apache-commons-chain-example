package cl.ido.chain.cor;

import org.apache.commons.chain.impl.CatalogBase;
import org.springframework.stereotype.Component;

@Component
public class DummyChainCatalog extends CatalogBase {

    public DummyChainCatalog(DummyChain dummyChain) {
        super();
        addCommand(DummyConstants.DUMMY_CHAIN, dummyChain);
    }
}
