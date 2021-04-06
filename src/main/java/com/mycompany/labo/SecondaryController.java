package com.mycompany.labo;

import java.io.IOException;
import java.util.Arrays;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

public class SecondaryController {

    private ObservableList<Clinicas> clases = FXCollections.observableArrayList(Arrays.asList(Clinicas.values()));
    private ObservableList<Paciente> lista = FXCollections.observableArrayList();

    @FXML
    private ComboBox Clinic;
    @FXML
    private ListView listaPaciente;

    @FXML
    private void addPaciente() {
        lista.add(new Paciente("nombre", "trabajo", "", "precio"));
    }
    @FXML
    private void add
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    public void inicializaListados() {
        lista.add(new Paciente("Paola", "Corona metal", "21,22,24", "250"));

        Clinic.setItems(clases);
        listaPaciente.setItems(lista);
    }
}
