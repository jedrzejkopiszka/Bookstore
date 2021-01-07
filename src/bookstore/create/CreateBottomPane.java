package bookstore.create;

import bookstore.CustomEvent;
import bookstore.model.DataHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class CreateBottomPane extends HBox {
    private Button cancel = null;
    private Button ok = null;
    private final CreateInputPane inputPane;

    public CreateBottomPane(CreateInputPane inputPane) {
        this.inputPane = inputPane;
        initPane();
    }

    private void initPane() {
        getChildren().addAll(getCancel(), getOk());
    }

    public Button getCancel() {
        if (cancel == null) {
            cancel = new Button("Cancel");
            cancel.setOnAction((e) -> {
                fireEvent(new CustomEvent(CustomEvent.GO_TO_OVERVIEW_SCENE));
            });
        }
        return cancel;
    }

    public Button getOk() {
        if (ok == null) {
            ok = new Button("OK");
            ok.setOnAction((e) -> {
                DataHandler.INSTANCE.createBook(inputPane.book());
                fireEvent(new CustomEvent(CustomEvent.GO_TO_OVERVIEW_SCENE));
            });
        }
        return ok;
    }
}
