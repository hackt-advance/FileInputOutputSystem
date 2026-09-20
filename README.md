# File Input Output System

A simple Java project that helps you manage files from the console.

This project lets you:
- create a new file
- view all files in a folder
- search a file by name
- open a file and read its content
- delete a file and move it to Recycle Bin
- restore a deleted file
- delete all files in the folder
- exit the program

---

## Project Idea

This application is a small file management system built using Java core file handling classes like:
- `File`
- `FileInputStream`
- `FileOutputStream`
- `Scanner`

It works from the command line and is useful for learning how Java interacts with files and folders.

---

## Features

### 1. Create New File
Create a new text file in the main folder.

### 2. Show All Files
List all files available inside the target folder.

### 3. Show File By Name
Check whether a specific file exists.

### 4. Open File By Name
Read the content of a file and print it on the screen.

### 5. Delete File By Name
Delete a selected file and copy it into the Recycle Bin before removing it from the main folder.

### 6. Restore File
Restore a file from the Recycle Bin back into the main folder.

### 7. Delete All Files
Delete all files from the main folder.

### 8. Exit
Close the program.

---

## Files in This Project

- `Launch.java` - main menu and file management program
- `fileMaking.java` - creates sample files in a folder
- `Launch.class` - compiled Java class
- `fileMaking.class` - compiled Java class

---

## How the Program Works

When you run `Launch.java`, a menu appears like this:

```text
Create new File - 1
Show All Files - 2
Show Files By Name - 3
Open Files By Name - 4
Delete File By Name - 5
Restore File - 6
Delete All Files - 7
Exit - 8
```

Based on your choice, the program performs the selected file operation.

---

## Important Note About Folder Paths

This project uses hardcoded absolute paths such as:

```java
/Users/tinkusharma/FileI:0Project.java/FileFolder
/Users/tinkusharma/FileI:0Project.java/RecycleBin
```

These paths are specific to the developer's computer. Before running the project, you must update these paths to your own machine's folder location.

Example:

```java
String folderPath = "C:/Users/YourName/Desktop/FileFolder";
String recycleBinPath = "C:/Users/YourName/Desktop/RecycleBin";
```

---

## Setup Instructions

### Prerequisites
- Java JDK installed
- A text editor or IDE (VS Code, IntelliJ IDEA, Eclipse)

### Compile the Java file

Open terminal in the project folder and run:

```bash
javac Launch.java
```

### Run the program

```bash
java Launch
```

---

## Example Workflow

1. Create a folder named `FileFolder` on your system.
2. Create another folder named `RecycleBin`.
3. Update the hardcoded paths in `Launch.java`.
4. Compile and run the project.
5. Use the menu to create, view, open, delete, and restore files.

---

## Sample File Creation

`fileMaking.java` creates 10 sample files automatically:

```text
abc-1.txt
abc-2.txt
abc-3.txt
...
abc-10.txt
```

This is useful for testing the file operations quickly.

---

## Example of File Delete and Restore Flow

### Delete file
- program reads the selected file
- copies its content to the Recycle Bin
- deletes the original file from the main folder

### Restore file
- reads the file from Recycle Bin
- copies it back to the main folder
- deletes it from the Recycle Bin

---

## Learning Points

This project helps you understand:
- Java file handling
- creating and deleting files
- reading and writing file data
- using folders/directories
- using loops and conditions for menu-based programs
- using `FileInputStream` and `FileOutputStream`

---

## Future Improvements

This project can be improved by:
- using relative paths instead of absolute paths
- adding validation for invalid input
- creating proper exception handling
- using classes and OOP design
- supporting file extension check
- adding a better user interface

---

## Conclusion

This is a beginner-friendly Java file management project. It is simple, practical, and great for learning how Java works with files and folders.

If you want to explore Java file operations, this project is a good starting point.

---

## Author

Created as a Java file handling practice project.

---

## License

This project does not include a specific license file.

