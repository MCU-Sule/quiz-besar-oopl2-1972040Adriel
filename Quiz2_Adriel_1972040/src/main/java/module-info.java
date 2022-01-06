module com.adriel.quiz2_adriel_1972040 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;


    opens com.adriel.quiz2_adriel_1972040 to javafx.fxml;
    exports com.adriel.quiz2_adriel_1972040;
}