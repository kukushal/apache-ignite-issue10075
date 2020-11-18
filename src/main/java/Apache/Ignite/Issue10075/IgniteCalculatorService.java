package Apache.Ignite.Issue10075;

import org.apache.ignite.services.Service;
import org.apache.ignite.services.ServiceContext;

public final class IgniteCalculatorService implements Service, ICalculator {
    @Override public Result Calculate(Parameter p) {
        return new Result().setId(p.getId()).setValue(p.getValue() * p.getValue());
    }

    @Override public void cancel(ServiceContext ctx) {
    }

    @Override public void init(ServiceContext ctx) {
    }

    @Override public void execute(ServiceContext ctx) {
    }
}