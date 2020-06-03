package algos;
import java.io.File;
import java.net.URL;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class WebViewExample extends Application
{

    public static void main(String[] args)
    {
        launch(args);
    }

    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("JavaFX WebView Example");

        WebView webView = new WebView();

        URL url = this.getClass().getResource("/calcul.html");
        webView.getEngine().load(url.toString());

        VBox vBox = new VBox(webView);
        Scene scene = new Scene(vBox, 960, 600);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}