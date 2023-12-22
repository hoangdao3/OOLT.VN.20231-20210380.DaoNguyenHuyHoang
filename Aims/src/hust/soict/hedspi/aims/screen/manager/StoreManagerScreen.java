package hust.soict.hedspi.aims.screen.manager;

import java.awt.*;
import java.util.ArrayList;

import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.store.Store;

import javax.swing.*;

import java.awt.event.*;

public class StoreManagerScreen extends JFrame {
    private Store store;
    
    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(MenuBarCreator.createMenuBar(store));
        north.add(createHeader());
        return north;
    }


    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }
    
    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));

        ArrayList<Media> mediaInStore = store.getItemInStore();
        for (int i = 0; i < mediaInStore.size(); i++) {
            MediaStore cell = new MediaStore(mediaInStore.get(i));
            center.add(cell);
        }

        return center;
    }

    public class MediaStore extends JPanel {
        private Media media;
        public MediaStore(Media media) {
            this.media = media;
            this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

            JLabel title = new JLabel(media.getTitle());
            title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
            title.setAlignmentX(CENTER_ALIGNMENT);

            JLabel cost = new JLabel(String.valueOf(media.getCost()) + "$");
            cost.setAlignmentX(CENTER_ALIGNMENT);

            JPanel container = new JPanel();
            container.setLayout(new FlowLayout(FlowLayout.CENTER));

            container.add(new JButton("Add to cart"));
            if (media instanceof Playable) {
                JButton playButton = new JButton("Play");
                container.add(playButton);
                playButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        StringBuilder playOutput = new StringBuilder();

                        if (media instanceof CompactDisc) {
                            CompactDisc cd = (CompactDisc) media;
                            playOutput.append("Title: ").append(cd.getTitle()).append("\nLength: ").append(cd.getLength()).append("\n");
                            for (Track track : cd.getTracks()) 
                                playOutput.append("Track Title: ").append(track.getTitle()).append("\nLength: ").append(track.getLength()).append("\n");
                        }
                         else if (media instanceof DigitalVideoDisc) {
                            DigitalVideoDisc dvd = (DigitalVideoDisc) media;
                            playOutput.append("Title: ").append(dvd.getTitle()).append("\nLength: ").append(dvd.getLength());
                        }
                    
                        JDialog dialog = new JDialog();
                        dialog.setTitle("Playing Media");
                    
                        JTextArea textArea = new JTextArea(playOutput.toString());
                        dialog.getContentPane().add(textArea, BorderLayout.CENTER);
                        textArea.setEditable(false);                        
                    
                        dialog.setSize(300, 200);
                    
                        dialog.setVisible(true);
                    }
                });
            }

            this.add(Box.createVerticalGlue());
            this.add(title);
            this.add(cost);
            this.add(Box.createVerticalGlue());
            this.add(container);

            this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
    }

    public StoreManagerScreen(Store store) {
        this.store = store;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Store");
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main (String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
            "Animation","Roger Allers", 87, 19.95f);
        store.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
            "Science Fiction","George Lucas", 87, 24.95f);
        store.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", 
            "Animation", 18.99f);
        store.addMedia(dvd3);

        CompactDisc cd1 = new CompactDisc("Baby One More Time", 
            "Pop", "Jive Records", 20, 15.99f,"Britney Spears");
        Track track1 = new Track("Baby One More Time", 3);
        Track track2 = new Track("You Drive Me Crazy", 3);
        Track track3 = new Track("Sometimes", 3);
        cd1.addTrack(track1);
        cd1.addTrack(track2);
        cd1.addTrack(track3);
        store.addMedia(cd1);

        Book book1 = new Book(1, "Harry Potter", "Fantasy", 20f);
        store.addMedia(book1);
        Book book2 = new Book(2, "Deezer", "Action", 69f);
        store.addMedia(book2);
        new StoreManagerScreen(store);
        
    }

}
