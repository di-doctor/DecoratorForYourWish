class Questionmark(dataSourse: DataSourse):DataSourseDecorator(dataSourse) {

    override fun printData(data: String) {
        print("!")
        super.printData(data)
        print("!")
    }
}