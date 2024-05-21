module org.poo.demo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.poo.demo2 to javafx.fxml;
    exports org.poo.demo2;
}