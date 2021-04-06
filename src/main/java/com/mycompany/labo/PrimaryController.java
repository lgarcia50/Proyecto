package com.mycompany.labo;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class PrimaryController {
    private ObservableList<Usuario> lista = FXCollections.observableArrayList();

    @FXML
    private ListView listaUsuarios;

    @FXML
    private void addUsuario() {
        lista.add(new Usuario("Usuario nombre", "123"));
    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    public void inicializaListados() {
        lista.add(new Usuario("Sergio", "sergio45"));
        listaUsuarios.setItems(lista);

        listaUsuarios.setItems(lista);
    }
}
