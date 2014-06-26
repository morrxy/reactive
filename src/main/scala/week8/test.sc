val f: String => String = { case "ping" => "pong" }

f("ping")
//f("abc")

val f1: PartialFunction[String, String] = { case "ping" => "pong" }
f1("ping")
f1.isDefinedAt("ping")
f1.isDefinedAt("pong")