package cl.ido.chain.cor;

import cl.ido.chain.domain.ChainRequest;
import cl.ido.chain.domain.ChainResponse;
import cl.ido.chain.domain.DummySession;
import org.apache.commons.chain.impl.ContextBase;

public class DummyContext extends ContextBase {

    DummySession session;

    ChainRequest chainRequest;

    ChainResponse chainResponse;

    public ChainRequest getChainRequest() {
        return chainRequest;
    }

    public void setChainRequest(ChainRequest chainRequest) {
        this.chainRequest = chainRequest;
    }

    public ChainResponse getChainResponse() {
        return chainResponse;
    }

    public void setChainResponse(ChainResponse chainResponse) {
        this.chainResponse = chainResponse;
    }

    public DummySession getSession() {
        return session;
    }

    public void setSession(DummySession session) {
        this.session = session;
    }
}
