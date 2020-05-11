// usage: scala pa.scala Concise is nice

// style 1: normal
// args.foreach(arg => println(arg))

// style 2: explicit arg
// args.foreach((arg: String) => println(arg))

// style 3: more concise
args.foreach(println)
