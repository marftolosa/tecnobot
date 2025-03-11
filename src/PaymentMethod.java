public class PaymentMethod {
    // Atributos (Propiedades) de la clase PaymentMethod
    private int methodId; // ID único del método de pago
    private String methodName; // Nombre del método de pago (ej: Tarjeta de crédito, PayPal, Transferencia bancaria)
    private String provider; // Proveedor del método de pago (ej: Visa, MasterCard, PayPal)
    private boolean isActive; // Estado del método de pago (activo o no)
 
    /**
     * Constructor sin parámetros
     * Este constructor se utiliza para crear un objeto PaymentMethod sin asignar valores
     * iniciales a los atributos.
     */
    public PaymentMethod() {
    }
 
    /**
     * Constructor con parámetros
     * Este constructor se utiliza para crear un objeto PaymentMethod con valores
     * iniciales para todos sus atributos.
     * 
     * @param methodId    ID único del método de pago
     * @param methodName  Nombre del método de pago
     * @param provider    Proveedor del método de pago
     * @param isActive    Estado del método de pago (activo o inactivo)
     */
    public PaymentMethod(int methodId, String methodName, String provider, boolean isActive) {
        this.methodId = methodId;
        this.methodName = methodName;
        this.provider = provider;
        this.isActive = isActive;
    }
 
    // Getters
    public int getMethodId() {
        return methodId;
    }
 
    public String getMethodName() {
        return methodName;
    }
 
    public String getProvider() {
        return provider;
    }
 
    public boolean isActive() {
        return isActive;
    }
 
    // Setters
    public void setMethodId(int methodId) {
        this.methodId = methodId;
    }
 
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
 
    public void setProvider(String provider) {
        this.provider = provider;
    }
 
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
