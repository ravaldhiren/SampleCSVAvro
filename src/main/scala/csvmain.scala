import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf,SparkContext}
import com.databricks.spark.avro._


object csvmain {

  def main(args: Array[String]): Unit = {


    var cnf = new SparkConf().setAppName("Aldcsvamro").setMaster("local[*]")

    val sc = new SparkContext(cnf)

    val sqlContext = new SQLContext(sc)

    import sqlContext.implicits._

    val df = sqlContext.read.format("csv")
        .option("header","true")
        .option("inferSchema","true")
        .load("/Users/dhirenc/Aldermore/sfmtaAVLRawData.csv")

    df.write.avro("/Users/dhirenc/Aldermore/output")


  }

}
