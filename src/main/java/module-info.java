module com.example.fxdemo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxdemo2 to javafx.fxml;
    exports com.example.fxdemo2;
}