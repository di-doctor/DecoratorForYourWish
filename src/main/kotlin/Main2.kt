fun main() {
    val ds = PrintOnConsole("Hello")
    val ds2 = SquareBrackets(PrintOnConsole("Hello2"))
    val ds3 = Questionmark(PrintOnConsole("Hello3"))
    val ds4 = SquareBrackets(Questionmark(PrintOnConsole("Hello4")))
    val ds5 = Questionmark(SquareBrackets(PrintOnConsole("Hello5")))

    val listDataSource = listOf(ds, ds2, ds3, ds4, ds5)
    listDataSource.forEachIndexed { index, data ->
        print("${index+1}- ")
        data.printData()
        println("")


    }
}