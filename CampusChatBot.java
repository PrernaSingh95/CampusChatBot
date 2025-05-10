import java.util.*;

public class CampusChatBot {
    private static final Map<String, String> knowledgeBase = new HashMap<>();

    public static void main(String[] args) {
        initializeKnowledgeBase();
        Scanner scanner = new Scanner(System.in);

        System.out.println("CampusBot: Hi! Ask me anything about our campus (type 'exit' to quit).");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.contains("exit") || userInput.contains("bye")) {
                System.out.println("CampusBot: Goodbye! Have a great day.");
                break;
            }

            boolean found = false;
            for (String keyword : knowledgeBase.keySet()) {
                if (userInput.contains(keyword)) {
                    System.out.println("CampusBot: " + knowledgeBase.get(keyword));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("CampusBot: Sorry, I don't have an answer for that. Try rephrasing.");
            }
        }

        scanner.close();
    }

    private static void initializeKnowledgeBase() {
        knowledgeBase.put("admission", "Admissions are open from June to August. Visit the admissions office or our website.");
        knowledgeBase.put("library", "The library is open from 8 AM to 10 PM on weekdays.");
        knowledgeBase.put("hostel", "Hostels are available for both boys and girls. Contact the hostel office for more info.");
        knowledgeBase.put("placement", "Our placement cell is active year-round. Companies visit mainly from October to March.");
        knowledgeBase.put("canteen", "The canteen serves food from 9 AM to 7 PM daily.");
        knowledgeBase.put("fees", "Fee details are available on the official website or the accounts department.");
        knowledgeBase.put("courses", "We offer courses in engineering, management, arts, and science.");
        knowledgeBase.put("transport", "Bus services are available from 6 AM to 7 PM covering major city routes.");
        knowledgeBase.put("sports", "The campus has facilities for cricket, football, basketball, and a gym.");
        knowledgeBase.put("fees", " the transport fee is 1200 and university fee is 170000.");
        knowledgeBase.put("strength", "the strength in our university is about 1200000.");
    }
}

