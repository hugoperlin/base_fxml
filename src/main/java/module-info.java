module ifpr.eic.projeto {
    requires javafx.controls;
    requires javafx.fxml;

    opens ifpr.eic.projeto.telas to javafx.fxml;
    exports ifpr.eic.projeto;
}
