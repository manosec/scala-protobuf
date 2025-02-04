package example


import protobuf.employeeSchema.NestedEmployeeType
import protobuf.employeeSchema.NestedEmployeeType.Address
import protobuf.employeeSchema.SkillsList
import protobuf.employeeSchema.EmployeeMapDict



object protobufOps {
  def serializer(emp: NestedEmployeeType): Array[Byte] = {
    emp.toByteArray
  }


  def deserializer(bytes: Array[Byte]): NestedEmployeeType = {
    NestedEmployeeType.parseFrom(bytes)
  }
}

object Experiment {
  def main(args: Array[String]) = {
    val emp = NestedEmployeeType(name="manosec", age=12, address=Some(Address(city="bangalore", state="karnataka")), skills=Some(SkillsList(List("java", "scala"))), additional=Some(EmployeeMapDict(Map("xyz" -> "ml engineer", "abc" -> "software engineer"))))

    val bytes = protobufOps.serializer(emp)

    println(s"Byte Data ${bytes}")

    val emp1 = protobufOps.deserializer(bytes)

    println(s"Employee Data ${emp1}")

  }
}