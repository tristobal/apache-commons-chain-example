package cl.ido.chain.cor;

import org.apache.commons.chain.Context;
import org.apache.commons.chain.Filter;

public class DummyFilter implements Filter {
    @Override
    public boolean postprocess(Context context, Exception e) {
        return false;
    }

    @Override
    public boolean execute(Context context) throws Exception {
        return false;
    }
}
