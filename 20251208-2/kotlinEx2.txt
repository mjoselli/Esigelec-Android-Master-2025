/**
 * KOTLIN FUNDAMENTALS WORKSHOP
 * ----------------------------
 * Copy this into https://play.kotlinlang.org/
 * Press the Purple "Run" button.
 */

// 1. DATA CLASSES
// A class strictly to hold data. It automatically generates toString(), equals(), etc.
data class Task(
    val id: Int, 
    val title: String, 
    var isCompleted: Boolean,
    val priority: Int
)

fun main() {
    println("--- 1. Variables & Type Inference ---")
    // 'val' is immutable (Read-only). Always prefer 'val'.
    val appName = "TaskMaster" 
    // appName = "NewName" // This would cause an ERROR
    
    // 'var' is mutable (Changeable).
    var activeUserCount = 100
    activeUserCount = 101 // This is OK
    
    // String Templates: Use '$' to insert variables into strings
    println("Welcome to $appName with $activeUserCount users.")


    println("\n--- 2. Null Safety (The Billion Dollar Fix) ---")
    // Kotlin forces you to say if a variable can be null.
    
    var nonNullableString: String = "I cannot be null"
    // nonNullableString = null // COMPILER ERROR
    
    var nullableString: String? = "I might be null"
    nullableString = null // This is OK
    
    // The Safe Call Operator (?.)
    // If nullableString is null, it returns "null" instead of crashing
    println("Length is: ${nullableString?.length}")
    
    // The Elvis Operator (?:)
    // If the left side is null, use the right side (default value)
    val length = nullableString?.length ?: 0
    println("Safe Length is: $length")


    println("\n--- 3. Collections & Lambdas ---")
    val myTasks = listOf(
        Task(1, "Buy Milk", false, 1),
        Task(2, "Learn Kotlin", true, 2),
        Task(3, "Walk the Dog", false, 3),
        Task(4, "Sleep", false, 1)
    )

    // .filter { it... } -> Returns a new list matching the condition
    val pendingTasks = myTasks.filter { task -> !task.isCompleted }
    println("Pending Tasks: $pendingTasks")

    // .map { it... } -> Transforms the list into something else (e.g., just titles)
    val taskTitles = myTasks.map { it.title }
    println("Just Titles: $taskTitles")


    println("\n--- 4. Control Flow (When & If) ---")
    // We can iterate through lists easily
    for (task in myTasks) {
        val statusIcon = getStatusIcon(task.isCompleted)
        val priorityLabel = describePriority(task.priority)
        println("$statusIcon ${task.title} ($priorityLabel)")
    }
}

// 5. FUNCTIONS
// Standard Syntax
fun describePriority(level: Int): String {
    // 'when' is a powerful replacement for 'switch'
    // It can also return a value directly!
    return when (level) {
        1 -> "Low"
        2 -> "Medium"
        3 -> "High"
        else -> "Unknown"
    }
}

// Single-Expression Syntax
// If a function strictly returns one thing, use '=' to remove curly braces
fun getStatusIcon(isDone: Boolean) = if (isDone) "✅" else "❌"