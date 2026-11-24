import java.util.Scanner;

public class Revision {

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.println("""

                List of Menu Functions
                1.Phone book
                2.Messages
                3.Chat
                4.Call register
                5.Tones
                6.Settings
                7.Call divert
                8.Music
                9.Games
                10.Calculator
                11.Reminders
                12.Clock
                13.Profiles
                14.Services
                15.SIM services

                Please input the chosen number to access the menu:
                """);

        int option = input.nextInt();

        switch (option) {
            case 1 -> {
                System.out.println("""
                        Welicome to Phone book Menu
                        1.Search
                        2.Service Nos
                        3.Add name
                        4.Erase
                        5.Edit
                        6.Copy
                        7.Assign tone
                        8.Send b'card
                        9.Options
                        10.Speed dials
                        11.Voice tags

                        Please input your chosen number to access the menu:
                        """);

                int option1 = input.nextInt();

                switch (option1) {
                    case 1 -> System.out.println("Welicome to Search option");
                    case 2 -> System.out.println("You picked Service Nos option");
                    case 3 -> System.out.println("You picked Add name option");
                    case 4 -> System.out.println("You are choosing to erase");
                    case 5 -> System.out.println("You are in Edit Function");
                    case 6 -> System.out.println("Welicome to Copy option");
                    case 7 -> System.out.println("Welicome to Assign tone option");
                    case 8 -> System.out.println("Welicome to Send b'card option");
                    case 9 -> {
                        System.out.println("""
                                Welicome to Options, please choose any option below
                                1.Memory in use
                                2.Type of view
                                3.Memory status

                                Please input your chosen number to access the menu:
                                """);

                        int option12 = input.nextInt();

                        switch (option12) {
                            case 1 -> System.out.println("You are in Memory in use options");
                            case 2 -> System.out.println("You are in Type of view options");
                            case 3 -> System.out.println("You are in Memory status options");
                            default -> System.out.println("Invalid option");
                        }
                    }
                    case 10 -> System.out.println("You are in Speed dials option");
                    case 11 -> System.out.println("You are in Voice tags option");
                    default -> System.out.println("Invalid option");
                }
            }
            case 2 -> {
                System.out.println("""
                        Welicome to Message Menu
                        1.Write Message
                        2.Inbox
                        3.Outbox
                        4.Picture messages
                        5.Templates
                        6.Smileys
                        7.Message settings
                        8.Info service
                        9.Voice mailbox number
                        10.Service command editor

                        Please input your chosen number to access the menu:
                        """);

                int option2 = input.nextInt();

                switch (option2) {
                    case 1 -> System.out.println("Welicome to Write messages option");
                    case 2 -> System.out.println("You picked Inbox option");
                    case 3 -> System.out.println("You picked Outbox option");
                    case 4 -> System.out.println("You are choosing to enter Picture messages");
                    case 5 -> System.out.println("You are in Templates Function");
                    case 6 -> System.out.println("Welicome to Smileys option");
                    case 7 -> {System.out.println("""
						Welicome to Message settings option, please pick any option below
						1.Set 1
						2.Common
				Please input the number to access the message settings option: 
""");
				int option21 = input.nextInt();
					switch (option21){
						case 1-> { System.out.println("""
									Welcome to Set 1
									1.Message centre number
									2.Message sent as
									3.Message validity
				Please input the number to access Set 1 option: 
""");
					int option22 = input.nextInt();
						switch (option22) {
						case 1-> System.out.println("Welicome to Message centre number");
						case 2-> System.out.println("Welicome to Message sent as option");
						case 3-> System.out.println("Welicome to Message validity option");
						default-> System.out.println("Invalid option");
				}
			}
				case 2-> { System.out.println("""
									Welcome to Common
									1.Delivery reports
									2.Reply via same centre
									3.Character support
				Please input the number to access Set 1 option: 
""");
					int option23 = input.nextInt();
						switch (option23) {
						case 1-> System.out.println("Welicome to Delivery reports option");
						case 2-> System.out.println("Welicome to Reply via same centre option");
						case 3-> System.out.println("Welicome to Character support option");
						default-> System.out.println("Invalid option");
				}
			}
                    case 8 -> System.out.println("Welicome to Info service option");
                    case 9 -> System.out.println("Welicome to Voice mailbox number option");
                    case 10 -> System.out.println("You are in Service command editor option");
                    default -> System.out.println("Invalid option");
                }
            default -> System.out.println("That menu isn't available yet");
        }
    }
}