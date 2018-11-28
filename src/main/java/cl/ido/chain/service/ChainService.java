package cl.ido.chain.service;

import cl.ido.chain.cor.DummyChainCatalog;
import cl.ido.chain.cor.DummyConstants;
import cl.ido.chain.cor.DummyContext;
import cl.ido.chain.domain.ChainRequest;
import cl.ido.chain.domain.ChainResponse;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChainService {

    @Autowired
    private DummyChainCatalog catalog;

    private static Logger logger = LogManager.getLogger(ChainService.class);

    public ChainResponse getChainResponse(ChainRequest request) {

        logger.info("Iniciando la cadena...");

        Context context = new DummyContext();
        context.put(DummyConstants.CHAIN_REQUEST, request);

        //Catalog catalog = new DummyChainCatalog();
        Command dummyChain = catalog.getCommand(DummyConstants.DUMMY_CHAIN);

        try {
            dummyChain.execute(context);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ChainResponse response = (ChainResponse) context.get(DummyConstants.CHAIN_RESPONSE);
        logger.info("Finalizada la cadena. Respuesta: " + response.toString());

        return response;
    }
}
