module com.leo.application.demojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.leo.application.demojavafx to javafx.fxml;
    exports com.leo.application.demojavafx;
}