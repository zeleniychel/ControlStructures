fun main() {
    println(agoToText(86360))
}

fun agoToText(time: Int) = when (time) {
    in 0..60 -> "был(а) только что"
    in 61..3599 -> "был(а) в сети ${time / 60} ${minuteAgo(time)} назад"
    in 3600..86359 -> "был(а) в сети ${time / 3600} ${hoursAgo(time)} назад"
    in 86360..172799 -> "был(а) в сети вчера"
    in 172800..259199 -> "был(а) в сети позавчера"
    else -> "был(а) в сети давно"
}

fun minuteAgo (time: Int) = when {
    time / 60 == 1 -> "минуту"
    time / 60 in 2..4 -> "минуты"
    time / 60 in 4..20 -> "минут"
    (time / 60) % 10 == 1 -> "минуту"
    else -> "минут"
}

fun hoursAgo (time: Int) = when {
    time / 3600 == 1 -> "час"
    time / 3600 in 2..4 -> "часа"
    time / 3600 in 5..20 -> "часов"
    (time / 3600) % 10 == 1 -> "час"
    else -> "часов"
}