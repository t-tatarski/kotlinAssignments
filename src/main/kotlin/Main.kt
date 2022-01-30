import java.util.*
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt


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
    print("\n\ta3\n---------\n")
    println(::addSum.invoke(5,10))

    println("menu\n 1 = outloop ")

    do {
        val input = Scanner(System.`in`)
        val someWord = input.nextLine()
        print("select $someWord \n")
    }while (someWord.trim()!="1")

    for (x in 1..6){
        print("- $x : "+(1..49).random()+" \n")
    }

    val longval:Long? = 121212
    // val intval: Int= longval    conversion error

    val rv:Int =7
    //equivalent  if(rv<=10 && rv>=1){ //do something }
    if ( rv in 1..10){
        print("$rv is lower than 11 and greter than 0")
    }

    val rnd = List<Int>(6){ Random.nextInt(1,49)}
    val rndSorted = rnd.sorted()
    for (r in rndSorted){
        println(r)
    }
    showHashCode(1)
    //Q11
    val rndm = Random.nextInt(1,6)
    when(rndm){
        1 -> println("die is 1")
        2 -> println("die is 2")
        3 -> println("die is 3")
        in 4..6 -> println("die is greater than 3 ")
    }




}

fun showHashCode(obj: Any) {
    println("${obj.hashCode()}")

}

fun addSum(a:Int,b:Int):Int {
return a+b
}
