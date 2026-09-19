import javax.swing.*;
import java.awt.*;
import java.util.*;

public class AIChatbot {

    // NLP: Normalize the user's text
    public static String normalizeText(String input) {
        return input.toLowerCase()
                .replaceAll("[^a-zA-Z0-9\\s]", "")
                .trim();
    }

    // NLP: Tokenization
    public static String[] tokenize(String input) {
        return normalizeText(input).split("\\s+");
    }

    // NLP + Rule-based response system
    public static String getResponse(String input) {

        String normalizedInput = normalizeText(input);
        String[] words = tokenize(input);

        Set<String> wordSet = new HashSet<>(Arrays.asList(words));

        if (wordSet.contains("hello") ||
            wordSet.contains("hi") ||
            wordSet.contains("hey")) {

            return "Hello! How can I help you today?";
        }

        if (wordSet.contains("name")) {
            return "I am CodeAlpha AI Chatbot, a Java-based chatbot.";
        }

        if (normalizedInput.contains("how are you")) {
            return "I'm doing great! Thanks for asking.";
        }

        if (wordSet.contains("java")) {
            return "Java is a popular object-oriented programming language.";
        }

        if (wordSet.contains("study") ||
            wordSet.contains("studies")) {

            return "Stay consistent with your studies and practice regularly!";
        }

        if (wordSet.contains("help")) {
            return "Sure! You can ask me about Java, studies, or general questions.";
        }

        if (wordSet.contains("thank") ||
            wordSet.contains("thanks")) {

            return "You're welcome!";
        }

        if (wordSet.contains("bye") ||
            wordSet.contains("exit")) {

            return "Goodbye! Have a great day!";
        }

        return "Sorry, I don't understand that yet. Try asking something else.";
    }

    // GUI
    public static void createGUI() {

        JFrame frame = new JFrame("CodeAlpha AI Chatbot");

        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JTextArea chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setLineWrap(true);
        chatArea.setWrapStyleWord(true);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 16));

        JScrollPane scrollPane = new JScrollPane(chatArea);

        JTextField inputField = new JTextField();
        JButton sendButton = new JButton("Send");

        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(inputField, BorderLayout.CENTER);
        bottomPanel.add(sendButton, BorderLayout.EAST);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        chatArea.append("Bot: Hello! I'm your AI Chatbot. How can I help you?\n\n");

        Runnable sendMessage = () -> {

            String userInput = inputField.getText().trim();

            if (!userInput.isEmpty()) {

                chatArea.append("You: " + userInput + "\n");

                String response = getResponse(userInput);

                chatArea.append("Bot: " + response + "\n\n");

                inputField.setText("");

                if (userInput.equalsIgnoreCase("bye") ||
                    userInput.equalsIgnoreCase("exit")) {

                    sendButton.setEnabled(false);
                    inputField.setEnabled(false);
                }
            }
        };

        sendButton.addActionListener(e -> sendMessage.run());

        inputField.addActionListener(e -> sendMessage.run());

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(AIChatbot::createGUI);
    }
}