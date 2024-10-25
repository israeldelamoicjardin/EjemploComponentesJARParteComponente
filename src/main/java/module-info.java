module es.israeldelamo.componentesimple {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.israeldelamo.componentesimple to javafx.fxml;
    exports es.israeldelamo.componentesimple;
}