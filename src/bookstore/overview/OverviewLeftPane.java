package bookstore.overview;

import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.VBox;

import java.util.Optional;

public class OverviewLeftPane extends VBox {
    private Button buttonCreateBook = null;
    private Button buttonDeleteBook = null;
    private final OverviewTableView overviewTableView;


    public OverviewLeftPane(OverviewTableView overviewTableView) {
        this.overviewTableView = overviewTableView;
        initStuff();
    }

    private void initStuff(){
        this.setSpacing(10);
        this.setPadding(new Insets(5));
        this.getChildren().add(getButtonCreateBook());
        this.getChildren().add(getButtonDeleteBook());
    }

    private Button getButtonCreateBook() {
        if (buttonCreateBook == null){
            buttonCreateBook = new Button("Create book");
            buttonCreateBook.setOnAction((e) -> {

            });
        }
        return buttonCreateBook;
    }

    private Button getButtonDeleteBook() {
        if (buttonDeleteBook == null){
            buttonDeleteBook = new Button("Delete book");
            buttonDeleteBook.setOnAction((e) ->{
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setContentText("Are you shure, you want to delete the book?");
                alert.setTitle("Delete book?");
                Optional<ButtonType> buttonType = alert.showAndWait();

            });
        }
        return buttonDeleteBook;
    }
}
