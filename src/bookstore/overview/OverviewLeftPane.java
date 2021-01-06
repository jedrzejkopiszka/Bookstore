package bookstore.overview;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class OverviewLeftPane extends VBox {
    private Button buttonCreateBook = null;
    private Button buttonDeleteBook = null;

    public OverviewLeftPane() {
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

            });
        }
        return buttonDeleteBook;
    }
}
