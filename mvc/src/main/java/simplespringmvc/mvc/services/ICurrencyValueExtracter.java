package simplespringmvc.mvc.services;

public interface ICurrencyValueExtracter {
    /**
     *
     * @param currencyCode (for example "USD")
     * @param amount how much rubles a user wants to convert
     * @return How much the currency costs in rubbles
     */
    double extractValueFor(String currencyCode, int amount);
}
