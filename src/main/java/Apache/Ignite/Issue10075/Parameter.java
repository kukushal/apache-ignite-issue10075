package Apache.Ignite.Issue10075;

public final class Parameter {
    private int id;
    private double val;

    public int getId() {
        return id;
    }

    public Parameter setId(int id) {
        this.id = id;
        return this;
    }

    public double getValue() {
        return val;
    }

    public Parameter setValue(double val) {
        this.val = val;
        return this;
    }
}