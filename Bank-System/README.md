# Gym Management System

## Overview

The **Gym Management System** is a command-line Java application designed to manage various aspects of a gym, including gym halls, trainers, customers, equipment, and exercise plans. The system provides an interactive menu-driven interface where users can perform different operations such as adding, viewing, and removing data related to the gym's resources.

## Features

1. **Manage Gym Resources**:
   - Add, view, and remove customers, trainers, gym halls, equipment, and exercise plans.
   - Each gym hall contains multiple pieces of equipment.
   - Trainers can be assigned to specific exercise plans and gym halls.

2. **Customer Subscriptions**:
   - Customers can subscribe to gym halls with a designated trainer and exercise plan.

3. **Command-Line Interface**:
   - The system uses a text-based interface where users can select options from a menu to manage the gym's resources.

## Project Structure

- **Main Class**: Handles the application's logic and user interaction via the command-line interface.
- **Supporting Classes**:
  - `Customers`: Manages customer data.
  - `Trainers`: Manages trainer data.
  - `Equipments`: Manages equipment data.
  - `GymHall`: Represents a gym hall.
  - `ExercisePlan`: Represents an exercise plan.

## How to Run

1. **Setup**:
   - Ensure you have Java installed on your machine.
   - Compile the Java source files.

2. **Execution**:
   - Run the `Main` class.
   - Follow the on-screen prompts to interact with the system.

## Usage

After running the program, you’ll be presented with a menu. Each option corresponds to a different operation:

- **Add Customer**: Add a new customer to the system.
- **Add Trainer**: Add a new trainer to the system.
- **Add Equipment**: Add a new piece of equipment.
- **Add Gym Hall**: Add a new gym hall.
- **Add Exercise Plan**: Create and add a new exercise plan.
- **Show All Customers**: Display all customers in the system.
- **Show All Trainers**: Display all trainers in the system.
- **Show All Equipment**: Display all equipment in the system.
- **Show Gym Halls**: Display all gym halls along with the equipment they contain.
- **Show Exercise Plans**: Display all exercise plans.
- **Remove Customer**: Remove a customer by ID.
- **Remove Trainer**: Remove a trainer by ID.
- **Remove Equipment**: Remove equipment by ID.
- **Remove Gym Hall**: Remove a gym hall by name.
- **Remove Exercise Plan**: Remove an exercise plan by ID.
- **Exit**: Exit the system.

## Future Enhancements

- **GUI Implementation**: Upgrade the system to include a graphical user interface.
- **Database Integration**: Replace text-based storage with a database for better data management and scalability.
- **Advanced Scheduling**: Implement more sophisticated scheduling features for trainers and customers.
