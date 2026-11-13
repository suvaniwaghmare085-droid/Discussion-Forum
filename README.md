# Discussion Forum – Java OOP Project

A console-based **Discussion Forum Application** developed using Java. This project demonstrates Object-Oriented Programming (OOP) concepts such as abstraction, inheritance, interfaces, encapsulation, and polymorphism.

## 📌 Project Overview

The Discussion Forum allows users to interact through a simple menu-driven console application. Users can create accounts, post questions, view questions, and manage forum activities.

## ✨ Features

- User login functionality
- Create a new user
- Ask and post questions
- View all questions
- Delete questions
- Upvote functionality
- Automatic ID generation
- Object-Oriented Programming implementation

## 🛠️ Technologies Used

- **Programming Language:** Java
- **IDE:** Visual Studio Code
- **Version Control:** Git and GitHub
- **Java Compiler:** javac

## 📂 Project Structure

```text
Discussion-Forum/
│
├── src/
│   └── com/
│       └── forum/
│           └── ...
│
├── README.md
├── .classpath
├── .project
└── .gitignore
```

The `src` directory contains the Java source files and application packages.

## ⚙️ Prerequisites

Before running the project, make sure you have:

1. Java Development Kit (JDK) installed.
2. Visual Studio Code or another Java-compatible IDE.
3. Git (optional, for cloning the repository).

Verify your Java installation:

```bash
java -version
javac -version
```

Both commands should display the installed Java version.

## 🚀 How to Run the Project

### Step 1: Clone the Repository

Open your terminal and execute:

```bash
git clone https://github.com/suvaniwaghmare085-droid/Discussion-Forum.git
```

### Step 2: Open the Project Folder

```bash
cd Discussion-Forum
```

### Step 3: Compile the Java Files

**For Windows PowerShell:**

```powershell
$files = Get-ChildItem -Path src -Recurse -Filter *.java | ForEach-Object { $_.FullName }

javac -d out $files
```

**For Linux/macOS:**

```bash
mkdir -p out
javac -d out $(find src -name "*.java")
```

### Step 4: Run the Application

After successful compilation, execute:

```bash
java -cp out com.forum.main.DiscussionForum
```

The application will start in the terminal.

## 🔐 Demo Login

Use the following credentials to access the application:

| Field | Value |
|---|---|
| Username | `admin` |
| Password | `admin` |

*These are the demo credentials used for testing.*

## 📋 Application Menu

After successful login, the application displays a menu similar to:

```text
Welcome admin

1. Create new user
2. Ask a question
3. See all questions
4. Log Out

Enter your choice:
```

Select the appropriate option and follow the instructions displayed in the console.

## 🎯 Concepts of OOP Used

- **Abstraction:** Hides implementation details and exposes essential functionality.
- **Encapsulation:** Combines data and methods within classes.
- **Inheritance:** Allows classes to reuse properties and methods from parent classes.
- **Polymorphism:** Supports flexible method implementation and behavior.
- **Interfaces:** Define methods that implementing classes must provide.

## 👩‍💻 Author

**Suvani Waghmare**

## 🔗 GitHub Repository

[Discussion Forum – GitHub](https://github.com/suvaniwaghmare085-droid/Discussion-Forum)

---

⭐ If you find this project useful, feel free to explore the source code and learn from it.

**Developed as part of the UpGrad Java Object-Oriented Programming Assignment.**
