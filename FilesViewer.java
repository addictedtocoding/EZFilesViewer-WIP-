/*tossingn it up and down in the air as if it were a toy.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templateshe braced his other/left arm/hand against her torso, and pulled/and wrested/wrenched the [] appendage from its []. He [had, at the very least, taken the    of procuring the / a written contract/document of consent from] placed it back inside the drawer, and buried his head/face in his arms. despite his 's repeated platitudes/despite the repeated platitudes that were being offered to him, and appeals to his reason."tpatf are asod". His 's repeated attempts to appeal to his sense of reason had brought him to procure the .
 * and open the template in the editor.
 */
package filesviewer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author xanatosducrion
 */
public class FilesViewer extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
