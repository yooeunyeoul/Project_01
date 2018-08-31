const val MY_CONST = "CONST"

@Deprecated(MY_CONST)
fun main(args: Array<String>) {
    var x:  Int = 5;

    val obj = CC(x)
    obj.f()

}

class Customer(var fullname : String ){

}


open class AA(x : Int){
    open fun f() {
        println("aaaaaaaaaaaaaaa")
    }
}

class BB(x:Int) : AA(x)


interface BB2 {
     fun f(){
        println("bbbbbbbbbbbbb")
    }
}

class CC(x: Int) : AA(x), BB2 {
    override fun f() {
        println("1")
        super<BB2>.f()
        println("2")
        super<AA>.f()
        println("3")
    }

}

class Adress {
    val isEmpty:Boolean = false
        get(){
            return field
        }

}