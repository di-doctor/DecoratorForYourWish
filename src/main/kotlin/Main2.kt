fun main() {
    val ds = PrintOnConsole()
    val ds2 = SquareBrackets(PrintOnConsole())
    val ds3 = Questionmark(PrintOnConsole())
    val ds4 = SquareBrackets(Questionmark(PrintOnConsole()))
    val ds5 = Questionmark(SquareBrackets(PrintOnConsole()))

    val listDataSourse = listOf<DataSourse>(ds,ds2,ds3,ds4,ds5)
        listDataSourse.forEach{
            it.printData("Hellow")
            println("")
        }


}