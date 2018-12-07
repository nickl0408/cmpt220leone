import java.util.Scanner;
import java.util.Vector;

public class Blackjack {

    private static Scanner scanner = new Scanner(System.in);
    private int[] deck;   
    private int posInDeck; 
    private Vector hand;   

    public static void main(String[] args) {
        
    	new Blackjack().run();
    	
    }

    public void run() {

        int m;         
        int bet;            
        boolean userWins;   


        m = 1500; 

        while (true) {
            System.out.println("You have $" + m + ".");
            do {
            	
                System.out.println("How much would you like to bet on this hand");
                
                bet = scanner.nextInt();
                if (bet < 0 || bet > m) {
                    
                	System.out.println("Your answer must be between 0 and " + m + '.');
                	
                }
                
            } 
            
            while (bet < 0 || bet > m);
            
            if (bet == 0) {
            	
                break;
                
            }
            
            userWins = playBlackjack();
            
            if (userWins) {
                m = m + bet;
            } else {
                m = m - bet;
            }
            
            System.out.println();
            
            if (m == 0) {
                
            	System.out.println("You've lost all your money! Stop Gambling!");
                
            	break;
            }
        }

        System.out.println();
        System.out.println("You leave with $" + m + '.');

    } 

    private boolean playBlackjack() {
        

        Vector opponentsHand;   
        Vector yourHand;    

        deck = new int[52];
        int cardCt = 0; 
        for (int suit = 0; suit <= 3; suit++) {
        	
            for (int value = 1; value <= 13; value++) {
            	
                deck[cardCt] = value;
                cardCt++;
            }
        }
        
        posInDeck = 0;

        opponentsHand = new Vector();
        yourHand = new Vector();

        deckShuffle();

        opponentsHand.addElement(dealCard());
        opponentsHand.addElement(dealCard());
        yourHand.addElement(dealCard());
        yourHand.addElement(dealCard());

        System.out.println();
        System.out.println();


        if (value(opponentsHand) == 21) {
        	
            System.out.println("Dealer has the " + showCard(getCard(opponentsHand, 0)) + " and the " + showCard(getCard(opponentsHand, 1)) + ".");
            
            System.out.println("User has the " + showCard(getCard(yourHand, 0)) + " and the " + showCard(getCard(yourHand, 1)) + ".");
            
            System.out.println();
            
            System.out.println("Dealer has Blackjack :( ");
            
            return false;
        }
        

        if (value(yourHand) == 21) {
        	
            System.out.println("Dealer has the " + showCard(getCard(opponentsHand, 0)) + " and the " + showCard(getCard(opponentsHand, 1)) + ".");
            
            System.out.println("User has the " + showCard(getCard(yourHand, 0)) + " and the " + showCard(getCard(yourHand, 1)) + ".");
            
            System.out.println();
            
            System.out.println("You have Blackjack :D ");
            
            return true;
            
        }
        

        while (true) {

            System.out.println();
            System.out.println();
            System.out.println("You have:");
            
            for (int i = 0; i < yourHand.size(); i++) {
            	
                System.out.println("    " + showCard(getCard(yourHand, i)));
                
            }
            
            System.out.println("Your total is " + value(yourHand));
            
            System.out.println();
            
            System.out.println("Dealer is showing a " + showCard(getCard(opponentsHand, 0)));
            
            System.out.println();
            
            System.out.print("Type H to hit or S to Stay");
            
            char userAction;
            
            
            do {
            	
                userAction = Character.toUpperCase(scanner.next().charAt(0));
                if (userAction != 'H' && userAction != 'S') {
                    
                	System.out.print("Please respond H or S:  ");
                	
                }
                
            } 
            
            while (userAction != 'H' && userAction != 'S');

           

            if (userAction == 'S') {
            	
                break;
                
            } else {
             
                int newCard = dealCard();
                yourHand.addElement(newCard);
                System.out.println();
                System.out.println("User hits.");
                System.out.println("Your card is the " + showCard(newCard));
                System.out.println("Your total is now " + value(yourHand));
                
                if (value(yourHand) > 21) {
                	
                    System.out.println();
                    System.out.println("You busted by going over 21.  You lose.");
                    System.out.println("Dealer's other card was the " + showCard(getCard(opponentsHand, 1)));
                    
                    return false;
                }
            }

        } 

        System.out.println();
        System.out.println("User stands.");
        System.out.println("Dealer's cards are");
        System.out.println(" " + showCard(getCard(opponentsHand, 0)));
        System.out.println(" " + showCard(getCard(opponentsHand, 1)));
        
        while (value(opponentsHand) <= 16) {
        	
            int newCard = dealCard();
            System.out.println("Dealer hits and gets the " + showCard(newCard));
            opponentsHand.addElement(newCard);
        }
        
        System.out.println("Dealer's total is " + value(opponentsHand));


        System.out.println();
        if (value(opponentsHand) > 21) {
        	
            System.out.println("Dealer busted by going over 21.  You win.");
            return true;
            
        } else {
        	
            if (value(opponentsHand) == value(yourHand)) {
            	
                System.out.println("Dealer wins on a tie.  You lose.");
                return false;
                
            } else {
                
            	if (value(opponentsHand) > value(yourHand)) {
            		
                    System.out.println("Dealer wins, " + value(opponentsHand) + " points to " + value(yourHand) + ".");
                    return false;
                    
                } else {
                	
                    System.out.println("You win, " + value(yourHand) + " points to " + value(opponentsHand) + ".");
                    return true;
                }
            }
        }

    }  

    public int dealCard() {
        
        if (posInDeck == 52) {
            
        	deckShuffle();
        	
        }
        
        posInDeck++;
       
        return deck[posInDeck - 1];
        
    }
    

    public void deckShuffle() {
        
        for (int i = 51; i > 0; i--) {
        	
            int rand = (int) (Math.random() * (i + 1));
            int temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
            
        }
        
        posInDeck = 0;
        
    }

    public int getCard(Vector hand, int position) {
        
        if (position >= 0 && position < hand.size()) {
        	
            return ((Integer)hand.elementAt(position)).intValue();
            
        } else {
        	
            return 0;
            
        }
    }

    public int value(Vector hand) {
       
        int value;      
        boolean ace;  
        int cards;    

        value = 0;
        ace = false;
        cards = hand.size();

        for (int i = 0; i < cards; i++) {
            
            int card;   
            int cVal;  
            card = getCard(hand, i);
            cVal = getCardValue(card);  
            
            if (cVal > 10) {
            	
                cVal = 10;
                
            }
            
            if (cVal == 1) {
            	
                ace = true;    
            }
            
            value = value + cVal;
            
        }

        if (ace == true && value + 10 <= 21) {
            value = value + 10;
        }

        return value;

    }
    
    
    public int getCardValue(int card) {
        int result = card;
        switch (card) {
            case 11:
            case 12:
            case 13:
                result =  10;
        }
        return result;
    }
    
    
    public String showCard(int card) {
    	
        switch (card) {
        
        	case 1:
                return "Ace";
                
            case 2:
                return "Two";
                
            case 3:
                return "Three";
                
            case 4:
                return "Four";
                
            case 5:
                return "Five";
                
            case 6:
                return "Six";
                
            case 7:
                return "Seven";
                
            case 8:
                return "Eight";
                
            case 9:
                return "Nine";
                
            case 10:
                return "Ten";
                
            case 11:
                return "Jack";
                
            case 12:
                return "Queen";
                
            case 13:
                return "King";
                
            default:
                return " ";
        }
    }
}  