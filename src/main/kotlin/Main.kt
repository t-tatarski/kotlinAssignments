import java.util.*
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt


fun main(args: Array<String>) {
    //Q1
    val highScrs= listOf(100,200,304,404,808,994)
    for (ele:Int in highScrs){
        println(ele)
    }

    for ((index, value) in highScrs.withIndex()){
        println("element: $index of array have value: $value ")
    }
    print("\n\ta2\n---------\n")
    //Q2
    var airplane = Airplane("cessna")
    println(airplane.getName())
    print("\n\ta3\n---------\n")
    println(::addSum.invoke(5,10))

    println("menu\n 1 = outloop ")
    //Q3
    do {
        val input = Scanner(System.`in`)
        val someWord = input.nextLine()
        print("select $someWord \n")
    }while (someWord.trim()!="1")
    //Q4
    for (x in 1..6){
        print("- $x : "+(1..49).random()+" \n")
    }
    //Q5
    val longval:Long? = 121212
    // val intval: Int= longval    conversion error

    val rv:Int =7
    //equivalent  if(rv<=10 && rv>=1){ //do something }
    if ( rv in 1..10){
        print("$rv is lower than 11 and greter than 0")
    }
    //Q6
    val rnd = List<Int>(6){ Random.nextInt(1,49)}
    val rndSorted = rnd.sorted()
    for (r in rndSorted){
        println(r)
    }
    //Q7
    showHashCode(1)
    //Q8
    val rndm = Random.nextInt(1,6)
    when(rndm){
        1 -> println("die is 1")
        2 -> println("die is 2")
        3 -> println("die is 3")
        in 4..6 -> println("die is greater than 3 ")
    }
    //Q9
    functionCheckObj(133)
    //10
    for (count in 1..10){
        println(multi(count))
    }
    //Q11
    for (cou in 2..12 step 2){
        print(" - $cou")
    }
    //Q12
    val fruits = setOf("apple","pear","orange","apple")
    println("set:")
    println(fruits.count())
    //Q13 By default, Kotlin classes are final – they can’t be inherited. To make a class inheritable, mark it with the open keyword
    // open class Shape --->   class Circle : Shape

    //Q14 val b can be null
    val b:String=""
    println(b?.length ?: 0)
    //Q15
    println("----------list with filtering function ----------")
    val list2=(80..100).toList().filter(::removeBadValues)
    for(li in list2){
        print(" -  $li")
    }
    //Q16 "Safe" (nullable) cast operator
    val y = "test"
    val x: String? = y as? String
    //Q17
    println("\n----------------sequence---------------")
    val seq = sequence {yieldAll(1..20)}
        .filter { it <=11 }
    for (itr in seq){
        print("$itr  ")
    }
    val asc = Array(10){z ->(z*z).toString()}
    asc.forEach { println(it) }
    //Q18 === determines if two references point to the same object
    val aaa="tmk"
    val bbb=aaa
    aaa?.equals(bbb) ?: (bbb === null)
    //Q19 enum class
    println("------enum class ordinal-------")
    println(Signal.SENDING.ordinal)
    println(Signal.OPEN.ordinal)
    println(Signal.CLOSED.ordinal)



}

fun removeBadValues(i: Int): Boolean {
    return i%2==0

}

inline fun multi (x: Int):Int{
    return x*x
}
fun functionCheckObj(obj: Any) {
    if (obj is String){
        println(obj.length)
    }else{
        println("the object is not a string")
    }

}

fun showHashCode(obj: Any) {
    println("${obj.hashCode()}")

}

fun addSum(a:Int,b:Int):Int {
return a+b
}
enum class Signal {OPEN, CLOSED, SENDING}