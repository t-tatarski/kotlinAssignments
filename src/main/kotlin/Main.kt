fun main(args: Array<String>) {
    val highScrs= listOf(100,200,304,404,808,994)
    for (ele:Int in highScrs){
        println(ele)
    }
    for ((index, value) in highScrs.withIndex()){
        println("element: $index of array have value: $value ")
    }
    print("\n\ta2\n---------\n")
    var airplane = Airplane("cessna")
    println(airplane.getName())


}