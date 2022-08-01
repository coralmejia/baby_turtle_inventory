module com.example.baby_turtle_inventory {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.baby_turtle_inventory to javafx.fxml;
    exports com.example.baby_turtle_inventory;
}