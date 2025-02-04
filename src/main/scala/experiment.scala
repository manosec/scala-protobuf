package example


import protobuf.employeeSchema.Employee
import protobuf.employeeSchema.Phone


object protobufOps {
  def serializer(emp: Employee): Array[Byte] = {
    emp.toByteArray
  }


  def deserializer(bytes: Array[Byte]): Employee = {
    Employee.parseFrom(bytes)
  }
}

object Experiment {
  def main(args: Array[String]) = {
    val emp = Employee(name="manosec", age=12, number="1234567890")

    val bytes = protobufOps.serializer(emp)

    println(s"Byte Data ${bytes}")

    val emp1 = protobufOps.deserializer(bytes)

    println(s"Employee Data ${emp1}")

  }
}