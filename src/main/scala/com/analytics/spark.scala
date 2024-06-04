package com.example
import org.apache.spark.sql.SparkSession

object SparkApp {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder
      .appName("Scala Spark Application")
      .getOrCreate()

    // Your Spark code here

    spark.stop()
  }
}
