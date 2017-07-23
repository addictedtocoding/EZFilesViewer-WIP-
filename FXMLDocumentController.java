/*I really wanted to keep that box. Fish it out of the garbage.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesviewer;//[sit: isisisisis]
//there's nothing quite like writing      scenes concurrently with   . so much fun. so much fun~~~
import java.io.BufferedReader;
import java.io.BufferedWriter;//just...ptmbm...ida. a, huh>? XDDD
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.StringReader;
import java.net.URL;//He feigned indecision. It was all a , in Sitara's opinion, for she knew that he had already made his decision. A grin, pulling upwards at the corners of his lips, making him look every bit as devious as he actually was. Sit lchd forwards, struck by a sudden bout of 
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;//striken by a LMAO
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;//until you *are* &  enough again to cft. pbond:D lol BOTH them/m m's <3/f
//to the Dog.
/**
 *
 * @author xanatosducrion
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML//ccato...you were worth it. what other ridiculous affliction...shiimpupy...lemmesee; he rbbd h ch theatrically XDDDD; within minutes/iy, Sitara found herself cwg the ws/gd pitifully. hahahahah; this isn't tm,thisisaj.therealtisinknowingwhati'vede. t o t amts a a's o o g m p
    private Label label;
    @FXML
    public Label fileLabel, itemsLabel;
    @FXML
    public TextArea mainBox, notesBox;
    @FXML
    public Button previousFile, nextFile, selectDirectory, autoDirectory;
    
    
    /*@FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }*/
    
    //his fingernails dug into her forearms as he did so, leaving/carving bloody red crescents into the flawless porc skin/in their wake. Edian trembled under his hands/trembled and shook, still growing accustomed to the , releasig her arm, with the same hand he pushed aside the matted strands of b h which were clinging to the side of her face as she howled under the /as soon as her screams subsided, now having been replaced with breathless/windless panting and choking noises. Red was really such a flattering color, and it looked perfect underneath her eyelids, as he trailed the same hand down until he hit her left ear.
    public String currentDirectoryPath, fileLocation;
    public int fileIndex;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      //he braced his other/left arm/hand against her torso, and pulled/and wrested the [] appendage from its [].that in which it was housed/esconsed. He [had, at the very least, taken the    of procuring the / a written contract/document of consent from] placed it back inside the drawer, and buried his head/face in his arms. despite his 's repeated platitudes/despite the repeated platitudes that were being offered to him, and appeals to his reason."tpatf are asod". His 's repeated attempts to appeal to his sense of reason had brought him to procure the .
      //he braced his other/left arm/hand against her torso, and pulled/and wrested the [] appendage from its []. He [had, at the very least, taken the    of procuring the / a written contract/document of consent from] placed it back inside the drawer, and buried his head/face in his arms. despite his 's repeated platitudes/despite the repeated platitudes that were being offered to him, and appeals to his reason."tpatf are asod". His 's repeated attempts to appeal to his sense of reason had brought him to procure the .
      //he w's h k's lol
      //groceries
      //y&w,r&h,h&m
      //it is v d to fut the r of what I've done
      
      //if he wants you to rvr it in this one (read: another couple ykw's-in-one), then he will not . Otherwise, he probably will. I really hope it is this simple...
      //you Idiot.
      
      //dyunwihd
      
      //do you realize what you've done
      
      //"It was a joke, hu--pck, a joke"
      
      //I w t s fys, that should tell you evyg
      
      //you often seem to forget this fact--remember, R, that fijah.
      
      //twin expressions of disbelief were warring on either countenance. Shock, horrot, disbelief, and dnl mingled together. F lowered himself onto o k, "I s".
      //
      //
      //
      //that would totally make my day
      
      //so for a change you wouldn't be a pain-in-the   
      
      //ah,stupidity.
      
//become the dumping ground for it,thhselecstoLOL


    currentDirectoryPath="";
    fileLocation="";
    fileIndex = 0;
    
    
