# 📂 Writing Different File Types

## 📝 Introduction
This project demonstrates how to **create, read, and write** both **text files** and **binary files** in Java.  
It shows the differences between:  
- ✍️ **Human-readable formats** (`.txt`)  
- 💾 **Non-human-readable formats** (`.dat`)  

Java provides different classes and streams to handle them effectively, and this lab shows how!  

---

## 🎯 Goal
✅ Practice writing and reading **text** and **binary** files in Java.  
✅ Learn how to store strings, objects, and numbers in different file formats.  
✅ Understand why some files can be opened in editors and others cannot.  

---

## 📄 Files in the Project
There are **four output files** generated throughout the lab:

| 📂 File Name   | 📝 Manipulated With | 📑 Type | ⚙️ Description |
|----------------|--------------------|---------|----------------|
| `file1.txt`   | `FileWriter.write()` | Text    | Stores plain text data (can be opened in any editor). |
| `file3.txt`   | `PrintWriter.println()` | Text | Stores plain text with line formatting (readable in editors). |
| `file2.dat`   | `FileOutputStream.write()` | Binary | Generic binary file → not human-readable. |
| `file4.dat`   | `DataOutputStream.writeUTF()`, `writeInt()`, `writeDouble()` | Binary | Stores structured binary data (string, int, double). Not readable in editors. |

> 💡 **Note from the lab:**  
> *“The file2.dat file (and the file4.dat in the next task) is actually a binary file, so you’ll not be able to see its content with the help of any text editor.”*  

---

## 📚 Project Structure
| File         | Purpose |
|--------------|---------|
| `Main.java`  | 🚀 Entry point of the program; coordinates file operations. |
| `Person.java`| 👤 Class used to represent and serialize objects. |
| `file1.txt`  | 📝 Example plain text file. |
| `file2.dat`  | 💾 Binary data file written with `FileOutputStream`. |
| `file3.txt`  | 📝 Text file written with `PrintWriter`. |
| `file4.dat`  | 💾 Binary file written with `DataOutputStream`. |

---

## 🔍 `.dat` vs `.txt`

- 📑 **`.txt`** → Plain text, **human-readable**, encoded with UTF-8 or ASCII.  
- 💾 **`.dat`** → A **generic binary file extension**. Usually contains structured or raw data created by a program.  
  - Not meant to be read manually, only by the program that generated it.  

👉 Example: A `.dat` file might contain serialized objects, numbers, or even image bytes.  

---

## 🏁 Conclusion
This lab reinforces how Java uses different I/O streams for file management:  

- ✍️ **Character Streams** → `FileReader`, `FileWriter`, `PrintWriter` → Text Files.  
- 💾 **Binary Streams** → `FileOutputStream`, `DataOutputStream` → Binary Files.  

Perfect foundation for future projects:  
✔️ Logging system 🗒️  
✔️ Saving user data securely 🔐  
✔️ Handling binary objects 📦  

---

✨ Developed as a lab assignment for the **Coursera Java Programming course**.
