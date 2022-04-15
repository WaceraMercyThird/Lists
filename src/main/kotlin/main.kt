//1.a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
//2.a list of people’s heights in metres. Write a function that returns
//the average height and the total height
//3.a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
//4.a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//5.a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.

fun main() {
    evenListStrings(
        listOf(
            "Mary",
            "James",
            "Collin",
            "Kate",
            "Winnie",
            "Mollen",
            "Joel",
            "Jonathan",
            "Maxine",
            "Millicent"
        )
    )

    var height = listOf(45.7, 36.5, 18.9, 34.1, 96.9, 79.1)
    println(height.average())
    println(height.sum())

    var people = listOf(
        Person("Juliet", 45, 67.6, 67.0),
        Person("Hope", 11, 90.2, 82.3),
        Person("Velo", 19, 32.3, 53.3),
        Person("Betty", 12, 45.2, 90.2)
    )
    var descendingSortedPerson = people.sortedByDescending { person -> person.age }
    println(descendingSortedPerson)

    addObject()

    var lexus  = Car("Kcb4578",78.90)
    var toyota = Car("Kcb4578",67.34)
    var nissan  = Car("Kcb4578",30.34)
    var cars = listOf(lexus,toyota,nissan)
    println(avgMileage(cars))

}

fun evenListStrings(names: List<String>): List<String> {
    names.forEachIndexed { index, name ->
        if (index % 2 == 0)
            println(name)
    }
    return names
}

data class AverageMeasurements(var height: Double, var totalheight: Double)
fun averageAndHeight(height: Collection<Double>): AverageMeasurements {

    var avg = height.average()
    var totalheight = height.sum()

    return AverageMeasurements(avg, totalheight)
}

data class Person(var name: String, var age: Int, var height: Double, var weight: Double)

fun addObject() {
    val employees= mutableListOf(
        Person("Juliet", 45, 67.6, 67.0),
        Person("Hope", 11, 90.2, 82.3),
        Person("Velo", 19, 32.3, 53.3),
        Person("Betty", 12, 45.2,54.6)
    )
    println(employees)
    employees.add(
        Person("Monica", 12, 67.6,91.67)
    )
    println(employees)

}
data class Car(var registration: String, var mileage: Double)
    fun avgMileage(motor: List<Car>):Double{
            var result=0.0
            motor.forEach { car ->
                result+=car.mileage

            }

            return result/motor.count()

        }



