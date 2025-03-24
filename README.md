# Tic-Tac-Toe Game in Java

## Introduction
This is a simple command-line Tic-Tac-Toe game implemented in Java. It allows a player to compete against an AI system, taking turns to place their marks ('X' for the player and 'O' for the system) on a 3x3 grid. The game continues until either the player or the system wins or all positions are filled, resulting in a draw.

## Features
- Command-line interface
- Player vs. AI (random move selection)
- Win detection logic
- Draw detection

## How to Play
1. Run the program.
2. The game will display the 3x3 board with numbered positions.
3. The player selects a position (1-9) to place an 'X'.
4. The system will randomly select an available position for 'O'.
5. The game continues until either the player or the system wins, or all spaces are filled.
6. The result (win/loss/draw) is displayed at the end.

## Installation & Running the Game
### Prerequisites
- Java Development Kit (JDK) installed

### Steps to Run
1. Clone this repository:
   ```sh
   git clone https://github.com/your-username/tic-tac-toe-java.git
   cd tic-tac-toe-java
   ```
2. Compile the Java file:
   ```sh
   javac Index.java
   ```
3. Run the game:
   ```sh
   java Index
   ```

## Game Board Representation
Each number represents a position on the 3x3 grid:
```
1 | 2 | 3
---------
4 | 5 | 6
---------
7 | 8 | 9
```
Players enter the number corresponding to the position they want to play.

## Example Gameplay
```
Tic-Tac-Toe
You (X)
System (O)
Current Board:
1 2 3
4 5 6
7 8 9

Enter your move (1-9): 5
System's move:
X 2 3
4 O 6
7 8 9
```

## Future Improvements
- Implement a smarter AI using Minimax algorithm.
- Add a GUI for a more interactive experience.
- Allow two-player mode.

## License
This project is open-source and available under the MIT License.


