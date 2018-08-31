fun main(args: Array<String>) {
   foo0()

}

fun foo0():String {
    var ints = listOf(0, 1, 2, 3)
    ints.forEach {

        if(it == 1 )return@forEach
        print(it)

    }
    print("""End 바보야
        매우 바보야
    멍청
    """.trimMargin())
    return "df"

}
