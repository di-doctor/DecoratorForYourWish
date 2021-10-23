class Questionmark(dataSourse: DataSource) : DataSourceDecorator(dataSourse) {

    override fun printData() {
        print("!")
        super.printData()
        print("!")
    }
}