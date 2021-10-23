class PrintOnConsole(val item: String) : DataSource {
    override fun printData() {
        print(item)
    }
}