package ModelController;

public class Ressource extends Item {

    public Ressource() {
        super();
    }
    public Ressource(int item_id, int item_type, String item_name, String item_description, double item_weight, double item_value) {
        super(item_id, item_type, item_name, item_description, item_weight, item_value);
    }

    //region Getters & Setters
    @Override
    public int getItem_id() {
        return super.getItem_id();
    }

    @Override
    public void setItem_id(int item_id) {
        super.setItem_id(item_id);
    }

    @Override
    public int getItem_type() {
        return super.getItem_type();
    }

    @Override
    public void setItem_type(int item_type) {
        super.setItem_type(item_type);
    }

    @Override
    public String getItem_name() {
        return super.getItem_name();
    }

    @Override
    public void setItem_name(String item_name) {
        super.setItem_name(item_name);
    }

    @Override
    public String getItem_description() {
        return super.getItem_description();
    }

    @Override
    public void setItem_description(String item_description) {
        super.setItem_description(item_description);
    }

    @Override
    public double getItem_weight() {
        return super.getItem_weight();
    }

    @Override
    public void setItem_weight(double item_weight) {
        super.setItem_weight(item_weight);
    }

    @Override
    public double getItem_value() {
        return super.getItem_value();
    }

    @Override
    public void setItem_value(double item_value) {
        super.setItem_value(item_value);
    }
    //endregion

    @Override
    public void showItemInfo() {
        super.showItemInfo();
    }

    @Override
    public void useItem() {
        super.useItem();
    }
}// End
