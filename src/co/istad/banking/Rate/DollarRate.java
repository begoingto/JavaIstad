package co.istad.banking.Rate;

import co.istad.ulit.Interest;

public class DollarRate implements Interest {
    @Override
    public Double calculate(Double amount) {
        return amount * 0.06;
    }
}
