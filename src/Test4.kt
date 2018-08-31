fun main(args: Array<String>) {

    val data = object{

    }

    println(data)

    CountManager.count++

    CountManager.count++
    CountManager.count++

    println(CountManager.count)


}


object CountManager {
    var count = 0
}

class MyClass : Runnable {
    override fun run() {
        println("hello kotlin")
    }

}

class MyClass2 {
    fun publishFun () = object {
        var x  = 111
    } 
    
    private fun privateFun() = object  {
        var x = 222
    }

    fun print() {
        publishFun()
        privateFun().x

    }
}

data class User(var name: String = "skdodo", var age: Int = 123) {

}

class NoData2(var name: String, var age: Int)

data class NoData(var name2: String, var age3: Int)