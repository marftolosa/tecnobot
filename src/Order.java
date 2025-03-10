import java.sql.Date;

public class Order {

    //Attributes
    private int order_id;
    private int user_id;
    private Date date;
    private double total_price;
    private String state;

    //Construct whitout parameters
    public Order() {

    }

    //Construct with parameters
    public Order(int order_id, int user_id, Date date, double total_price, String state) {
        this.order_id = order_id;
        this.user_id = user_id;
        this.date = date;
        this.total_price = total_price;
        this.state = state;
    }

    //Setters
    public void SetOrderID(int order_id) {
        this.order_id = order_id;
    }

    public void SetUserID(int user_id) {
        this.user_id = user_id;
    }

    public void SetDate(Date date) {
        this.date = date;
    }

    public void SetTotalPrice(double total_price) {
        this.total_price = total_price;
    }

    public void SetState(String state) {
        this.state = state;
    }

    
    //Getters
    public int GetOrderID() {
        return order_id;
    }
    
    public int GetUserID() {
        return user_id;
    }

    public Date GetDate() {
        return date;
    }

    public double GetTotalPrice() {
        return total_price;
    }

    public String GetState() {
        return state;
    }
}