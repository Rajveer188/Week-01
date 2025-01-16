
//import scanner class
import java.util.Scanner;

//program to create a deck of cards
class DeckOfCards {
    // create suits and ranks array and variable to store number of cards
    public static String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
    public static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
    public static int numOfCards = suits.length * ranks.length;

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {

        //array to store deck
        String[] deck = new String[numOfCards];

        int index = 0;
        // Generate the deck by combining each rank with each suit
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    //method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck){
    
        for (int i = 0; i < numOfCards; i++) {
            //get random index
            int randomCardIndex = i + (int) (Math.random() * (numOfCards - i));
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardIndex];
            deck[randomCardIndex] = temp;
        }
        return deck;
    }

    // Method to distribute the deck of card
    public static String[][] distributeCards(String[] deck, int numOfPlayers, int cardsPerPlayer) {
        if (numOfPlayers * cardsPerPlayer > deck.length) {
            System.out.println("not enough cards to distribute");
            return new String[0][0];
        }

        String[][] playersCards = new String[numOfPlayers][cardsPerPlayer];
        int index = 0;

        // Distribute the cards
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playersCards[i][j] = deck[index++];
            }
        }
        return playersCards;
    }

    //method to print the players and their cards
    public static void printPlayersCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("Player " + (i + 1) + " cards");
            for (String card : playersCards[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //initialize the deck of cards
        String[] deck = initializeDeck();

        //shuffle the deck
        deck = shuffleDeck(deck);

        //input number of players and cards per player
        System.out.print("Enter the number of players- ");
        int numOfPlayers = input.nextInt();

        System.out.print("Enter the number of cards per player- ");
        int cardsPerPlayer = input.nextInt();

        // Distribute the cards to the players
        String[][] playersCards = distributeCards(deck, numOfPlayers, cardsPerPlayer);

        //display cards each player has
        printPlayersCards(playersCards);

        //close scanner
        input.close();
    }
}
