# CampusChatBot

**CampusChatBot** is a simple Java-based chatbot designed to answer campus-related queries. The bot uses a graphical interface built with Java Swing and connects to a MySQL database via JDBC for retrieving campus data. The bot can help students, faculty, and staff with information about the campus, events, departments, and more.

## 🚀 Features
- **User-Friendly GUI**: The chatbot uses Java Swing for a simple and intuitive graphical interface.
- **JDBC Database Integration**: The bot connects to a MySQL database to fetch campus-related data in real-time.
- **Interactive Responses**: The chatbot uses predefined and dynamic responses to answer queries related to the campus.
- **Login Feature**: Users can authenticate before accessing the bot (if required).
- **Configurable Knowledge Base**: The bot's knowledge base can be easily updated through a MySQL database or JSON files.

## 🧑‍💻 Technologies Used
- **Java 17**: Main programming language for building the chatbot and its GUI.
- **MySQL**: Database management system for storing campus-related information.
- **JDBC**: Java Database Connectivity for establishing a connection between Java and MySQL.
- **Java Swing**: A GUI toolkit for creating the user interface of the chatbot.
- **VS Code**: Integrated development environment (IDE) used for coding.

## 📂 Project Structure
CampusChatBot/
│
├── src/ # Source code
│ ├── gui/ # Java Swing GUI files
│ ├── database/ # Database interaction layer
│ ├── bot/ # Chatbot logic
│ └── utils/ # Utility classes
│
├── resources/ # Resources like images, config files
│ ├── config.properties # Configuration file for DB connection, etc.
│ └── bot-responses.json # Static or dynamic bot responses in JSON format
│
├── lib/ # External libraries (e.g., JDBC driver)
│
├── build/ # Compiled classes and build artifacts
├── README.md # Project documentation
└── pom.xml # Maven build configuration (optional)

bash
Copy
Edit

## 🛠 Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/PrernaSingh95/CampusChatBot.git
Install Java 17:

Ensure Java 17 is installed on your system. You can download it from the official Java website.

Set up MySQL:

Download and install MySQL from here.

Create a database for the chatbot (e.g., campus_chatbot) and add your campus data.

Configure Database:

Update the config.properties file in the resources/ folder with your MySQL database credentials.

Example:

properties
db.url=jdbc:mysql://localhost:3306/campus_chatbot
db.username=root
db.password=your_password
Build the project:

If using Maven, run:

bash
mvn clean install
Run the chatbot:

Navigate to the src/ directory and run the ChatWindow.java class.

Example:

bash
java gui.ChatWindow