//he braced his other/left arm/hand against her torso, and pulled/and wrested the [] appendage from its []. He [had, at the very least, taken the    of procuring the / a written contract/document of consent from] placed it back inside the drawer, and buried his head/face in his arms. despite his 's repeated platitudes/despite the repeated platitudes that were being offered to him, and appeals to his reason."tpatf are asod". His 's repeated attempts to appeal to his sense of reason had brought him to procure the .
//twin expressions of disbelief wrrd on either countenance
//f in particular felt his f crumble, staggering under the weight/enormity of what he had perpetrated/d. He absently rubbed at the flth on either arm, stricken.
    }    
    
    public void nextFile()
    {
        //my baby. God.
        
        //what a f w.
        
        
        //snapped with a satisfying crack, Sitara ptd as , sporting an ill-disguised expression of utter sm
        
        //pp is not quite as clg as you would imagine. It is more useful as a , a , or a simple means to kyfd.
        //only fear and s are actually useful.
    }
    
    public void previousFile()
    {
    
    }
    
    public void chooseFile()
    {//100 c's there is a reasonable limit to these things
    //I am such a fucking moron for doing this/allowing this to happen    
    
        JFileChooser chooser = new JFileChooser();
                int value = chooser.showOpenDialog(null);
                if(value == JFileChooser.APPROVE_OPTION)
                {
                    fileLocation = chooser.getSelectedFile().getPath();
                
    
        //chooser.getSelectedFile.getAbsolutePath();
        
        
                    currentDirectoryPath = "";
                    
                    String[] splits = fileLocation.split("/");
                    
                    for(int i = 0; i < splits.length - 1; i++)
                    {
                        currentDirectoryPath = currentDirectoryPath + splits[i];
                    }
                    
                    String extension = "";

                    int i = fileLocation.lastIndexOf('.');
                    if (i >= 0) 
                    {
                        extension = fileLocation.substring(i+1);
                    }
                
                    
                   //F's 'fufufu' momentXD, just tr.h
        
        if(extension.trim().equalsIgnoreCase("txt"))
        {
            loadTextDocument();
        }
        else if(extension.trim().equalsIgnoreCase(""))
        {
            loadRTFDocument();
        }
        else if(extension.trim().equalsIgnoreCase("docx"))
        {
            loadWordDocument();
        }
        else
        {
            System.out.println ("IO ERROR");
            //a creature as foul as I am now...cuck., 
        }
                }//for robbing him of a fvte pet. pain games. lmao.
                
                
                //I will never forgive myself, pswp
                //p & p are two entirely seperate things, and both are needed, obviously
    }
    
    public void loadWordDocument()
    {
        //it's too weak to latch onto...that's the problem...the distance is too great.*p*cb,*pgg*,m
        //kuro
        //for you to throw away your entire    like this...
    }
    
    public void loadTextDocument()
    {//I will never forgive you.


        
                    //so what you can conclude is, it doesn't matter if it's imp's gained by o's or through cncpns/ideas
                    //although one would naturally be much more stable than the other, and would have prolledup in it
                    //that's why the two     are so different, and yet similar in this way/in what they're trying to do.
                        //m of a d g
                    //adds files to file tracker
                                           
try{
            FileReader reader = new FileReader(fileLocation);
            BufferedReader br = new BufferedReader(reader); 
            String s;
            int index = 0;
            //int charCounter = 0;
            
            boolean endOfPara = false;
            
            while((s = br.readLine()) != null)
            {
                index = 0;
                while(index < s.length()) //change this
                {
                    
                    if((index == characterCapacity) && (index < s.length() - 1))
                    {
                        while(s.charAt(index) != ' ')
                        {
                            index--;
                        }   
                        
                        String n = s.substring(0, index);
                        s = s.substring(index);
                        
                        Primary.appendText(n + "\n");
                        
                        index = 0;
                    }
                    else if((index == s.length() - 1) && (index <= characterCapacity) && (s.length() > 0))
                    {
                        Primary.appendText(s + "\n");
                        index = s.length();  //OR use break;
                        endOfPara = true;
                    }
                    else
                    {
                        index++;
                    }
                    
                }
                
                if(endOfPara == true)
                {
                    Primary.appendText("\n");
                }
                
                endOfPara = false;
            }
           
        }
        catch(Exception e)                                              //R paused, as if considering his request.
        {//"Denied, F."          //Rosaria the sex bomb
        
        }
                       
    }//what I've done. You idiot.
    
    public void loadRTFDocument()//idiot moron dipshit
    {
               mainBox.clear();
               File rtfFile = null;
               WordExtractor rtfExtractor = null ;

               try {
                rtfFile = new File(fileLocation);

                //A FileInputStream obtains input bytes from a file.
                FileInputStream inStream = new FileInputStream(rtfFile.getAbsolutePath());

                //A HWPFDocument used to read document file from FileInputStream
                HWPFDocument doc=new HWPFDocument(inStream);

                rtfExtractor = new WordExtractor(doc);
               }
               catch(Exception ex)
               {
                System.out.println(ex.getMessage());
               }

                //This Array stores each line from the document file.
                String [] rtfArray = rtfExtractor.getParagraphText();

                String rtfString = "";

                for(int i=0; i < rtfArray.length; i++) rtfString += rtfArray[i];

                mainBox.appendText(rtfString);
    
    }
    
        try
            {         
                JFileChooser chooser = new JFileChooser();
                int value = chooser.showOpenDialog(null);
                if(value == JFileChooser.APPROVE_OPTION)
                {
                            XWPFDocument docToAppend = new XWPFDocument(new FileInputStream(chooser.getSelectedFile()));
                            XWPFWordExtractor extract = new XWPFWordExtractor(docToAppend);
                            String fullText = extract.getText();
                            
/*                            for(int q = 0; q < fullText.length(); q++)
                            {
                                if(q < fullText.length() - 3)
                                {
                                    if(fullText.charAt(q) == '\n' && fullText.charAt(q+1) == '\t')
                                    {
                                        fullText = fullText.substring(0, q) + "\n\n" + fullText.substring(q + 1, fullText.length() - 1);
                                    }
                                }
                            }*/                     //newly bracketed out
                            
                            //Primary.appendText(extract.getText());
                            
                            
                            String[] buttons = {"Append to end", "Insert at cursor location"};
int result = JOptionPane.showOptionDialog(null, "How would you like to insert the text? ", "Insert Text", JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[1]);
                            
                            
                   
                   if(result == 0)
                   {
                       try
        {
            //FileReader reader = new FileReader(fileLocation);
            //InputStream in = IOUtils.toInputStream(fullText, "UTF-8");
            StringReader reader = new StringReader(fullText);
            BufferedReader br = new BufferedReader(reader); 
            
            String s;
            int index = 0;
            //int charCounter = 0;
            
            boolean endOfPara = false;
            
            while((s = br.readLine()) != null)
            {
                index = 0;
                while(index < s.length()) //change this
                {
                    
                    if((index == characterCapacity) && (index < s.length() - 1))
                    {
                        while(s.charAt(index) != ' ')
                        {
                            index--;
                        }   
                        
                        String n = s.substring(0, index);
                        s = s.substring(index);
                        
                        Primary.appendText(n + "\n");
                        
                        index = 0;
                    }
                    else if((index == s.length() - 1) && (index <= characterCapacity) && (s.length() > 0))
                    {
                        Primary.appendText(s + "\n");
                        index = s.length();  //OR use break;
                        endOfPara = true;
                    }
                    else
                    {
                        index++;
                    }
                    
                }
                
                if(endOfPara == true)
                {
                    Primary.appendText("\n");
                }
                
                endOfPara = false;
            }
           
        }
        catch(Exception e)
        {                                   //how could the complexity of millions of years of evolution be imitated by h h
                                            //Sit shed a 
        }
                        //Primary.appendText(fullText);
        //recog ykw-nss, ag- precisely BECAUSE it is so damn ev- 
        //the pain was punishing- like knivees being driven into . And perhaps that is how that/it was intended to be.
                        //resetOnPaste();
                
                                                    //where the records were kept- which were both extensive and tremendous. It was one of D's favorite haunts. Cry's dotted the room/cavrn, along with a fair amount of semi-p artwork.
                                                    
                                                    //it's really more like engineering lol
                                                    //along with the requisite documentation that accompanied it. These could be found in the . rsch
                                                    //the only thing better than both of these...is both of these PUT TOGETHER:D
                /*save();                           //The Voter's Guide to Environmental Politics, O For G
                Primary.selectAll();
                Primary.clear();
                reinitializePrimary();*/
                
                
                //was stored in the ______, with free-access to all
                
                
                
                
                String pathToSave = chooser.getSelectedFile().getAbsolutePath();
                        
                
                            //adds the loaded file's name/path to the filetracker
/*                             File filesLoadedLog = new File(installationPath + "/FileTracker" + currentUser);
                             FileWriter writ = new FileWriter(filesLoadedLog, true);
                             BufferedWriter bw = new BufferedWriter(writ);
                             //writ.append("Hello World");
                            // if(filesLoadedLog.exists() == true)
                            // {
                                 writ.append(pathToSave + "\n");
                            //     title.setText(fileLocation);
                            // }
                            // else
                            // {
                            //     writ.write(fileLocation);
                            //     title.setText(fileLocation);
                            // }

                             bw.close();
                             writ.close();
                        

                
                   }*/
                   if(result == 1)
                   {
                          
            Primary.insertText(Primary.getCaretPosition(), "\n");
                       //Primary.nextWord();
                       //Primary.forward();
                       
                       int desiredCaretPosition = Primary.getCaretPosition();
                       Primary.end();
                       int start = Primary.getCaretPosition();
                       
                       try
        {
                     StringReader reader = new StringReader(fullText);
            BufferedReader br = new BufferedReader(reader); 
            //FileReader reader = new FileReader(fileLocation);
            //BufferedReader br = new BufferedReader(reader); 
            String s;
            int index = 0;
            //int charCounter = 0;
            
            boolean endOfPara = false;
            
            while((s = br.readLine()) != null)
            {
                index = 0;
                while(index < s.length()) //change this
                {
                    
                    if((index == characterCapacity) && (index < s.length() - 1))
                    {
                        while(s.charAt(index) != ' ')
                        {
                            index--;
                        }   
                        
                        String n = s.substring(0, index);
                        s = s.substring(index);
                        
                        Primary.appendText(n + "\n");
                        
                        index = 0;
                    }
                    else if((index == s.length() - 1) && (index <= characterCapacity) && (s.length() > 0))
                    {
                        Primary.appendText(s + "\n");
                        index = s.length();  //OR use break;
                        endOfPara = true;
                    }
                    else
                    {
                        index++;
                    }
                    
                }
                
                if(endOfPara == true)
                {
                    Primary.appendText("\n");
                }
                
                endOfPara = false;
            }
           
        }
        catch(Exception e)
        {
        
        }
                       
                       Primary.end();
                       int end = Primary.getCaretPosition();
                                Primary.selectRange(start, end);
                                String appendedText = Primary.getSelectedText();
                                Primary.deleteText(start, end);
                                
                                Primary.insertText(desiredCaretPosition, appendedText);
                       
                       
                       
                       
//                       int caretPosition = Primary.getCaretPosition();        //NEWLY BRACKETED OUT
//                       Primary.insertText(caretPosition, fullText);           //NEWLY BRACKETED OUT
                       
                       //resetOnPaste();
                onClickOrKeyPress();
                
                /*save();
                Primary.selectAll();
                Primary.clear();
                reinitializePrimary();*/
                
                String pathToSave = chooser.getSelectedFile().getAbsolutePath();
                        
                
                            //adds the loaded file's name/path to the filetracker
                             File filesLoadedLog = new File(installationPath + "/FileTracker" + currentUser);
                             FileWriter writ = new FileWriter(filesLoadedLog, true);
                             BufferedWriter bw = new BufferedWriter(writ);
                             //writ.append("Hello World");
                            // if(filesLoadedLog.exists() == true)
                            // {
                                 writ.append(pathToSave + "\n");
                            //     title.setText(fileLocation);
                            // }
                            // else
                            // {
                            //     writ.write(fileLocation);
                            //     title.setText(fileLocation);
                            // }

                             bw.close();
                             writ.close();
                        

                
                   }
                 
                }
                else
                {
                //'paf' lol
                }    //Sit stumbled/fell, f fwds, clutching the engorged appendage    causing her to . With a 'thunk' lolXDDDD. she caught herself on her hands/arms, immediately regretting it as it agvtd the preexisting i-y/the already s ykw/sent jolts of pain lancing up her arms. D laughed and laughed and laughed. as she struggled to find a [], and then deemed it futile.
                //hahahahahaha
                            
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Images are not supported. If your document contains images, it will not be loaded. Please remove the images or paste the text into another document and try again.");
            }
    }
}
