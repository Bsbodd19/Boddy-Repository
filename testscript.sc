import scala.io.Source

val lines = Source.fromFile("caesar.txt").getLinestoVector

println("Read ") + lines.size + " sections.")

val txt = lines.mkString

println("Read " + txt.size + " characters.")

val words = txt.split(""\\W+).filterNot(_.isEmpty)

println("Read " + grouped.size + " unnique words.")

val freqs = grouped.map { case (k, v) => (k, v.size)}
val sorted = freqs.toSeq.sortBy(_._2)

for (wd <- sorted ) {
  println(wd)
}
