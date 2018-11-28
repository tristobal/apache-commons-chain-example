package cl.ido.chain.domain;

public class ChainResponse {
    private String outputOne;
    private String outputTwo;

    public String getOutputOne() {
        return outputOne;
    }

    public void setOutputOne(String outputOne) {
        this.outputOne = outputOne;
    }

    public String getOutputTwo() {
        return outputTwo;
    }

    public void setOutputTwo(String outputTwo) {
        this.outputTwo = outputTwo;
    }

    @Override
    public String toString() {
        return "ChainResponse{" +
                "outputOne='" + outputOne + '\'' +
                ", outputTwo='" + outputTwo + '\'' +
                '}';
    }
}
