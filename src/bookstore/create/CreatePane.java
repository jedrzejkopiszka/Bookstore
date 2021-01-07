package bookstore.create;

import com.sun.javafx.scene.control.InputField;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class CreatePane extends BorderPane {
    private CreateInputPane createInputPane = null;
    private CreateBottomPane createBottomPane = null;

    public CreatePane() {
        initPane();
    }
    private void initPane(){
        setCenter(getCreateInputPane());
        setBottom(getCreateBottomPane());
        setPrefHeight(200);
        setPrefWidth(200);
    }

    public CreateInputPane getCreateInputPane() {
        if (createInputPane == null){
            createInputPane = new CreateInputPane();
        }
        return createInputPane;
    }

    public CreateBottomPane getCreateBottomPane() {
        if (createBottomPane == null){
            createBottomPane = new CreateBottomPane(getCreateInputPane());
        }
        return createBottomPane;
    }
}
