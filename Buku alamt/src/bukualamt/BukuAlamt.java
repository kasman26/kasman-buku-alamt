/*
2 * To change this license header, choose License Headers in Project Properties.
3 * To change this template file, choose Tools | Templates
4 * and open the template in the editor.
5 */
 package bukualamt;

 import java.io.IOException;
 import java.util.logging.Level;
 import java.util.logging.Logger;
 import javafx.application.Application;
 import javafx.fxml.FXMLLoader;
 import javafx.scene.Scene;
 import javafx.scene.layout.AnchorPane;
 import javafx.scene.layout.BorderPane;
 import javafx.stage.Stage;

 /**
 *
 * @author Kasman
 */
 public class BukuAlamt extends Application {

 //variabel kelas
 private Stage stageAplikasi;
 private BorderPane rootAplikasi;

 @Override
 public void start(Stage primaryStage){
 this.stageAplikasi = primaryStage;
 this.stageAplikasi.setTitle("Buku Alamt");

 initGUIKerangka(); //fungsi untuk inisialisasi node dari GUIkerangka.fxml
 initViewBukuAlamt();//fungsi inisialisasi node dari viewBukuAlamt
 }

 /**
 * @param args the command line arguments
 */
 public static void main(String[] args) {
 launch(args);
}

 private void initGUIKerangka() {
 try {
 FXMLLoader loader = new FXMLLoader();
 loader.setLocation(BukuAlamt.class.getResource("view/GUIKerangka.fxml"));
 rootAplikasi = (BorderPane)loader.load();

 Scene sceneAplikasi = new Scene(rootAplikasi);
 stageAplikasi.setScene(sceneAplikasi);
 stageAplikasi.show();
 } catch (IOException ex) { Logger.getLogger(BukuAlamt.class.getName()).log(Level.SEVERE, null, ex);
 }
 }

 private void initViewBukuAlamt() {
 try {
 FXMLLoader loader = new FXMLLoader();
 loader.setLocation(BukuAlamt.class.getResource(
"view/viewBukuAlamt.fxml"));
 AnchorPane guiIsi = (AnchorPane)loader.load();
 rootAplikasi.setCenter(guiIsi);
 } catch (IOException ex) {
 Logger.getLogger(BukuAlamt.class.getName()).log(Level.SEVERE, null, ex);
 }
 }
 }