package feb_22_2022;

public class Puzzle_2 {

	public static void main(String[] args) {
		 int[] Cards = new int[52];
		    String[] Main_Cards = {"Spades", "Hearts", "Diamonds", "Clubs"};
		    String[] Sub_Cards = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

		    // Initialize the Cards
		    for (int i = 0; i < Cards.length; i++) {
		    	Cards[i] = i;
		    }

		    // Shuffle all 52 cards in random order
		    for (int i = 0; i < Cards.length; i++) {
		      int index = (int)(Math.random() * Cards.length);
		      int temp = Cards[i];
		      Cards[i] = Cards[index];
		      Cards[index] = temp;
		    }
		    
		    // Display the 13 cards randomly
		    for (int i = 0; i < 52; i++) {
		      String M_Card = Main_Cards[Cards[i] / 13];
		      String Card_Number = Sub_Cards[Cards[i] % 13];
		      System.out.println( Card_Number + " of " + M_Card);
		    }
	}
}
