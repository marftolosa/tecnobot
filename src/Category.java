public class Category {
    // Atributos (Propiedades) de la clase Category
    private int categoryId; // ID único de la categoría
    private String categoryName; // Nombre de la categoría
    private String categoryDescription; // Descripción de la categoría
 
    /**
     * Constructor sin parámetros
     * Este constructor se utiliza para crear un objeto Category sin asignar valores
     * iniciales a los atributos.
     */
    public Category() {
    }
 
    /**
     * Constructor con parámetros
     * Este constructor se utiliza para crear un objeto Category con valores
     * iniciales para todos sus atributos.
     * 
     * @param categoryId           ID único de la categoría
     * @param categoryName         Nombre de la categoría
     * @param categoryDescription  Descripción de la categoría
     */
    public Category(int categoryId, String categoryName, String categoryDescription) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
    }
 
    // Getters
    public int getCategoryId() {
        return categoryId;
    }
 
    public String getCategoryName() {
        return categoryName;
    }
 
    public String getCategoryDescription() {
        return categoryDescription;
    }
 
    // Setters
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
 
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
 
    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }
}
