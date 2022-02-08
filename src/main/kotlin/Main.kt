import java.util.*
import kotlin.random.Random


fun main(args: Array<String>){

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
    //Q20
    val aircr = Airplane("cessna")
    showClass(aircr)
    //Q21
    val exampleString:String? = null //initialize a nullable variable
    println(exampleString)
    //Q22
// val len: Int = if (x != null) x.length else -1
    //idiomatic version: val len = x?.length ?: -1

//Q23
    for( (ndx, value) in (1..10).withIndex() ){
        println("index: $ndx - - value $value")
    }
    //Q24
    val exmplVal : Int = 3
    if (exmplVal in 1..10){ // eqiuvalent if 1>= i && i<=4
        print(exmplVal)
    }
    //Q25
    println("----- for with descending order -----")
    for (x in 10 downTo 1 step 2){
        print(" - $x ")
    }
    //Q26
    val person = Person("tomek","admin")
    println("\nPerson object components: ")
    println(person.component1())
    println(person.component2())

    // Q27 for(y in 1..100) y+=2   y value is immutable
    // Q28
    val students = arrayOf("adam","beti","cecylia","filip")
    printStudents(*students) //  spread operator added
    /*
    When we call a vararg-function, we can pass arguments one-by-one,
     e.g. asList(1, 2, 3), or, if we already have an array and want to pass its contents to the function,
     we use the spread operator (prefix the array with *):
    */
     //Q29
    val yy = arrayOf(1,2,3,4,5,6)
    val zz = listOf(1,2,3,4,5,6)
    println(yy.size)
    println(yy[3])
    println(yy.indexOf(3))
    //Q30
    val quote = "the eagle has landed"
    println("the length of the quote is ${quote.length}")

    //Q31
    val binStr = "00001111"
    val myInt = binStr.toInt(2)
    val myInt1 = binStr.toInt(3)
    println(" 00001111 -> $myInt")
    //Q32 long immutable creating
    val longVal = 100L
    println(longVal)

    //Q32
    val itmz= listOf(1,2,3,4,5,6,7,8,9,10,11,12)
    val joined = itmz.fold("elements:",{ acc, i -> acc+" "+i})
    for (jo in joined){
        print("${jo}  ")
    }
    //Q33 map
    val countries: MutableMap<Int, String> = mutableMapOf(1 to "poland", 2 to "germany", 3 to "gb", 4 to "france", 5 to "russia")
    print("\n ------ list of countries -------\n")
    countries.forEach{
        k,v->
        println("pos. $k  -  country : $v")
    }
    //or
    for((k,v) in countries){
        println("> $k  -  $v")
    }

    //Q34 filter
    val filterCountries = countries.filterKeys { x -> x>2 }
    for (i in filterCountries){
        println(" >  $i")
    }
    val numbers = listOf(1,2,3,4,5,6,7,8)
    val mul = numbers.map { x-> x*2 }
    for( x in mul){
        println(" $x - ")
    }
    val numbList = listOf(1,2,3,4,5,6,7,8,9,10,11,12)
    val allEven = numbList.filter{it %2==1}
        for ( i in allEven){
            println ("  ${i}  ")
        }




}

fun printStudents(vararg students:String) {
    for(student in students){
        println(student)
    }

}

fun showClass(aircr: Any) {
    println(aircr::class)

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