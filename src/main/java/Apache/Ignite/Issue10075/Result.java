package Apache.Ignite.Issue10075;

public final class Result {
    private int id;
    private double value;

    public int getId() {
        return id;
    }

    public Result setId(int id) {
        this.id = id;
        return this;
    }

    public double getValue() {
        return value;
    }

    public Result setValue(double val) {
        this.value = val;
        return this;
    }
}