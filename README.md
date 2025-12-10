# Esigelec Android Development Master 2025

This repository contains workshops for the Esigelec Android Master program in 2025.

## Course Structure

Classes are organized by date with morning (1) and afternoon (2) sessions.

---

## 📅 December 8, 2025

### Session 1 (Morning) - [`20251208-1/`](20251208-1/)
*Content: Android Foundations*
- **Introduction to Android & Mobile Ecosystem**: Platform overview, app components, APK/aab basics, stores, devices & form factors
- **Introduction to App UI with Figma**: Frames, components, layout constraints, exporting assets for Android
**Figma Exercise**

---

### Session 2 (Afternoon) - [`20251208-2/`](20251208-2/)
*Content: Kotlin  Features*

- **Variables & Type Inference**: Understanding `val` (immutable) vs `var` (mutable)
- **String Templates**: Using `$` and `${}` for string interpolation
- **Functions**: Function declaration with parameters and return types, including single-expression functions
- **Named & Default Parameters**: Calling functions with parameter names and default values
- **Control Flow**:
  - `if/else` statements and expressions
  - `when` expressions for pattern matching
  - Range checks (`in 3..10`)
- **Loops**: `for` loops with ranges and collections
- **Collections**: `mutableListOf()` for creating dynamic lists
- **Object-Oriented Programming**:
  - Class declaration with properties and methods
  - `open` classes for inheritance
  - Class inheritance with constructor delegation
- **Data Classes**: Automatic generation of `toString()`, `equals()`, `hashCode()`, and `copy()`
- **Null Safety** (The Billion Dollar Fix):
  - Non-nullable vs nullable types (`String` vs `String?`)
  - Safe call operator (`?.`)
  - Elvis operator (`?:`) for default values
- **Collections & Functional Programming**:
  - `listOf()` for immutable lists
  - `.filter { }` for filtering collections
  - `.map { }` for transforming collections
  - Lambda expressions
- **Advanced Control Flow**:
  - `when` expressions with multiple patterns
  - Iterating through collections with for loops
  - Single-expression functions with `if/else`

**Kotlin Exercises**


#### 🚀 How to Run
Copy the code examples from the exercise files and paste them into [Kotlin Playground](https://play.kotlinlang.org/). Press the purple **Run** button to execute the code.


## 📅 December 9, 2025

### Session 1 (Morning) - [`20251209-1/`](20251209-1/)
*Content: Android Studio & First App*

- **Android Studio Setup**: Installing Android Studio, SDK configuration, creating first project
- **MainActivity & Jetpack Compose Basics**: Understanding the entry point of Android apps
- **Composable Functions**: Building UI with `@Composable` annotation
- **Basic UI Components**: `Text`, `Surface`, and layout composables
- **Preview Function**: Using `@Preview` for UI development without running the app

**Workshop Exercise: Vilain Exercise**


### Session 2 (Afternoon) - [`20251209-2/`](20251209-2/)
*Content: The Core Loop (State & Lists)*

- **Project Creation**: Setting up a new Android Compose project structure
- **The Data Model**: Understanding data structures and how to model shopping items
- **LazyColumn**: Building scrollable lists with Jetpack Compose
- **Material Design 3 Surface**: Applying visual design and styling to list items
- **State Management**: 
  - `mutableStateOf()` for reactive state
  - `remember` for composable state persistence
  - State hoisting for parent-child communication
- **List Operations**: Adding and removing items from lists
- **Event Handling**: Button clicks and user interactions
- **Composable Reusability**: Creating reusable UI components

**Workshop Exercise: The Shopping list**

## 📅 December 10, 2025

### Session 1 (Morning) - [`20251210-1/`](20251210-1/)
*Content: Architecture & Navigation (MVVM, Multi-Screen Apps)*

- **Why Architecture?** Moving UI/logic/navigation out of a single Activity
- **MVVM Basics (Chef & Waiter)**: View = UI only; ViewModel = data/logic; survives rotation
- **Navigation Setup**: Add `androidx.navigation:navigation-compose` dependency; sync Gradle
- **Gradle Config**: Project-level and module-level updates for Compose + Navigation (versions may vary)
- **ViewModel Creation**: `TaskViewModel` holds task list and `getTask(id)`; `TaskItem` gains `details`
- **Detail Screen**: `DetailScreen(taskId, viewModel, onBack)` shows task info and back button
- **NavHost & Routes**: `AppNavigation` with `NavHost`, routes `task_list` and `detail_screen/{taskId}`, `rememberNavController`, shared `viewModel()`
- **List Screen Refactor**: `TaskScreen(viewModel, onTaskClick)` pulls data from ViewModel; `TaskRow` clickable via `Surface(onClick)`

**Workshop Exercise: About Screen**

