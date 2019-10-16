package org.apache.spark.metrics.source

import com.codahale.metrics.{Gauge, MetricRegistry}

class MySource extends Source {
  override def sourceName: String = ???

  override def metricRegistry: MetricRegistry = ???
}
