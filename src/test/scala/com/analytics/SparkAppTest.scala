package com.example

import org.scalatest.funsuite.AnyFunSuite
import org.apache.spark.sql.SparkSession

class SparkAppTest extends AnyFunSuite {

  test("Spark session should be created") {
    val spark = SparkSession.builder
      .appName("Test")
      .master("local")
      .getOrCreate()

    assert(spark != null)
    spark.stop()
  }
}
