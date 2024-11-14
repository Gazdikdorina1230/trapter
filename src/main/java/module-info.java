module exqmple {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens exqmple to javafx.fxml;
    exports exqmple;
}
