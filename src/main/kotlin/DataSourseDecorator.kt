abstract class DataSourseDecorator(val dataSourse: DataSourse):DataSourse {
    override fun printData(data: String) {
        dataSourse.printData(data)
    }
}