# Assignment 3 - Dice game

## Note: The text below may change slightly until the start of module 3 based on feedback

## Most typical mistakes that students make are:
* they do not validate input as per the requirements. Please see how you will be graded section.
* they do not use constants
* they do not read the coding rules
* they do the assignment without reading about the theory
* they have not seen the assignment two overview video on Canvas (it will be posted at the start of module 3, the week that follows the assignment 2 deadline)

## Learning outcomes
The student must show ability and skill in using logical expressions (conditions), selections (choices), and iterations (repetitions).

## Prerequisites
The assignment requires you to study the material in module 3 and bring your knowledge and feedback from previous assignments.

## Task
You will create a program that simulates a variation of a popular game called "Shut the box. We will call this game "the dice game 12". **Please note, do NOT google "shut the box game rules and try to implement that, instead follow the rules below, We mentioned "Shut the box" as an inspiration to this assignment"**

Begin the task by constructing a flow chart and program logic on paper. Then describe your structure in text form (pseudocode) in the comment header of the program so that an outsider can understand what the program does and how your logic/algorithm works.

The game consists of three dice rolls and involves getting a sum of 12 across three rolls of dice in each round. Each dice can only be rolled once per round. Example: If player selects to roll dice #2, then the player cannot roll dice #2 again in the current round. 

In each round, the player must be able to choose (by pressing on keyboard) between:
- 1 to roll the dice 1
- 2 to roll the dice 2
- 3 to roll the dice 3
- q to exit the game

### Note the following:
* The program must randomly find a value on the selected dice and then calculate the score.
* The program should also present the number of wins and the number of rounds lost.
* The program should continue until the user chooses to cancel the game by pressing q on the keyboard.
* The definition of win is when the sum of the dice on all three rolls is 12, and
* The definition of loss is a sum exceeding 12 after all three dice have been rolled.
* If the sum after three rolls is less than 12, there will be no win or loss, but you go straight to the next round.

## Example Scenario
```
Welcome to dice game 12. You must roll 1-3 dice and try to get the sum of 12 ...

Enter which dice you want to roll [1,2,3] (exit with q): 4
Sorry, that is an invalid entry. Try again. Valid entries are 1, 2, 3, and q

Enter which dice you want to roll [1,2,3] (exit with q): w
Sorry, that is an invalid entry. Try again. Valid entries are 1, 2, 3, and q

Enter which dice you want to roll [1,2,3] (exit with q): string
Sorry, that is an invalid entry. Try again. Valid entries are 1, 2, 3, and q

Enter which dice you want to roll [1,2,3] (exit with q): 1
6 0 0 sum: 6 #win: 0 # loss: 0 
Enter which dice you want to roll [1,2,3] (exit with q): 2
6 1 0 sum: 7 # win: 0 # loss: 0 
Enter which dice you want to hit [1,2,3 ] (exit with q): 3
6 1 2 sum: 9 #win: 0 #loss: 0 
You neither won nor lost the game.

Next round! 

Enter which dice you want to roll [1,2,3] (exit with q): 1
6 0 0 sum: 6 #win: 0 # loss: 0 
Enter which dice you want to roll [1,2,3] (exit with q): 1
Sorry, you have already rolled that dice. Try again
Enter which dice you want to roll [1,2,3] (exit with q): 2
6 3 0 sum: 9 #win: 0 #loss: 0 
Enter which dice you want to roll [1,2,3] (exit with q): 3
6 3 3 sum: 12 #win: 1 #loss: 0 
You won!!

Next round! 

Enter which dice you want to roll [1,2,3] (exit with q): 2
0 6 0 sum: 6 #win: 0 # loss: 0 
Enter which dice you want to roll [1,2,3] (exit with q): 1
3 6 0 sum: 9 #win: 0 #loss: 0 
Enter which dice you want to roll [1,2,3] (exit with q): 3
3 6 5 sum: 14 #win: 1 #loss: 1 
You lost!!

Next round! 

Enter the dice you want to roll [1,2,3] (exit with q): q
#win: 1 #loss: 1 
Game Over!

```
In this task, you must check/manage the user's entries and provide relevant feedback if an incorrect entry occurs. The program should not crash, no matter what the user enters. In each round, you can only roll each die once. Use constants for values that do not change.

## How will you be graded / What do you need to take care of
* You will be graded and checked for functional and non-functional requirements
* Functional requirements
  * Code output is according to the specification given in the task description
  * Validation is important
    * Same dice number cannot be selected more than once in the same round
    * If the sum is 12, then the win count increments by 1
    * if the sum is less than 12, there is no change to the win and loss count
    * if the sum is more than 12, then the loss count increments by 1
    * Appropriate messages are shown
      * Error messages are shown, for example, from the sample above:
        * Sorry, you have already rolled that dice. Try again
        * Sorry, that is an invalid entry. Try again. Valid entries are 1, 2, 3, and q
      * Status and other helpful messages are shown, for example, from the sample above
        * Welcome to dice game 12. You must roll 1-3 dice and try to get the sum of 12 ...
        * Enter which dice you want to roll [1,2,3] (exit with q): 
        * 3 6 5 sum: 14 #win: 1 #loss: 1
        * You won!!
        * You lost!!
        * You neither won nor lost the game.
        * Next round!
        * Game Over!
* Non Functional requirements
  * Strictly follow the coding rules

## Note to those who have already done a programming course before
* You may know arrays, and using that may make the assignment easier to solve. But, please solve the assignment as if you are yet to learn these topics in java programming. In other words, use everything you have learned until Module 3 in the course to solve the assignment.

## Submit the solution
Before you turn in the assignment, please check that your code follows the course's requirements for formatting and coding rules (see the "How will you be graded / What do you need to take care of" section above). 

## Plagiarism 
Submissions may be checked for plagiarism, and the student will be reported to the university's Disciplinary Board in case of cheating.

## Correction
If you turn it in on time, the assignment will be corrected in three weeks. Any submission made after the deadline will have delays; we cannot say how long this takes.

**NOTE! If you need help to complete the task, you can ask the primary teacher instead of submitting a half-finished solution.** 

The grading teacher marks how well the code meets the assignment requirements. Any failed submissions must be reworked and resubmitted to achieve an approved level. On replit, the resubmit button is on the top-right. On Canvas, open the assignment page and click on the "New Attempt" button on the top-right to resubmit. 