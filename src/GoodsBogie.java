public class GoodsBogie {
    private String type;
    private String shape;
    private String cargo;

    public GoodsBogie(String type, String shape, String cargo) {
        this.type = type;
        this.shape = shape;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getShape() {
        return shape;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (this.shape.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
            throw new CargoSafetyException("Safety Violation: Rectangular bogies cannot carry Petroleum!");
        }
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " (Shape: " + shape + ") [" + cargo + "]";
    }
}
