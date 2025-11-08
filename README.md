# Java Programming Projects Suite

This repository contains three independent Java programs demonstrating key computer science and software engineering concepts:  
- **WebCrawler** – Networking, I/O, and data structures  
- **JavaFX GUI Application** – Event-driven programming and GUI rendering  
- **JUnit Test Suite** – Unit testing and exception handling  

Each project showcases object-oriented design, clean coding, and modular architecture.

---

## 🕸️ WebCrawler

A simple **web crawler** that takes a user-provided URL, explores its hyperlinks, and prints discovered links to the console.  
The program uses **Java’s URL and I/O classes** to read and process webpage content.

### Features
- Reads a starting URL from the user.  
- Recursively crawls pages up to 100 links deep.  
- Extracts sub-URLs by detecting `"http"` in HTML lines.  
- Uses **ArrayLists** to track pending and traversed URLs.  
- Handles malformed URLs and I/O exceptions gracefully.  

### Technologies & Concepts
- **Java Networking API** (`java.net.URL`)  
- **I/O and Exception Handling**  
- **Collections Framework (ArrayList)**  
- **OOP and modular design**  

### Example Output


---

## 🎨 JavaFX Application

A **JavaFX GUI demo** that displays a rectangle, a circle, and a styled text label inside a window.  
The program illustrates **layout management, shape drawing, and text styling** in JavaFX.

### Features
- Displays a **StackPane** containing a rectangle, circle, and label.  
- Demonstrates **color fills**, **stroke styling**, and **font customization**.  
- Uses **scene graph hierarchy** and **event-driven architecture** typical of JavaFX apps.  

### Technologies & Concepts
- **JavaFX API** (`javafx.scene`, `javafx.stage`, `javafx.scene.control`)  
- **Scene Graph and Layouts (StackPane)**  
- **Shapes and Text Rendering**  
- **Event-driven Programming**

### Example UI
🟧 Orange rectangle background  
🟣 Violet circle overlay  
🧾 Centered text label “MATT DAVIES” in bold italic Avenir font  

---

## 🧪 JUnit Test Suite

A set of **JUnit tests** for validating the `Money` class, ensuring reliable addition and exception handling.

### Features
- Tests basic addition of money amounts with the same currency.  
- Ensures exceptions are correctly thrown for invalid (negative) values.  
- Demonstrates **Test-Driven Development (TDD)** workflow.  

### Technologies & Concepts
- **JUnit 4 Framework**
- **Assertions and Exception Testing**
- **OOP and Encapsulation**

### Example Tests
```java
@Test
public void simpleAdd() throws Exception {
    Money m12CAD = new Money(12, "CAD");
    Money m14CAD = new Money(14, "CAD");
    Money known = new Money(26, "CAD");
    assertTrue(known.equals(m12CAD.add(m14CAD)));
}
