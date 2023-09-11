package lesson_2

fun main() {
    var numberWorker = 50
    var workersSalaries = 30000
    var numberIntern = 30
    var internSalaries = 20000

    var totalWorkersSalaries = numberWorker * workersSalaries
    var totalInternSalaries = numberIntern * internSalaries
    var allSalaries = totalWorkersSalaries + totalInternSalaries
    var averageSalaries = allSalaries / (numberWorker + numberIntern)

    println(totalWorkersSalaries)
    println(allSalaries)
    println(averageSalaries)
}