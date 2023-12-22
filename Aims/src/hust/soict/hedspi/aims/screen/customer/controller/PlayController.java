package hust.soict.hedspi.aims.screen.customer.controller;

import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class PlayController {
    private Media media;

    public PlayController(Media media) {
        this.media = media;
    }

    @FXML
    private Button btnOk;

    @FXML
    private TableColumn<Track, Integer> colLength;

    @FXML
    private TableColumn<Track, String> colTitile;

    @FXML
    private Label lengthLabel;

    @FXML
    private Label lblTrack;

    @FXML
    private TableView<Track> tblTrack;

    @FXML
    private Label titleLabel;

    @FXML
    void btnOkPressed(ActionEvent event) {
        Stage stage = (Stage) btnOk.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void initialize() {
        titleLabel.setText(media.getTitle());
        if (media instanceof DigitalVideoDisc) {
            lengthLabel.setText(String.valueOf(((DigitalVideoDisc)media).getLength()));
            lblTrack.setVisible(false);
            tblTrack.setVisible(false);
        } else {
            lengthLabel.setText(String.valueOf(((CompactDisc)media).getLength()));
            tblTrack.setVisible(true);
            colTitile.setCellValueFactory(new PropertyValueFactory<Track, String>("title"));
            colLength.setCellValueFactory(new PropertyValueFactory<Track, Integer>("length"));
            CompactDisc cd = (CompactDisc)media;
            if (cd.getTracks() != null) {
                ObservableList<Track> tracks = FXCollections.observableArrayList(cd.getTracks());
                tblTrack.setItems(tracks);
            }
        }
    }

}
