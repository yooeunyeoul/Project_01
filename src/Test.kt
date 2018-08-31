

fun main(args: Array<String>) {
    my()
}

fun my() {
    var a: Int = 10_000;
    var b: Int? = 10_000;
    var c: Int = 10_000;

    println("$a, $b, $c")
    println("a==b :${a === b}") //identity 가 다르다


}