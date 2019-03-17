name := "CSVtoAVROConvert"

version := "0.1"

scalaVersion := "2.11.8"

val sparkVersion = "2.0.0"


libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % sparkVersion,
"org.apache.spark" % "spark-sql_2.11" % sparkVersion
 
)

libraryDependencies += "com.databricks" %% "spark-avro" % "3.2.0"

