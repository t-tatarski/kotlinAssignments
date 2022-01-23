abstract class Aircraft {

    abstract fun getName():String
}
class Airplane(private val name:String):Aircraft(){
    override fun getName(): String {
      return name
    }


}