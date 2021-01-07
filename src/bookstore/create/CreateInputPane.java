package bookstore.create;

import bookstore.model.Book;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Text;

import java.util.Locale;

public class CreateInputPane extends GridPane {

    private Text txtTitle;
    private TextField title;

    private Text txtAuthor;
    private TextField author;

    private Text txtPrice;
    private TextField price;

    public CreateInputPane() {
        initPane();
    }

    private void initPane() {
        getChildren().addAll(
                getTxtTitle(), getTitle(),
                getTxtAuthor(), getAuthor(),
                getTxtPrice(), getPrice()
        );

        ColumnConstraints c1 = new ColumnConstraints(200);
        ColumnConstraints c2 = new ColumnConstraints(300);
        c2.setHgrow(Priority.ALWAYS);
        getColumnConstraints().addAll(c1, c2);

       // getColumnConstraints().add()
        int row = 0;
        int column = 0;
        setRowIndex(getTxtTitle(), row);
        setRowIndex(getTitle(), row++);
        setColumnIndex(getTxtTitle(), column);
        setColumnIndex(getTitle(), column++);

        column = 0;
        setRowIndex(getTxtAuthor(), row);
        setRowIndex(getAuthor(), row++);
        setColumnIndex(getTxtAuthor(), column);
        setColumnIndex(getAuthor(), column++);

        column = 0;
        setRowIndex(getTxtPrice(), row);
        setRowIndex(getPrice(), row++);
        setColumnIndex(getTxtPrice(), column);
        setColumnIndex(getPrice(), column++);
    }

    private Text getTxtTitle() {
        if (txtTitle == null){
            txtTitle = new Text("Title");
        }
        return txtTitle;
    }

    private TextField getTitle() {
        if (title == null){
            title = new TextField("NOT_SET");
        }
        return title;
    }

    private Text getTxtAuthor() {
        if (txtAuthor == null){
            txtAuthor = new Text("Author");
        }
        return txtAuthor;
    }

    private TextField getAuthor() {
        if (author == null){
            author = new TextField("NOT_SET");
        }
        return author;
    }

    private Text getTxtPrice() {
        if (txtPrice == null){
            txtPrice = new Text("Price");
        }
        return txtPrice;
    }

    private TextField getPrice() {
        if (price == null){
            price = new TextField("NOT_SET");
        }
        return price;
    }

    public Book book() {
        return new Book(
          getTitle().getText(),
          getAuthor().getText(),
          Double.parseDouble(getPrice().getText())
        );
    }
}
