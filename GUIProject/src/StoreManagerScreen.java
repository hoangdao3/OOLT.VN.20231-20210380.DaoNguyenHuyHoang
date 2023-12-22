package GUIProject.src;

import hust.soict.hedspi.swing.Store;

import javax.print.attribute.standard.Media;
import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javafx.*;
import com.sun.deploy.cache.BaseLocalApplicationProperties;

import static com.sun.glass.ui.Cursor.setVisible;

public class StoreManagerScreen {
    private Object store;
    private BaseLocalApplicationProperties mediaInStore;

    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");

        menu.add(new JMenuItem("View Store"));

        JMenu smUpdateStore = new JMenu("Update Store");
        smUpdateStore.add(new JMenuItem("Add Book"));
        smUpdateStore.add(new JMenuItem("Add CD"));
        smUpdateStore.add(new JMenuItem("Add DVD"));
        menu.add(smUpdateStore);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

     JPanel createHeader () {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header,BoxLayout.X_AXIS));

        JPanel title = new JPanel(Boolean.parseBoolean("AIMS"));
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN,50));
        title.setForeground(Color.CYAN);

        header.add(Box.createRigidArea(new Dimension(10,10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(10,10)));

        return header;

    }


    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3,3,2,2));

        ArrayList<Media> MediaInStore = store.getItemsInStore();
        for (int i=0; i<9; i++) {
            MediaStore cell = new MediaStore(mediaInStore.get(String.valueOf(i)));
            center.add(cell);
        }
        return center;
    }

    private class MediaStore {
        public MediaStore(String s) {
        }
    }

    public StoreManagerScreen (Store store) {
        this.store = store;

        Container cp= getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(createNorth(),BorderLayout.NORTH);
        cp.add(createCenter(),BorderLayout.CENTER);

        setTitle("Store");
        setSize(1024,768);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void setLocationRelativeTo(Object o) {

    }

    private void setSize(int i, int i1) {

    }

    private void setTitle(String store) {

    }

    private Container getContentPane() {
        return null;
    }


}
