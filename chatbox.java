import java.util.HashMap;
import java.util.Scanner;
public class chatbox.java{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> knowledgeBase = new HashMap<>();

        // Populate knowledge base
        knowledgeBase.put("hello", "Hi there! How can I help you?");
        knowledgeBase.put("how are you", "I'm a chatbot, so I don't have feelings, but I'm ready to assist you!");
        knowledgeBase.put("what is your name", "I am a simple chatbot created to help you.");
        knowledgeBase.put("bye", "Goodbye! Have a great day!");
        knowledgeBase.put("help", "I can answer questions about general topics. Try asking me 'what is your name' or 'how are you'.");

        System.out.println("Chatbot: Hello! Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("bye")) {
                System.out.println("Chatbot: Goodbye! Have a great day!");
                break;
            }

            String response = knowledgeBase.getOrDefault(userInput, "I'm sorry, I don't understand that. Can you rephrase?");
            System.out.println("Chatbot: " + response);
        }

        scanner.close();
    }

}