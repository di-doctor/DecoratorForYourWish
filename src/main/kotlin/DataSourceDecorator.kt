abstract class DataSourceDecorator(val dataSourse: DataSource) : DataSource {
    override fun printData() {
        dataSourse.printData()
    }
}