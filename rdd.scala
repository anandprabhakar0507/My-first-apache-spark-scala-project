
val rdd = sc.parallelize(List.range(0,100))

rdd.count()

rdd.take(10)

rdd.collect()
