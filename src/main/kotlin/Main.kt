fun main() {
    println(agoToText(150000))
}

fun agoToText(time: Int) = when (time) {
    in 0..60 -> "был(а) только что"
    in 61..3599 -> "был(а) в сети ${time / 60} ${minuteAgo(time)} назад"
    in 3600..86359 -> "был(а) в сети ${time / 3600} ${hoursAgo(time)} назад"
    in 86400..172799 -> "был(а) в сети вчера"
    in 172800..259199 -> "был(а) в сети позавчера"
    else -> "был(а) в сети давно"
}

fun minuteAgo (time: Int) = when (time / 60) {
    1,21,31,41,51 -> "минуту"
    2,3,4,22,23,24,32,33,34,42,43,44,52,53,54 -> "минуты"
    else -> "минут"
}

fun hoursAgo (time: Int) = when (time / 3600) {
    1, 21 -> "час"
    2, 3, 4, 22, 23 -> "часа"
    else -> "часов"
}