public class Payment {
 
    // Atributos de la clase Payment
    private double amount;
    private String paymentDate;
 
    // Constructor sin parámetros
    public Payment() {
        // Inicialización de valores por defecto
        this.amount = 0.0;
        this.paymentDate = "";
    }
 
    // Constructor con parámetros
    public Payment(double amount, String paymentDate) {
        this.amount = amount;
        this.paymentDate = paymentDate;
    }
 
    // Método getter para el atributo amount
    public double getAmount() {
        return amount;
    }
 
    // Método setter para el atributo amount
    public void setAmount(double amount) {
        this.amount = amount;
    }
 
    // Método getter para el atributo paymentDate
    public String getPaymentDate() {
        return paymentDate;
    }
 
    // Método setter para el atributo paymentDate
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
}
