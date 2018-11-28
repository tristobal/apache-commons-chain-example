package cl.ido.chain.controller;

import cl.ido.chain.domain.ChainRequest;
import cl.ido.chain.domain.ChainResponse;
import cl.ido.chain.service.ChainService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChainController {

    private static Logger logger = LogManager.getLogger(ChainController.class);

    @Autowired
    private ChainService chainService;

    @GetMapping(value="/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public ChainResponse getChain(@RequestParam String one, @RequestParam String two) {

        logger.info("INPUT: one: " + one + ", two: " + two);
        ChainRequest chainRequest = new ChainRequest();
        chainRequest.setInputOne(one);
        chainRequest.setInputTwo(two);
        return chainService.getChainResponse(chainRequest);
    }
}
