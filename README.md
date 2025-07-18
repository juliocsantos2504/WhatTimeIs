# 🕒 WhatTimeIs

Java project created as part of the **Backend Java Bootcamp** by **Santander** on the **DIO (Digital Innovation One)** platform.

## 📚 About the Project

The goal was to implement a **class hierarchy** to represent different types of clocks (American and Brazilian), practicing the core concepts of **Object-Oriented Programming (OOP)**:

- ✅ Inheritance  
- ✅ Polymorphism  
- ✅ Abstraction  
- ✅ Encapsulation  

---

## 📋 Exercise Prompt

> Write a class hierarchy for building clocks for different parts of the world.  
> 
> Define a **parent class** with the properties `hour`, `minute`, and `second`, along with their respective **getters and setters**, following the **rules of a real clock**.  
> 
> Implement a method that returns the time in the format `HH:MM:SS`.  
> 
> From this base class, create two implementations:  
> 
> - `American Clock` (12-hour format with AM/PM)  
> - `Brazilian Clock` (24-hour format)
>
> Additionally, define an **abstract method** in the superclass, to be implemented by each subclass. This method should **receive another clock (of any implementation)**, extract its data, and use it to update the current clock according to its specific rules.

---

## 🧠 OOP Concepts Practiced

- **Abstraction**: Creating a generic abstract superclass for clocks.
- **Encapsulation**: Using access modifiers and `get/set` methods with validations.
- **Inheritance**: Specializing the base clock into `BrazilianClock` and `AmericanClock`.
- **Polymorphism**: `convert()` method implemented differently in each subclass.

---

## 💡 Project Structure

```bash
WhatTimeIs/
├── Clock.java              # Abstract superclass (generic clock)
├── BRClock.java            # Brazilian clock implementation
├── USAClock.java           # American clock implementation
└── Main.java               # Main class for testing

▶️ How to Run
1. Compile:
javac --enable-preview --release 21 *.java

2. Run:
java --enable-preview Main

⚠️ If you’re using IntelliJ IDEA, add --enable-preview to VM options:

Run > Edit Configurations > VM options: --enable-preview

🚀 Author
Julio César dos Santos Pereira
🔗 GitHub: @juliocsantos2504

🏁 License
This project is open for educational purposes.

