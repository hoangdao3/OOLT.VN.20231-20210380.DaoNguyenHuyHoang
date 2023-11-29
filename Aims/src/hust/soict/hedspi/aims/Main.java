package Aims.src.hust.soict.hedspi.aims;

import Aims.src.hust.soict.hedspi.aims.cart.Cart;
import Aims.src.hust.soict.hedspi.aims.media.Media;
import Aims.src.hust.soict.hedspi.aims.media.Playable;
import Aims.src.hust.soict.hedspi.aims.store.Store;

import java.util.Scanner;

import java.util.Scanner;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("AIMS: ");
            System.out.println("--------------------------------");
            System.out.println("1. View store");
            System.out.println("2. Update store");
            System.out.println("3. See current cart");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    seeCurrentCart();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);
        scanner.close();
    }

    public static void viewStore() {
        store.displayItems();
        storeMenu();
    }

    public static void storeMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media’s details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    seeMediaDetails();
                    break;
                case 2:
                    addMediaToCart();
                    break;
                case 3:
                    playMedia();
                    break;
                case 4:
                    seeCurrentCart();
                    break;
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);
        scanner.close();
    }

    public static void seeMediaDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the media:");
        String title = scanner.nextLine();

        Media media = store.findMediaByTitle(title);
        if (media != null) {
            System.out.println(media.toString());
            if (media instanceof Playable) {
                mediaDetailsMenu((Playable) media);
            }
        } else {
            System.out.println("Media not found!");
        }
    }

    public static void mediaDetailsMenu(Playable media) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add to cart");
            System.out.println("2. Play");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cart.addMedia(media);
                    System.out.println("Added to cart.");
                    break;
                case 2:
                    media.play();
                    break;
                case 0:
                    System.out.println("Returning to store menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);
        scanner.close();
    }

    public static void addMediaToCart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the media:");
        String title = scanner.nextLine();

        Media media = store.findMediaByTitle(title);
        if (media != null) {
            cart.addMedia(media);
            System.out.println("Media added to cart.");
        } else {
            System.out.println("Media not found!");
        }
    }

    public static void playMedia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the media:");
        String title = scanner.nextLine();

        Media media = store.findMediaByTitle(title);
        if (media != null && media instanceof Playable) {
            ((Playable) media).play();
        } else {
            System.out.println("Playable media not found!");
        }
    }

    public static void updateStore() {
        // Implementation to add or remove media from the store
    }

    public static void seeCurrentCart() {
        cart.displayCart();
        cartMenu();
    }

    public static void cartMenu() {
        // Implement cart functionalities based on user choice
    }
}

